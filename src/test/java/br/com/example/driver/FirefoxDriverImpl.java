package br.com.example.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by rondymesquita on 06/09/2015
 *
 */
public class FirefoxDriverImpl implements AbstractDriver{
	
	private FirefoxDriver driver;
	
	public WebDriver getDriver() {
		quitDriver();
		driver = new FirefoxDriver();
		return driver;
	}

	public void quitDriver() {
		if(driver != null){
			driver.close();
			driver.quit();
		}
	}

}
