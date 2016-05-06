package br.com.example.driver;

import org.openqa.selenium.WebDriver;

/**
 * Created by rondymesquita on 06/09/2015
 *
 */
public interface AbstractDriver {
	
	public WebDriver getDriver();
	public void quitDriver();

}
