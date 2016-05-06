package br.com.example.driver;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.selendroid.server.model.AndroidElement;

import org.openqa.selenium.WebDriver;

import br.com.example.mobile.MobileCapabilities;


/**
 * Created by rondymesquita on 06/09/2015
 *
 */
public class AppiumDriverImpl implements AbstractDriver{
	
	private AndroidDriver driver;
	
	public WebDriver getDriver() {
		try {
			quitDriver();
			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"), MobileCapabilities.build());
			return driver;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void quitDriver() {
		if(driver != null){
			driver.close();
			driver.quit();
		}
		
	}

}
