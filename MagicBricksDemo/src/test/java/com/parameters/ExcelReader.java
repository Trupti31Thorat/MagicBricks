package com.parameters;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

public class ExcelReader {

	public static Map<String, String> getRowData(String SheetName, int rowNum) {
	    Map<String, String> data = new HashMap<>();

	    try (FileInputStream fis = new FileInputStream("C:\\Users\\SHRDEOKA\\eclipse-workspace\\MagicBricksDemo\\src\\test\\resource\\TestData\\HomeInteriors.xlsx");
	         Workbook workbook = new XSSFWorkbook(fis)) {

	        Sheet sheet = workbook.getSheet(SheetName);
	        Row header = sheet.getRow(0);
	        Row row = sheet.getRow(rowNum);

	        for (int i = 0; i < header.getPhysicalNumberOfCells(); i++) {
	            String key = header.getCell(i).getStringCellValue().trim();
	            Cell cell = row.getCell(i);

	            String value = "";
	            switch (cell.getCellType()) {
	                case STRING:
	                    value = cell.getStringCellValue();
	                    break;
	                case NUMERIC:
	                    value = String.valueOf((long) cell.getNumericCellValue()); // Converts 9876543210.0 to 9876543210
	                    break;
	                case BOOLEAN:
	                    value = String.valueOf(cell.getBooleanCellValue());
	                    break;
	                case FORMULA:
	                    value = cell.getCellFormula();
	                    break;
	                default:
	                    value = "";
	            }

	            data.put(key, value.trim());
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return data;
	}

}


