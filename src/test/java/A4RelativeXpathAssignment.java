import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4RelativeXpathAssignment {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/Xpath-homework.php");
        WebElement yourHobbies= driver.findElement(By.xpath("//input[@name='yourHobbies']"));
        yourHobbies.sendKeys("My hobbies are cooking and soccer");
        WebElement clickHereBtn= driver.findElement(By.xpath("//button[text()='Click Here']"));
        clickHereBtn.click();
        WebElement favoriteMovies= driver.findElement(By.xpath("//input[contains(@id,'favoriteMoviesId')]"));
        favoriteMovies.sendKeys("Back to the Future");
        WebElement paragraph= driver.findElement(By.xpath("//label[contains(text(),'Lorem ipsum dolor')]"));
        String textofString=paragraph.getText();
        System.out.println(textofString);
        WebElement city= driver.findElement(By.xpath("//input[@name='yourCity']"));
        city.sendKeys("My city");
        WebElement personalEmail= driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        personalEmail.sendKeys("Personal email");
        WebElement officeEmail= driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        officeEmail.sendKeys("Office email");
        WebElement professionalEmail= driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        professionalEmail.sendKeys("Professional email");

        WebElement clientName= driver.findElement(By.xpath("//input[@name='clientName' and @id='clientName']"));
        clientName.sendKeys("Client name");
        WebElement clientID= driver.findElement(By.xpath("//input[@name='clientId' and @id='clientId']"));
        clientID.sendKeys("Client ID");

        WebElement streetNo= driver.findElement(By.xpath("//input[@name='StreetNo']"));
        streetNo.sendKeys("Street No");
        WebElement houseNo= driver.findElement(By.xpath("//input[@name='HouseNo']"));
        houseNo.sendKeys("House No");

    }
}
