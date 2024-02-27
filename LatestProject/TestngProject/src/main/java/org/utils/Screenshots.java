package org.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.baseclass.BaseClass;

public class Screenshots extends BaseClass {
        
    public static void ScreenCapture() throws IOException
    {
        File scrFile=TakesScreenshot();
        Date d = new Date();
        System.out.println(d.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HHmmss");   
       
        // Now you can do whatever you need to do with it, for example copy somewhere
        FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"\\screenshot\\"+sdf.format(d)+".png"));

    }
    

}