package mindtree.minds;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {
    @Test
	public static void Test2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
		driver.findElement(By.xpath("//a[@class='login-link authentication_popup']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@id='spree_user_email'])[2]")).click();
		driver.findElement(By.xpath("(//input[@id='spree_user_email'])[2]")).sendKeys("ashwinpatil563@gmail.com");
		driver.findElement(By.xpath("(//input[@id='spree_user_password'])[3]")).click();
		driver.findElement(By.xpath("(//input[@id='spree_user_password'])[3]")).sendKeys("kabutarjajaja13");
		driver.findElement(By.xpath("//input[@id='ul_site_login']")).click();
		
		Thread.sleep(2000);
		driver.close();
	}

}
