<<<<<<< HEAD


package com.utils;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

    public static String[] getContactFormData() {
        return getData("C:\\Users\\TRTHORAT\\OneDrive - Capgemini\\Desktop\\Sprint\\MagicBricsMbAdviceTesting\\src\\test\\resource\\ExcelTestData\\Localities.xlsx", "Trends");
   
   
    }

    
    public static String[] getInvalidContactFormData() {
       
   
    return getData("C:\\Users\\TRTHORAT\\OneDrive - Capgemini\\Desktop\\Sprint\\MagicBricsMbAdviceTesting\\src\\test\\resource\\ExcelTestData\\Localities.xlsx", "InvalidData");
    }
    
    private static String[] getData(String path, String sheetName) {
        String[] data = new String[5];
        try {
            FileInputStream fis = new FileInputStream(path);
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheet(sheetName);

            Row row = sheet.getRow(1); // assuming data is in row 2 (index 1)
            for (int i = 0; i < 5; i++) {
                Cell cell = row.getCell(i);
                data[i] = (cell.getCellType() == CellType.NUMERIC)
                        ? String.valueOf((long) cell.getNumericCellValue())
                        : cell.getStringCellValue();
                        
                        
              
                          }

            workbook.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
    
    
    
    /*
    private static String[] getData(String path, String sheetName) {
        String[] data = new String[5];
        try {
            FileInputStream fis = new FileInputStream(path);
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheet(sheetName);
            Row row = sheet.getRow(1); // row index 1 = second row

            for (int i = 0; i < 5; i++) {
                Cell cell = row.getCell(i);
                data[i] = getCellValueAsString(cell);
            }

            workbook.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    private static String getCellValueAsString(Cell cell) {
        if (cell == null) return "";

        
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                return String.valueOf((long) cell.getNumericCellValue()); // avoid .0
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                return cell.getCellFormula();
            case BLANK:
                return "";
            default:
                return cell.toString();
        }
    }
*/
=======
package com.utils;

import java.io.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
    public static String getCityFromExcel( String sheetName, int rowNum, int cellNum) {
        try (FileInputStream fis = new FileInputStream("C:\\Users\\TRTHORAT\\OneDrive - Capgemini\\Desktop\\Sprint\\MagicBricsMbAdviceTesting\\src\\test\\resource\\ExcelTestData\\Localities.xlsx");
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheet(sheetName);
            return sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
        } catch (IOException e) {
            throw new RuntimeException("Failed to read Excel", e);
        }
    }
>>>>>>> 6f304837b531716b8c9fa5d00444a260dc41f325
}
