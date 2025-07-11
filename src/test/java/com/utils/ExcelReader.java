

package com.utils;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

    public static String[] getContactFormData() {
        return getData("C:\\Users\\TRTHORAT\\OneDrive - Capgemini\\Desktop\\Sprint\\MagicBricsMbAdviceTesting\\src\\test\\resource\\ExcelTestData\\Localities.xlsx", "Trends");
   
   
    }

    
    public static String[] getInvalidContactFormData() {
       
   
    return getData("C:\\Users\\TRTHORAT\\OneDrive - Capgemini\\Desktop\\Sprint\\MagicBricsMbAdviceTesting\\src\\test\\resource\\ExcelTestData\\Localities.xlsx", "InvalidData");
    }
    
    
    
    public static String[] getData(String path, String sheetName) {
        String[] data = new String[5];
        try {
            FileInputStream fis = new FileInputStream(path);
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheet(sheetName);
            DataFormatter formatter = new DataFormatter();
            Row row = sheet.getRow(1); // assuming data is in row 2 (index 1)
            for (int i = 0; i < 5; i++) {
                data[i] = formatter.formatCellValue(row.getCell(i));
            }

            workbook.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);
        System.out.println(data[4]);
        return data;
    }
    
   
    
    
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
    
    
    
    

}
