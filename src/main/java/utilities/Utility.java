package utilities;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import core.Base;

public class Utility extends Base {

	
	public static void takeScreenshot( String fileName) throws IOException {
		
	String path = ".\\output.\\screenShots";
	
	File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE)	;
	
	FileUtils.copyFile(file, new File(path + fileName + ".png"));
	}
}
