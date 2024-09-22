import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class A9CheckBoxesAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo-homework.php");

        //checking if Subscribe to Newsletter is enabled and clicking on it
        WebElement newsletter= driver.findElement(By.xpath("//input[@id='newsletter']"));
        boolean statusNewsLetter= newsletter.isEnabled();
        if (statusNewsLetter){
            newsletter.click();
        }

        //retrieving all checkboxes in Hobbies selection
        //selecting Reading and Cooking options
        List<WebElement> hobbies=driver.findElements(By.xpath("//input[@class='cb-element']"));
        hobbies.forEach(x-> {
            if(x.getAttribute("id").equals("reading")){
                x.click();
            }
                    if(x.getAttribute("id").equals("cooking")){
                        x.click();
                    }
                });

        //Select your interests
     WebElement supportChBx= driver.findElement(By.xpath("//input[@value='Support']"));
     WebElement musicChBx= driver.findElement(By.xpath("//input[@value='Music']"));
        System.out.println("Support checkbox is disbplayed? "+supportChBx.isDisplayed()+ "  Music checkbox is displayed? "+musicChBx.isDisplayed());

        WebElement showChBx= driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        showChBx.click();

        Thread.sleep(1000);
        musicChBx.click();

//Verify if Receive Notifications is disabled
        WebElement receiveNotf= driver.findElement(By.xpath("//input[@value='Receive-Notifications']"));
        boolean statusReceiveNotf= receiveNotf.isEnabled();
        if(!statusReceiveNotf){
            WebElement enableCheckBx= driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
            enableCheckBx.click();
        }
        Thread.sleep(1000);
        receiveNotf.click();

    }
    }
