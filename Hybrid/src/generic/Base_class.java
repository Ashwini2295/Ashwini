package generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_class implements Framework_constants
{
	public WebDriver driver;
	@BeforeMethod
	public void open()
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}

	@AfterMethod
	public void close(ITestResult res) throws InterruptedException, IOException
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			Generic_screenshot.getPhoto(driver);
		}
		Thread.sleep(4000);
		driver.close();
	}
}
