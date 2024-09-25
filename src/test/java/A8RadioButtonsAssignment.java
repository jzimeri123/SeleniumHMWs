import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class A8RadioButtonsAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo-homework.php");

        //1. selecting juice radio button
        WebElement juiceBtn= driver.findElement(By.xpath("//input[@value='Juice']"));
        juiceBtn.click();

        //2. retrieving all radio buttons in the preferred working environment
        List<WebElement> workEnv=driver.findElements(By.xpath("//input[@name='working_enviroment']"));

        //traversing through all options and selecting Hybrid option
        workEnv.forEach(x->{
            if (x.getAttribute("value").equals("hybrid")){
                x.click();
            }
        });
        //3. Choosing favorite Season
        WebElement springBtn= driver.findElement(By.xpath("//input[@value='spring']"));
        boolean statusSpringBtn= springBtn.isEnabled();
        if (!statusSpringBtn){
            WebElement enableBtn= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
            enableBtn.click();
        }

        if (!statusSpringBtn){
            springBtn.click();
            Thread.sleep(2000);
        }

        WebElement winterBtn= driver.findElement(By.xpath("//input[@value='winter']"));
        boolean statusWinterBtn= winterBtn.isDisplayed();
        WebElement showButtons= driver.findElement(By.xpath("//button[@id='showRadioButtons']"));
        if(!statusWinterBtn){
        showButtons.click();
        }
        Thread.sleep(2000);
        if (!statusWinterBtn){
            winterBtn.click();
        }
        //4. Choosing meal
        List<WebElement> meals=driver.findElements(By.xpath("//input[@name='meal']"));
        meals.forEach(x->{
            if(x.getAttribute("value").equals("lunch")){
                x.click();
            }
        });
    }
}
