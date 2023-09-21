package SeleniumQuestion;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToFixWindowSize {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Dimension d = new Dimension(800,600);
				
		driver.manage().window().setSize(d);
	}

}
