package com.utility;

import com.relevantcodes.extentreports.ExtentReports;


import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentManager {

    private static ExtentReports extent; 
    private static String reportFolderPath;

    public static ExtentReports getInstance() {
        if (extent == null) {
            String timestamp = new SimpleDateFormat("dd-MM-yy HH-mm-ss").format(new Date());
            reportFolderPath = System.getProperty("user.dir") + "/Report/LogData " + timestamp;

            String reportPath = reportFolderPath + "/LoginReport.html";
            extent = new ExtentReports(reportPath, true);
            extent.addSystemInfo("User", "rsing124")
                  .addSystemInfo("Build", "Windows")
                  .addSystemInfo("AppName", "Eclipse");
        }
        return extent;
    }

    public static String getReportFolderPath() {
        return reportFolderPath;
    }
}