package basePageinit;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	 public WebDriver driver; 
     public Properties prop ;
	public WebDriver InitializeDriver() throws IOException {
		
	    prop =  new Properties();
		FileInputStream file  =  new FileInputStream("D:\\Softwares\\Eclipse-java\\microlandAmazon\\src\\test\\resources\\data.properties");
		prop.load(file);
	    String browserUrl	= prop.getProperty("url");
		
		String browserName  =  prop.getProperty("browser");
		browserName.equals("chrome");
		
			System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
			driver = new ChromeDriver();
			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(browserUrl);
		
		return driver;
		
	}

}
