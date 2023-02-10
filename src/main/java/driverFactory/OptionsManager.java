package driverFactory;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class OptionsManager {
	private Properties prop;
	private ChromeOptions chromeOptopns;
	private FirefoxOptions firefoxOptions;
	private EdgeOptions edgeOptions;

	public OptionsManager(Properties prop) {
		this.prop = prop;
	}

	public ChromeOptions getChromeOptions() {
		chromeOptopns = new ChromeOptions();
		if (Boolean.parseBoolean(prop.getProperty("headless"))) chromeOptopns.addArguments("--headless");
		if (Boolean.parseBoolean(prop.getProperty("incognito"))) chromeOptopns.addArguments("--incognito");
		return chromeOptopns;
	}

	public FirefoxOptions getFirefoxOptions() {
		firefoxOptions = new FirefoxOptions();
		if (Boolean.parseBoolean(prop.getProperty("headleass"))) firefoxOptions.addArguments("--headless");
		if (Boolean.parseBoolean(prop.getProperty("incognito"))) firefoxOptions.addArguments("--incognito");
		return firefoxOptions;
	}
	public EdgeOptions getEdgeOptions() {
		edgeOptions = new EdgeOptions();
		if (Boolean.parseBoolean(prop.getProperty("headleass"))) edgeOptions.addArguments("--headless");
		if (Boolean.parseBoolean(prop.getProperty("incognito"))) edgeOptions.addArguments("--incognito");
		return edgeOptions;
	}

}
