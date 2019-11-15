package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BaseClass {

	
	@FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[text()='Women']") 
	private WebElement womenPageTab;
	
	
	@FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[text()='Dresses']") 
	private WebElement dressesPageTab;
	
	
	@FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[text()='T-shirts']") 
	private WebElement tShirtPageTab;
	
	
	
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}

	
	public boolean iswomenPageTabPresent()
	
	{
		return elementFound(womenPageTab);
	}
	
    public boolean isdressesPageTabPresent()
	
	{
		return elementFound(dressesPageTab);
	}

    public boolean istShirtPageTabPresent()

    {
    	return elementFound(tShirtPageTab);
    }
	
	
	
}
