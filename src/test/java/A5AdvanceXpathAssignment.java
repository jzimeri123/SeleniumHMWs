import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A5AdvanceXpathAssignment {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/advanceXpath-homework.php");
        WebElement leastFav1= driver.findElement(By.xpath("//div[@class='row col-4-fields']/child::input[1]"));
        leastFav1.sendKeys("First least");
        WebElement leastFav2= driver.findElement(By.xpath("//div[@class='row col-4-fields']/child::input[2]"));
        leastFav2.sendKeys("Second least");
        WebElement leastFav3= driver.findElement(By.xpath("//div[@class='row col-4-fields']/child::input[3]"));
        leastFav3.sendKeys("Third least");

        WebElement favBook1= driver.findElement(By.xpath("//input[@id='favouriteBook']"));
        favBook1.sendKeys("Favorite book 1");
        WebElement favBook2= driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[1]"));
        favBook2.sendKeys("Favorite book 2");
        WebElement favBook3= driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[2]"));
        favBook3.sendKeys("Favorite book 3");

        WebElement grandparent= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        grandparent.sendKeys("Grandparent");
        WebElement parent= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        parent.sendKeys("Parent");
        WebElement child= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        child.sendKeys("Child");
    }
}
