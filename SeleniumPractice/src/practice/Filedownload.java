package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Filedownload {

	public static void main(String[] args) {
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip");
		WebDriver driver=new FirefoxDriver(profile);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://docs.seleniumhq.org/download/");
		driver.findElement(By.id("close")).click();
		driver.findElement(By.xpath("//td[.='Java']/..//td//a[.='Download']")).click();
		
		
		
	}

}
