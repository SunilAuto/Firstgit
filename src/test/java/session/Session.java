package session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String projectpath=System.getProperty("user.dir");
System.out.println("Projectpath:"+projectpath);
System.setProperty("webdriver.chrome.driver", projectpath+"/Drivers/ChromeDriver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.com/");
}

}
