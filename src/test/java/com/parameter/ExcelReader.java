package com.parameter;

import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelReader {

    public static List<List<String>> getData(String filePath, String sheetName) {
        List<List<String>> data = new ArrayList<>();
        try {
            FileInputStream file = new FileInputStream(new File(filePath));
            Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheet(sheetName);

            // Skip header
            int rows = sheet.getPhysicalNumberOfRows();
            for (int i = 1; i < rows; i++) {
                Row row = sheet.getRow(i);
                List<String> rowData = new ArrayList<>();
                short cols = row.getLastCellNum();
                for (int j = 0; j < cols; j++) {
                    Cell cell = row.getCell(j, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                    switch (cell.getCellType()) {
                        case STRING:
                            rowData.add(cell.getStringCellValue());
                            break;
                        case NUMERIC:
                            rowData.add(String.valueOf((int) cell.getNumericCellValue()));
                            break;
                        default:
                            rowData.add("");
                    }
                }
                data.add(rowData);
            }

            workbook.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}