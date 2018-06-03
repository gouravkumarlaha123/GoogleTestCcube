package testScript;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.GoogleHomePO;
import pom.GoogleSearchResultPO;

public class Test4 extends BaseTest {
	
	@Test
	public void testLinkedIn() {
		try {
			driver.get("https://www.google.com/");
			GoogleHomePO googleHomePO=new GoogleHomePO(driver);
			googleHomePO.searchTxtBx().sendKeys("Linkedin"+Keys.ENTER);
			GoogleSearchResultPO googleSearchResultPO=new GoogleSearchResultPO(driver);
			googleSearchResultPO.linkedInLink().click();
			String eTitle="Sign Up | LinkedIn1";
			String aTitle = driver.getTitle();
			Assert.assertEquals(aTitle, eTitle);
			Reporter.log("LinkedIn is pass", true);
		} catch (Exception e) {
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
	}

}
