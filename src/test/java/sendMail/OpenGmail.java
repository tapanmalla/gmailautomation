package sendMail;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGmail {

	public static void main(String[] args) throws InterruptedException {
		
			
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.name("identifier")).sendKeys("tapan.malla@gmail.com");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
		Thread.sleep(5000);
		
		driver.quit();
		System.out.print("Test Passed");
		
	}

}
