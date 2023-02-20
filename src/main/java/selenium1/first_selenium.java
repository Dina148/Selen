package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class first_selenium {

    public static void main(String[] args) throws InterruptedException {



      WebDriver driver = new ChromeDriver(); // Bring the driver
        driver.get("http://the-internet.herokuapp.com/"); //driver has methods 1of them .get it will navigate to given URL
        /*WebElement checboxLink = driver.findElement(By.xpath("//a[@href='/checkboxes']"));
        Thread.sleep(3);
        checboxLink.click();
        WebElement firstCheckbox = driver.findElement(By.xpath("//form[@id='checkboxes']//input[1]"));
        firstCheckbox.click();
        WebElement secendCheckbox = driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]"));
        secendCheckbox.click();
*/
        //id="dropdown"

        WebElement ddelement = driver.findElement(By.xpath("//a[@href='/dropdown']"));
        ddelement.click();
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown']"));
        dropDown.click();
        Select select = new Select(dropDown);
        select.selectByValue("Option 1");




    }
}
