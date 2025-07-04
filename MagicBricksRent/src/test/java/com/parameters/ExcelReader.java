package com.parameters;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExcelReader {

    private static Workbook workbook;

    public static String getCellData(String sheetName, int row, int col) {
        try {
            FileInputStream fis = new FileInputStream("src/test/resources/ExcelData/Data.xlsx");
            workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheet(sheetName);
            Row r = sheet.getRow(row);
            Cell c = r.getCell(col);

            DataFormatter formatter = new DataFormatter();
            return formatter.formatCellValue(c);

        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
