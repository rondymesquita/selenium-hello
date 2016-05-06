package br.com.example.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by rondymesquita on 04/09/2015
 *
 */
public class BaseStep {
	
	protected WebDriver driver;

	public boolean exists(By by){
		return driver.findElements(by).size() > 0;
	}

}
