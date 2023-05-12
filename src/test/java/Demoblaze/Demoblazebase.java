package Demoblaze;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demoblazebase {
	
	public static WebDriver driver;
	public static Properties prop;


	public static void initialization() throws IOException
	{
		try {
			//1. Reading file
			FileInputStream fs= new FileInputStream("D:\\workspace\\Saucedemo\\src\\test\\java\\Demoblaze\\Demoblazeconfigurations.properties");
			prop = new Properties();
			prop.load(fs);
		} catch (FileNotFoundException e) {
			System.out.println("File not available");
		}

		//2. Create Properties class object to read this file object
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		driver = new ChromeDriver(chromeOptions);
		//properties object can be used to fetch the value using getProperty method
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	public void terminate()
	{
		driver.quit();
	}


}
