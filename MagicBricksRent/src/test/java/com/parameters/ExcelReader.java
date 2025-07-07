/*
package com.parameters;

import java.io.File;
import java.io.FileInputStream; 

import org.apache.poi.ss.usermodel.*;

public class ExcelReader {

	public static String[] getContactFormData() {
	    String[] data = new String[3];
	    try {
	        FileInputStream fis = new FileInputStream("src/test/resource/ExcelData/ContactFormData.xlsx");
	        Workbook workbook = WorkbookFactory.create(fis);
	        Sheet sheet = workbook.getSheetAt(0);
	        Row row = sheet.getRow(1); // Assuming second row

	        for (int i = 0; i < 3; i++) {
	            Cell cell = row.getCell(i);
	            if (cell.getCellType() == CellType.STRING) {
	                data[i] = cell.getStringCellValue();
	            } else if (cell.getCellType() == CellType.NUMERIC) {
	                data[i] = String.valueOf((long) cell.getNumericCellValue()); // cast to long to remove decimals
	            }
	        }

	        workbook.close();
	        fis.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return data;
	}
}

*/

//3rd Scenario


package com.parameters;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.*;

public class ExcelReader {

    // For valid data (1st row)
    public static String[] getValidContactFormData() {
        return getRowData(1);
    }

    // For invalid data (2nd row)
    public static String[] getInvalidContactFormData() {
        return getRowData(2);
    }

    private static String[] getRowData(int rowNum) {
        String[] data = new String[3];
        try {
            FileInputStream fis = new FileInputStream("src/test/resource/ExcelData/ContactFormData.xlsx");
            Workbook workbook = WorkbookFactory.create(fis);
            Sheet sheet = workbook.getSheetAt(0);
            Row row = sheet.getRow(rowNum); // 1 = second row, 2 = third, etc.

            for (int i = 0; i < 3; i++) {
                Cell cell = row.getCell(i);
                if (cell.getCellType() == CellType.STRING) {
                    data[i] = cell.getStringCellValue();
                } else if (cell.getCellType() == CellType.NUMERIC) {
                    data[i] = String.valueOf((long) cell.getNumericCellValue());
                }
            }

            workbook.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
    
    
    
   
//6th Scenario
    public String getCellValue(String sheetName, String columnName, int rowIndex) {
        try {
            FileInputStream fis = new FileInputStream("src/test/resource/ExcelData/ContactFormData.xlsx");
            Workbook workbook = WorkbookFactory.create(fis);
            Sheet sheet = workbook.getSheet(sheetName);
            Row headerRow = sheet.getRow(0);
            int colNum = -1;

            for (Cell cell : headerRow) {
                if (cell.getStringCellValue().trim().equalsIgnoreCase(columnName)) {
                    colNum = cell.getColumnIndex();
                    break;
                }
            }

            if (colNum == -1) throw new RuntimeException("Column not found");

            Row dataRow = sheet.getRow(rowIndex);
            Cell cell = dataRow.getCell(colNum);

            return cell.getStringCellValue();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    
}

