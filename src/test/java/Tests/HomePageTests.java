package Tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import PageObjects.BaseClass;
import PageObjects.HomePageObjects;

public class HomePageTests  {
	
	HomePageObjects homePage;
	BaseClass bp;

	public HomePageTests() {
		homePage = new HomePageObjects();
		bp = new BaseClass();
	}


	@Test(enabled = true)
	public void VerifyIsWomenTabPresent()
	
	{
		boolean presenceStatus = homePage.iswomenPageTabPresent();
			
		Assert.assertEquals(presenceStatus, true, "Womens Tab not Present");
	}
	
	@Test(enabled = true)
	public void VerifyIsDressesTabPresent()
	
	{
		boolean presenceStatus = homePage.isdressesPageTabPresent();
		
		Assert.assertEquals(presenceStatus, true, "Dresses Tab not Present");
	}
	
	@Test(enabled = true)
	public void VerifyIsTShirtTabPresent()
	
	{
		boolean presenceStatus = homePage.istShirtPageTabPresent();
		
		Assert.assertEquals(presenceStatus, true, "TShirts Tab not Present");
	}
	
	@AfterTest
	public void CloseBrowser()
	{
		homePage.quitDriver();
		
	}
	

}
