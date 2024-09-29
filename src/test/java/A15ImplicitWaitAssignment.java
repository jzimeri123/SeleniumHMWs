import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class A15ImplicitWaitAssignment {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-waits-homework.php");

        //clicking on button Click Me!
        WebElement clickMeButton= driver.findElement(By.xpath("//button[@id='show_text_synchronize_three']"));
        clickMeButton.click();
        //Creating object of Wait class
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        //waiting for element to appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Option-1']")));
        //Looking for Option1 and clicking on it
        WebElement option1= driver.findElement(By.xpath("//input[@value='Option-1']"));
        option1.click();

}
    }

