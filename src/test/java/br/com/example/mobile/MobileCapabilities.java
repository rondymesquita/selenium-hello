package br.com.example.mobile;

import io.selendroid.common.SelendroidCapabilities;
import io.selendroid.common.device.DeviceTargetPlatform;

import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by rondymesquita on 05/09/2015
 *
 */
public class MobileCapabilities {

	private static DesiredCapabilities desiredCapabilities;
	
	public static DesiredCapabilities build(){
		desiredCapabilities = SelendroidCapabilities.android();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "MotoX");
		desiredCapabilities.setCapability("version", "23.0.0");
		desiredCapabilities.setCapability("browser", "chrome"); 
		desiredCapabilities.setCapability("browserName", "chrome"); 
//		desiredCapabilities.setCapability("app", appFile.getAbsolutePath());
		return desiredCapabilities;
	}
	
}
