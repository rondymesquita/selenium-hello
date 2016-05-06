package br.com.example.driver;

import io.selendroid.client.SelendroidDriver;
import io.selendroid.standalone.SelendroidLauncher;

import java.net.URL;

import org.openqa.selenium.WebDriver;

import br.com.example.mobile.MobileCapabilities;

/**
 * Created by rondymesquita on 06/09/2015
 *
 */
public class SelendroidDriverImpl implements AbstractDriver{

	private SelendroidDriver selendroidDriver = null;
	private SelendroidLauncher selendroidServer = null;
	
	public WebDriver getDriver() {
		try {
			quitDriver();
//			SelendroidConfiguration config = new SelendroidConfiguration();
//			selendroidServer = new SelendroidLauncher(config);
//			selendroidServer.launchSelendroid();
			
			selendroidDriver = new SelendroidDriver(new URL("http://0.0.0.0:4444/wd/hub/"), MobileCapabilities.build());
			return selendroidDriver;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void quitDriver() {
		if(selendroidDriver != null){
			selendroidDriver.close();
			selendroidDriver.quit();
		}
		if (selendroidServer != null) {
			selendroidServer.stopSelendroid();
		}
	}

}
