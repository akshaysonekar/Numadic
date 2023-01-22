package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	public static WebDriver openChromeBrowser() {
		//System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		WebDriver driver =new ChromeDriver(options);
		driver.navigate().to("https://jobs.numadic.com/jobs/Careers");;
		driver.manage().window().maximize();
		
		return driver;
	}
	public static void main(String[] args) {
		Browser.openChromeBrowser();
	}

}
