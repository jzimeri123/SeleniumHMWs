import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class A10DropDownAssignment {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php");

        WebElement DD= driver.findElement(By.xpath("//div[@id='dream_fruits']"));
        DD.click();

        List<WebElement> fruits=driver.findElements(By.xpath("//ul[@class='dropdown-menu single-dropdown-menu']/li/a"));
        fruits.forEach(x->{
            if(x.getText().equals("Mango")){
                x.click();
            }
        });

        WebElement DD2= driver.findElement(By.xpath("//div[@id='favorite_hobbies']"));
        DD2.click();

        List<WebElement> hobbies=driver.findElements(By.xpath("//ul[@class='dropdown-menu multi-dropdown-menu']/li/a"));
        hobbies.forEach(x->{
            if(x.getText().equals("Reading")){
                x.click();
            }
        });

    }
}
