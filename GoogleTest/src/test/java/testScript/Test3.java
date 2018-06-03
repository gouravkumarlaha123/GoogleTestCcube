package testScript;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.GoogleHomePO;
import pom.GoogleSearchResultPO;

public class Test3 extends BaseTest {
	
	@Test
	public void testTwitter() {
		try {
			driver.get("https://www.google.com/");
			GoogleHomePO googleHomePO=new GoogleHomePO(driver);
			googleHomePO.searchTxtBx().sendKeys("twitter"+Keys.ENTER);
			GoogleSearchResultPO googleSearchResultPO=new GoogleSearchResultPO(driver);
			googleSearchResultPO.twitterLink().click();
			String eTitle="Login on Twitter";
			String aTitle = driver.getTitle();
			Assert.assertEquals(aTitle, eTitle);
			Reporter.log("Twitter is pass", true);
		} catch (Exception e) {
			Reporter.log("Exception Generated", true);
			Assert.fail();
		}
	}

}
