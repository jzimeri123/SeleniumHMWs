import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroToLocatorsAssignment {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.syntaxprojects.com/locator-homework.php");
        driver.manage().window().maximize();
        WebElement fullName= driver.findElement(By.id("fullName"));
        fullName.sendKeys("John Doe");
        WebElement email= driver.findElement(By.id("yourEmail"));
        email.sendKeys("johndeo.com");
        WebElement clientName= driver.findElement(By.name("ClientName"));
        clientName.sendKeys("John Karl Doe");
        WebElement clientID= driver.findElement(By.id("ClientId"));
        clientID.sendKeys("123456");
        WebElement clientFeedback= driver.findElement(By.name("Clientfeedback"));
        clientFeedback.sendKeys("Everything is awesome!");
        WebElement projectName= driver.findElement(By.name("ProjectName"));
        projectName.sendKeys("Locators Assignment");
        WebElement projectDeadlineTime= driver.findElement(By.name("ProjectTime"));
        projectDeadlineTime.sendKeys("Sept 17 2024");
        WebElement currentAddress= driver.findElement(By.name("CurrentAddress"));
        currentAddress.sendKeys("1234 Principal Avenue, Orlando, Florida");
        WebElement permanentAddress=driver.findElement(By.name("PermanentAddress"));
        permanentAddress.sendKeys("Same as Current Address");
        WebElement submitBtn=driver.findElement(By.id("btn-submit"));
        submitBtn.click();
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().refresh();
        WebElement fullName1= driver.findElement(By.id("fullName"));
        fullName1.sendKeys("John Doe");
        WebElement email1= driver.findElement(By.id("yourEmail"));
        email1.sendKeys("john@deo.com");
        WebElement clientName1= driver.findElement(By.name("ClientName"));
        clientName1.sendKeys("John Karl Doe");
        WebElement clientID1= driver.findElement(By.id("ClientId"));
        clientID1.sendKeys("123456");
        WebElement clientFeedback1= driver.findElement(By.name("Clientfeedback"));
        clientFeedback1.sendKeys("Everything is awesome!");
        WebElement projectName1= driver.findElement(By.name("ProjectName"));
        projectName1.sendKeys("Locators Assignment");
        WebElement projectDeadlineTime1= driver.findElement(By.name("ProjectTime"));
        projectDeadlineTime1.sendKeys("Sept 17 2024");
        WebElement currentAddress1= driver.findElement(By.name("CurrentAddress"));
        currentAddress1.sendKeys("1234 Principal Avenue, Orlando, Florida");
        WebElement permanentAddress1=driver.findElement(By.name("PermanentAddress"));
        permanentAddress1.sendKeys("Same as Current Address");
        WebElement submitBtn1=driver.findElement(By.id("btn-submit"));
        submitBtn1.click();
        WebElement clickHere=driver.findElement(By.linkText("Click Here."));
        clickHere.click();










    }
}
