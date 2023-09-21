package SeleniumQuestion;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllOptionAndPassOneByOne {

	public static int random() {
		Random ran = new Random();
		int num = ran.nextInt(11);
		return num;

	}

	public static void main(String[] args) throws InterruptedException {

		for (;;) {

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapp.skillrary.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement ele = driver.findElement(By.className("chosen-select"));
			Select s = new Select(ele);
			List<WebElement> list = s.getOptions();
			for (WebElement webElement : list) {
				System.out.println(webElement.getText());
			}
			Thread.sleep(3000);
			s.selectByIndex(random());
			System.out.println(random());
			driver.close();
		}

	}

}
