package Week4.Day1classroom;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlerts {

	public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.leafground.com/alert.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	//click first alert show button -simple alert
	driver.findElement(By.xpath("//span[text()='Show']")).click();
	
	//to handle the alert -->switch the focus of driver to the alert box
	//syntax to swtich the driver focus to alert box
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	//get the message from the alert box
	String text = alert.getText();
	System.out.println(text);
	//accept the alert
	alert.accept();
		
	Thread.sleep(2000);
			
	//confirmation alert
	driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
	System.out.println(alert.getText());
	alert.dismiss();
	
	
	//Sweet alert
	driver.findElement(By.xpath("//span[text()='Delete']")).click();		
	driver.findElement(By.xpath("//span[text()='Yes']")).click();
	}

}
