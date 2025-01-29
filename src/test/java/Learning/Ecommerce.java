package Learning;


import org.testng.annotations.Test;

import pages.Blaze;


public class Ecommerce extends BaseTest  {
	public Blaze bl;
	
	@Test
	public void customerJourney()
	{
	bl=new Blaze(driver);
	bl.homePage();
	bl.scrollTheWindow();
	bl.productListPage();
	bl.productDetailsPage();
	bl.waitTillTheAlertPresent();
	bl.accessAlert();
	
	}
	
	
	
}
