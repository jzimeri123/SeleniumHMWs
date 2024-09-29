import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class A16ExplicitWaitAssignment {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait-homework.php");
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));

        //1
        WebElement changeTextBtn= driver.findElement(By.xpath("//button[@id='changetext_button']"));
        changeTextBtn.click();
        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='headingtext']"),"Ssyntaxtechs"));
        WebElement newText= driver.findElement(By.xpath("//h2[@id='headingtext']"));
        System.out.println(newText.getText());

        //2
        WebElement enableButton= driver.findElement(By.xpath("//button[@id='enable_button']"));
        enableButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));
        WebElement button= driver.findElement(By.xpath("//button[text()='Button']"));
        button.click();

        //3
        WebElement checkCheckboxBtn= driver.findElement(By.xpath("//button[text()='Click me to checked the checkbox!']"));
        checkCheckboxBtn.click();
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='checkbox']"))));
        WebElement checkBox= driver.findElement(By.xpath("//input[@id='checkbox']"));
        if(checkBox.isEnabled()){
            System.out.println("The status of the checket button isSelected");
        }










    }
    }

