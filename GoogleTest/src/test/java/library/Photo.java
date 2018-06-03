package library;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Photo {
	
	public static void getScreenShot(WebDriver driver, String folderPath) {
		SimpleDateFormat s=new SimpleDateFormat("MM-dd-yyyy hh-mm-ss");
		String dateTime=s.format(new Date());
		TakesScreenshot t=(TakesScreenshot) driver;
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		File destFile=new File(folderPath+dateTime+".png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			
		}
		
	}

}
