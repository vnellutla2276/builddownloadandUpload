package Intro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BuildDownloadAndUpload {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://usalvwcobld01.infor.com:8080/hudson/view/Infor Mingle-OP-12.0.36/job/Infor.TechStack.Installer.ISO-12.0.36/7/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Credentials object = new Credentials();
		
		Actions action = new Actions(driver);
		driver.findElement(By.xpath("//form[@name='login']//input[@id='j_username']")).click();
		driver.findElement(By.xpath("//form[@name='login']//input[@id='j_username']")).sendKeys(object.PUserName());
		
		driver.findElement(By.xpath("//form[@name='login']//input[@id='j_password']")).click();
		//driver.findElement(By.linkText("log in")).click();
		//driver.findElement(By.id("j_username")).click();
		//driver.findElement(By.id("j_username")).sendKeys(object.PUserName());
		//driver.findElement(By.id("j_password")).sendKeys(object.PPassword());
		//driver.findElement(By.id("j_username")).sendKeys(object.PUserName());
		/*
		//System.out.println(object.PUserName());
		driver.findElement(By.name("j_password")).click();
		//System.out.println(object.PPassword());
		driver.findElement(By.name("j_password")).sendKeys(object.PPassword());
        driver.findElement(By.linkText("log in")).click();;
		*/
	}

}
