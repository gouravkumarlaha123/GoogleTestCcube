package testScript;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.GoogleHomePO;
import pom.GoogleSearchResultPO;

public class Test2 extends BaseTest {
	
	@Test
	public void instaTest() {
	
			try {
				driver.get("https://www.google.com/");
				GoogleHomePO googleHomePO=new GoogleHomePO(driver);
				googleHomePO.searchTxtBx().sendKeys("instagram"+Keys.ENTER);
				GoogleSearchResultPO googleSearchResultPO=new GoogleSearchResultPO(driver);
				googleSearchResultPO.instaLink().click();
				String eTitle="Instagram1";
				String aTitle = driver.getTitle();
				Assert.assertEquals(aTitle, eTitle);
				Reporter.log("Instagram is pass", true);
			} catch (Exception e) {
				Reporter.log("Exception generated", true);
				Assert.fail();
			}
			
		
	}

}
