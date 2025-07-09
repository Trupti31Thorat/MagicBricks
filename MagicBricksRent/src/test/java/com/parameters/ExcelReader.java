package com.parameters;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;

public class ExcelReader {

    //For outline
    
    public static String getCellValue(String filePath, String sheetName, int rowNum, int colNum) {
        try (FileInputStream fis = new FileInputStream(filePath)) {
            Workbook workbook = WorkbookFactory.create(fis);
            Sheet sheet = workbook.getSheet(sheetName);
            Row row = sheet.getRow(rowNum);
            Cell cell = row.getCell(colNum);

            String value = new DataFormatter().formatCellValue(cell);
            System.out.println("Reading from Excel [Sheet: " + sheetName + ", Row: " + rowNum + ", Col: " + colNum + "] = " + value);

            return value;
        } catch (Exception e) {
            System.out.println("Error reading Excel: " + e.getMessage());
            e.printStackTrace();
            return "";
        }
    }
    

    //For Excel 
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

    //For Excel
    
    public static String[] getValidContactFormData() {
        return getRowData(1);
    }

    public static String[] getInvalidContactFormData() {
        return getRowData(2);
    }

    private static String[] getRowData(int rowNum) {
        String[] data = new String[3];
        try {
            FileInputStream fis = new FileInputStream("src/test/resource/ExcelData/ContactFormData.xlsx");
            Workbook workbook = WorkbookFactory.create(fis);
            Sheet sheet = workbook.getSheetAt(0);
            Row row = sheet.getRow(rowNum); // 1 = second row, 2 = third

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
    
}