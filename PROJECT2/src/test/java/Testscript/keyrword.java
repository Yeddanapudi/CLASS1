package Testscript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyrword {
	WebDriver d; 


	public void launchBrowser()
	{
		 WebDriverManager.chromedriver().setup();
		 ChromeOptions opt=new ChromeOptions();
		 opt.addArguments("--remote-allow-origins=*");
		 
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\WD12\\maven1\\drivers\\chromedriver.exe");
		d=new ChromeDriver(opt);

	}
	public void navigate()
	{
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}

public void URL()
{

	System.out.println(d.getCurrentUrl());
	
}
public void TITLE()
{
	String title=d.getTitle();
	System.out.println(title);
}

public void Close()
{
	d.close();
	
}
}
