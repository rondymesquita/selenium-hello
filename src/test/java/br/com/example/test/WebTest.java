package br.com.example.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.com.example.config.BaseStep;
import br.com.example.config.Driver;
import br.com.example.page.DuckDuckGoPage;

/*
 * Basic functional test with selenium using junit
 * 
 * Test name should be
 * 		Test*
 *		*Test
 *		*TestCase
 */
public class WebTest extends BaseStep{

	private DuckDuckGoPage duckDuckGoPage;

	@Before
	public void before(){
		driver = Driver.getInstance();
		duckDuckGoPage = new DuckDuckGoPage(driver);
	}
	
	@After
	public void after(){
		Driver.quit();
	}
	
	/*
	 * Using Page Objects
	 */
	@Test
	public void shouldDoASearchOnDuckDuckGoUsingPageObjectsApproach(){
		duckDuckGoPage.open();
		
		duckDuckGoPage.setSearchField("Darth Vader");
		duckDuckGoPage.clickOnSearchButton();
		
		driver.getPageSource().contains("Darth Vader");
	}
	
	@Test
	public void shouldDoASearchOnDuckDuckGo(){
		driver.get("https://duckduckgo.com");
		 
		WebElement searchField = driver.findElement(By.id("search_form_input_homepage"));
		searchField.sendKeys("Darth Vader");
		
		driver.findElement(By.id("search_button_homepage")).click();
		driver.getPageSource().contains("Darth Vader");
	}

}
