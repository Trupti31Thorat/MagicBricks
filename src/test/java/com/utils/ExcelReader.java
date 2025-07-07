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
}
