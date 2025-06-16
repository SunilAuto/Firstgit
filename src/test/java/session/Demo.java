package session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
 
		String projectpath=System.getProperty("user.dir");
		System.out.println("Projectpath:"+projectpath);
		System.setProperty("webdriver.chrome.driver",projectpath+"/Drivers/ChromeDriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("https:\\www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("sunilhulagabal007@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Sunilbh007.");
		driver.findElement(By.name("login")).click();*/
		
		/*driver.get("https://www.facebook.com/reg/");
		Select selectobject1 = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div[2]/span/span/select[1]")));
		selectobject1.selectByValue("15");594997
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/span/span[1]/label/input")).click();
		*/
		Thread.sleep(15000);
		driver.quit();
	}

}


