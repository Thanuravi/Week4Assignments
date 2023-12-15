package Week4.Day2classroom;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnMultipleWindows {
public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(options);
		System.out.println(driver);
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		
		List<String> handle=new ArrayList<String>(windowHandles);
		
		//closing all the window leaving parent active
		for (int i = 1; i < handle.size(); i++) {
			driver.switchTo().window(handle.get(i));
			System.out.println(driver.getTitle());
			driver.close();
			
		}
		
	//	driver.switchTo().window(handle.get(0));
		driver.quit();
	}
	

}
