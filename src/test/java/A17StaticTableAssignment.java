import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class A17StaticTableAssignment {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/table-search-filter-demo-homework.php");

        //1. finding all the USA entries
        List<WebElement> allCountries = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
        int count=1;
        for(WebElement country:allCountries){
            if(country.getText().equals("USA")){
                WebElement row= driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr["+count+"]"));
                System.out.println(row.getText());

            }count=count+1;
        }






    }
    }

