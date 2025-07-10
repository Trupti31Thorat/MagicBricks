package com.loginparameters;

import java.io.File;
import java.io.FileInputStream;
import java.util.Map;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader1 {

    public String getMobileNumber(String sheetName, int rowNum) {
        String mobile = null;

        try {
            File file = new File("C:\\Users\\SHRDEOKA\\eclipse-workspace\\MagicBricksDemo\\src\\test\\resource\\TestData\\LoginData.xlsx");
            System.out.println("Excel file exist: "+file.exists());
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
                if (headerCell != null && headerCell.getStringCellValue().trim().equalsIgnoreCase("Mobile")) {
                    Cell valueCell = dataRow.getCell(i);
                    if (valueCell != null) {
                        mobile = formatter.formatCellValue(valueCell).trim();  // ✅ Safe and non-deprecated
                        break;
                    }
                }
            }
      
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("❌ Failed to fetch mobile number: " + e.getMessage());
        }

        return mobile;
    }

	
}

