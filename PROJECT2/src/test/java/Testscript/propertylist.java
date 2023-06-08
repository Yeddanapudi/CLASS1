package Testscript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class propertylist {

WebDriver d; 
FileInputStream  f; 
Properties p1;
ChromeOptions opt;

@BeforeTest
public void SetUp()
{
	

//System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
//d=new ChromeDriver();
	 WebDriverManager.chromedriver().setup();
	 ChromeOptions opt=new ChromeOptions();
	 opt.addArguments("--remote-allow-origins=*");
	 
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\WD12\\maven1\\drivers\\chromedriver.exe");
	 		d=new ChromeDriver(opt);

	
	d.manage().window().maximize();


}


@Test(priority=1)
		public void properties() throws IOException
		{
			
		
		f=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\NEWFOLDER\\PROJECT2\\src\\test\\java\\Testscript\\p1.properties");
		p1=new Properties();
		p1.load(f);
		}
@Test(priority=2)
public void navigatePage()
{
	d.get(p1.getProperty("url"));
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
}
@Test(priority=3)
public void Usercredentials()
{
	d.findElement(By.name("username")).sendKeys(p1.getProperty("uname"));
	System.out.println(p1.getProperty("uname"));
	d.findElement(By.name("password")).sendKeys(p1.getProperty("pwd"));
	System.out.println(p1.getProperty("pwd"));
	d.findElement(By.xpath("//*[@type='submit']")).click();
	
}
@AfterTest
public void TearDown()
{
	d.close();
	
}
}
