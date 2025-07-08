package com.loginparameters;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader1 {

    public Map<String, String> getRowData(String fileName, String sheetName, int rowNum) {
        Map<String, String> rowData = new HashMap<>();

        try {
            String path = "C:\\Users\\SHRDEOKA\\eclipse-workspace\\MagicBricksDemo\\src\\test\\resource\\TestData\\" + fileName;
            File file = new File(path);
            FileInputStream fis = new FileInputStream(file);
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheet(sheetName);

            if (sheet == null) {
                throw new RuntimeException("❌ Sheet '" + sheetName + "' not found.");
            }

            Row headerRow = sheet.getRow(0);
            Row dataRow = sheet.getRow(rowNum);

            if (dataRow == null) {
                throw new RuntimeException("❌ Row " + rowNum + " not found.");
            }

            DataFormatter formatter = new DataFormatter();

            for (int i = 0; i < headerRow.getLastCellNum(); i++) {
                Cell headerCell = headerRow.getCell(i);
                Cell valueCell = dataRow.getCell(i);

                if (headerCell != null) {
                    String key = formatter.formatCellValue(headerCell).trim();
                    String value = valueCell != null ? formatter.formatCellValue(valueCell).trim() : "";
                    rowData.put(key, value);
                }
            }

            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("❌ Failed to read Excel data: " + e.getMessage());
        }

        return rowData;
    }

    public String getMobileNumber(String fileName, String sheetName, int rowNum) {
        Map<String, String> rowData = getRowData(fileName, sheetName, rowNum);
        return rowData.get("Mobile");
    }
}
