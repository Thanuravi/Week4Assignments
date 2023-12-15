package Week4.Day2classroom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rail {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MAS",Keys.TAB);
		
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("MDU",Keys.ENTER);	
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		 WebElement table= driver
			.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));
		
		 List<WebElement> row = table.findElements(By.tagName("tr"));
			System.out.println(row.size());
			// find the colcount
			List<WebElement> col = row.get(1).findElements(By.tagName("td"));
			System.out.println(col.size());

		 
		System.out.println("One Column Data");
		for (int i = 2; i < row.size(); i++) {

			WebElement onecolData = driver.findElement(
					By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr[" + i + "]/td[2]"));

			System.out.println(onecolData.getText());
		}

	}
}