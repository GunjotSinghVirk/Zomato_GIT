package Zomato;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Zomatobase {
	
	public static WebDriver driver;
//	public static WebDriver driver1;
	public static Properties prop;

	public static void initialization() throws IOException
	{
		try {
			//1. Reading file
			FileInputStream fs= new FileInputStream("D:\\workspace\\Saucedemo\\src\\test\\java\\Zomato\\Zomatoconfigurations");
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
//		WebDriverManager.firefoxdriver().setup();
//		driver1 = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	public void terminate()
	{

		driver.quit();
	}


}



