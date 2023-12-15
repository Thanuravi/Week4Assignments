package Week4.Day2classroom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {
	

		public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
			System.out.println(driver);
			driver.get("https://www.leafground.com/table.xhtml");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//Locate the table
			
			WebElement table = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table"));
			//find the rowcount
			List<WebElement> row = table.findElements(By.tagName("tr"));
			System.out.println(row.size());
			//find the colcount
			List<WebElement> col = row.get(1).findElements(By.tagName("td"));
			System.out.println(col.size());
			
			List<WebElement> tableCol = table.findElements(By.tagName("th"));
			System.out.println(tableCol.size());
			
			//first row list
			System.out.println("Row Data");
			for (WebElement rowData : row) {
				System.out.println(rowData.getText());
			}
			
			
			System.out.println("ColData");
			
			for (WebElement colData : col) {
				System.out.println(colData.getText());
			}
			
			System.out.println("Table head");
			for (WebElement thead : tableCol) {
				System.out.println(thead.getText());
			}
			
			
			
			

		
		}

}
