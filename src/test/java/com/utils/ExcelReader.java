<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/MbAdvice
>>>>>>> origin/MbAdvice


package com.utils;


import org.apache.poi.ss.usermodel.*;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/MbAdvice
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
<<<<<<< HEAD
=======
=======
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

>>>>>>> origin/MbAdvice
>>>>>>> origin/MbAdvice
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

    public static String[] getContactFormData() {
        return getData("C:\\Users\\TRTHORAT\\OneDrive - Capgemini\\Desktop\\Sprint\\MagicBricsMbAdviceTesting\\src\\test\\resource\\ExcelTestData\\Localities.xlsx", "Trends");
   
   
    }

    
    public static String[] getInvalidContactFormData() {
       
   
    return getData("C:\\Users\\TRTHORAT\\OneDrive - Capgemini\\Desktop\\Sprint\\MagicBricsMbAdviceTesting\\src\\test\\resource\\ExcelTestData\\Localities.xlsx", "InvalidData");
    }
    
<<<<<<< HEAD
    
    
    public static String[] getData(String path, String sheetName) {
=======
<<<<<<< HEAD
    
    
    public static String[] getData(String path, String sheetName) {
=======
    private static String[] getData(String path, String sheetName) {
>>>>>>> origin/MbAdvice
>>>>>>> origin/MbAdvice
        String[] data = new String[5];
        try {
            FileInputStream fis = new FileInputStream(path);
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheet(sheetName);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/MbAdvice
            DataFormatter formatter = new DataFormatter();
            Row row = sheet.getRow(1); // assuming data is in row 2 (index 1)
            for (int i = 0; i < 5; i++) {
                data[i] = formatter.formatCellValue(row.getCell(i));
            }
<<<<<<< HEAD
=======
=======

            Row row = sheet.getRow(1); // assuming data is in row 2 (index 1)
            for (int i = 0; i < 5; i++) {
                Cell cell = row.getCell(i);
                data[i] = (cell.getCellType() == CellType.NUMERIC)
                        ? String.valueOf((long) cell.getNumericCellValue())
                        : cell.getStringCellValue();
                        
                        
              
                          }
>>>>>>> origin/MbAdvice
>>>>>>> origin/MbAdvice

            workbook.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/MbAdvice
        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);
        System.out.println(data[4]);
        return data;
    }
    
<<<<<<< HEAD
   
    
    
=======
>>>>>>> origin/MbAdvice
	public static String[] loginReader(String s) throws IOException
	{
		String path = "C:\\Users\\TRTHORAT\\OneDrive - Capgemini\\Desktop\\Sprint\\MagicBricsMbAdviceTesting\\src\\test\\resource\\ExcelTestData\\"+s;
        String cred[] = new String[5];
 
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook work  = new XSSFWorkbook(fis);
        XSSFSheet excel = work.getSheetAt(0);
        
        DataFormatter formatter = new DataFormatter();
        cred[0] = formatter.formatCellValue(excel.getRow(1).getCell(0));
        cred[1] = formatter.formatCellValue(excel.getRow(1).getCell(1));
        cred[2] = formatter.formatCellValue(excel.getRow(1).getCell(2));
        cred[3] = formatter.formatCellValue(excel.getRow(1).getCell(3));
        cred[4] = formatter.formatCellValue(excel.getRow(1).getCell(4));
 
        work.close();
        return cred;
        
	
}
    
    
<<<<<<< HEAD
    
    

=======
=======
        return data;
    }
    
>>>>>>> origin/MbAdvice
    
    
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
<<<<<<< HEAD
=======
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
>>>>>>> origin/MbAdvice
>>>>>>> origin/MbAdvice
}
