import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class A8RadioButtonsAssignment {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo-homework.php");
        WebElement juiceBtn= driver.findElement(By.xpath("//input[@value='Juice']"));
        juiceBtn.click();

        List<WebElement> workEnv=driver.findElements(By.xpath("//input[@name='working_enviroment']"));
        workEnv.forEach(x->{
            if (x.getAttribute("value").equals("hybrid")){
                x.click();
            }
        });

        List<WebElement> seasons=driver.findElements(By.xpath("//input[@name='season']"));
        seasons.forEach(x->{
            if (x.getAttribute("value").equals("spring")){
                WebElement enableBtn= driver.findElement(By.xpath("//button[@id='enabledFruitradio']"));
                enableBtn.click();
            }
        });
        WebElement springBtn= driver.findElement(By.xpath("//input[@value='spring']"));
        boolean statusSpringBtn= springBtn.isEnabled();
        if (statusSpringBtn){
            springBtn.click();
        }

        WebElement winterBtn= driver.findElement(By.xpath("//input[@value='winter']"));
        boolean statusWinterBtn= winterBtn.isDisplayed();
        WebElement showButtons= driver.findElement(By.xpath("//button[@id='showRadioButtons']"));
        if(!statusWinterBtn){
        showButtons.click();
        }

        if (!statusWinterBtn){
            winterBtn.click();
        }

        List<WebElement> meals=driver.findElements(By.xpath("//input[@name='meal']"));
        meals.forEach(x->{
            if(x.getAttribute("value").equals("lunch")){
                x.click();
            }
        });
    }
}
