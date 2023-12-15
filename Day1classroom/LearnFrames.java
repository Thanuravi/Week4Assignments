package Week4.Day1classroom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		//https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm
		//ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm \r\n");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.switchTo().frame("iframeResult");
		//driver.findElement(By.xpath("//button[text()='Try it]")).click();
		//Thread.sleep(2000);
		
		//Alert alert=driver.switchTo().alert();
		//alert.accept();
		
	
		//System.out.println(driver.findElement(By.id("demo")).getText());
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//bring the focus of driver into frame
		
		//driver.switchTo().frame(0);	using index -starting index zero
		WebElement frameEle = driver.findElement(By.xpath("(//iframe)[1]"));
		driver.switchTo().frame(frameEle);//using frame as webElement
		driver.findElement(By.id("Click")).click();
		
		//brings the driver control to the main web page 
		driver.switchTo().defaultContent();
		
		//count frame elem
		driver.switchTo().frame(1);
		String text = driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		//nested frame
		
		driver.switchTo().frame(2); //main page to parent frame
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();

		driver.switchTo().defaultContent();//takes you out of all the frames
		driver.switchTo().parentFrame(); // nested frame-->to take you to the immediate parent frame

	}
	}


