package LoginTest;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import GenericsUtility.BaseClass;
import GenericsUtility.ExcelUtility;
import GenericsUtility.FileUtility;


public class ToVerifyHomePageTest extends BaseClass {
	    @Test 
	    public void demoTest()  throws EncryptedDocumentException, IOException {
		
		String expectedTitle = eUtils.TtoFetchDataFromExcelUtility("Sheet1", 2, 0);
		wUtils.waitForTitle(driver,"Enter");//EXPLICITWAIT
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		System.out.println(expectedTitle);
		
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("pass :the title is verified");
	}
	

}
