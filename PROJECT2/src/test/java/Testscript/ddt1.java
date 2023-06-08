package Testscript;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import Testscript.keyrword;
public class ddt1 {
	 public static void main(String[] args) throws IOException {
		// TODO Auto-gsenerated method stub
FileInputStream f=new FileInputStream("D://keys1.xlsx");
XSSFWorkbook wb=new XSSFWorkbook(f);
XSSFSheet ws=wb.getSheet("Sheet1");
keyrword a1=new keyrword();
Iterator<Row>row=ws.iterator();
while(row.hasNext())
{
	Row r=row.next();
String action=r.getCell(3).getStringCellValue();

if(action.equals("launchBrowser"))
{
	a1.launchBrowser();
	
}

else if (action.equals("navigate"))
{
	a1.navigate();
	
}

else if(action.equals("URL"))
{
	a1.URL();
	
}

else if(action.equals("TITLE"))
{
	a1.TITLE();
}

else if(action.equals("Close"))
{
	a1.Close();
	
}	
		}
		

	
	
	
	}

}
