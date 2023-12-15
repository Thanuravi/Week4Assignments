package Week4.Day2classroom;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		System.out.println(driver);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones", Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='FLIGHTS']")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		List<String>listofWindows=new ArrayList<String>(allWindows);
		
		String childtitle= driver.switchTo().window(listofWindows.get(1)).getTitle();
		System.out.println("Child title:" +childtitle);
		
		String parenttitle= driver.switchTo().window(listofWindows.get(0)).getTitle();
		System.out.println("Parent title:" +parenttitle);
		//driver.close();
		driver.switchTo().window(listofWindows.get(0)).close();
		//driver.quit();
	}}


