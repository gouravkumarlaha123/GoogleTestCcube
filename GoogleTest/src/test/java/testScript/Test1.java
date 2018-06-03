package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.GoogleHomePO;
import pom.GoogleSearchResultPO;

public class Test1 extends BaseTest {
	
	@Test
	public void testFacebook() {
		try {
			driver.get("https://www.google.com/");
			GoogleHomePO googleHomePO=new GoogleHomePO(driver);
			googleHomePO.searchTxtBx().sendKeys("facebook"+Keys.ENTER);
			GoogleSearchResultPO googleSearchResultPO=new GoogleSearchResultPO(driver);
			googleSearchResultPO.facebookLink().click();
			String eTitle="Facebook – log in or sign up";
			String aTitle = driver.getTitle();
			Assert.assertEquals(aTitle, eTitle);
			Reporter.log("Facebook is pass", true);
		} catch (Exception e) {
			Reporter.log("Exception Generated", true);
			Assert.fail();			
		}
	}

}
