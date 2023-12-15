package Week4.Day1classroom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameClassroom {

	public static void main(String[] args) {
		{
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.switchTo().frame("iframeResult");//using frame attributes
			driver.findElement(By.xpath("//button[text()='Try it']")).click();
			driver.switchTo().alert().accept();
			String text = driver.findElement(By.id("demo")).getText();
			System.out.println(text);
			
			
		}

	}

}
