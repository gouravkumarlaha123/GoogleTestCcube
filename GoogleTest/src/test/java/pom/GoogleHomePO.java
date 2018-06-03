package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.Basepage;

public class GoogleHomePO extends Basepage {
	public GoogleHomePO(WebDriver driver) {
		super(driver);		
	}	
	@FindBy(name="q")
	private WebElement searchTxtBx;
	public WebElement searchTxtBx() {
		return searchTxtBx;		
	}
}
