package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class first_selenium {

    public static void main(String[] args) throws InterruptedException {



      WebDriver driver = new ChromeDriver();
      driver.get("https://www.amazon.com/");
      WebElement serchBoxdd = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
      Thread.sleep(3);
      serchBoxdd.click();
      //Select s= new Select(serchBoxdd);
      //s.getFirstSelectedOption();



    }
}
