package br.com.example.config;

import java.lang.reflect.Constructor;

import org.openqa.selenium.WebDriver;

import br.com.example.driver.AbstractDriver;

public class Driver {

	private static WebDriver webDriver;
	private static AbstractDriver abstractDriver;
	private static final String FIREFOX = "firefox";
	private static final String APPIUM = "appium";
	private static final String SELENDROID = "selendroid";

	private Driver() {

	}

	public static WebDriver getInstance() {
		if (webDriver == null) {

			Logger.logInfo(String.format("Selected driver: %s", System.getProperty("driver")));
			
			String driver = System.getProperty("driver") != null ? System.getProperty("driver") : FIREFOX;

			webDriver = getWebDriverByDriverName(driver);

			Logger.logInfo(String.format("Running with %s driver", driver));

		}
		return webDriver;
	}

	public static void quit() {
		if (abstractDriver != null) {
			abstractDriver.quitDriver();
			Logger.logInfo("Driver stopped");
		}
	}

	private static WebDriver getWebDriverByDriverName(String driverName) {
		Class cl;
		try {
			cl = Class.forName(String.format("br.com.example.driver.%sDriverImpl", capitalize(driverName)));
			Constructor con = cl.getConstructor(null);
			abstractDriver = (AbstractDriver) con.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return abstractDriver.getDriver();
	}

	private static String capitalize(final String line) {
		return Character.toUpperCase(line.charAt(0)) + line.substring(1);
	}

}
