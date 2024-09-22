import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A7WebElementCommAssignment {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/selenium_commands_selector-homework.php");
       //Retrieving the text and printing in console
        WebElement textBox= driver.findElement(By.xpath("//div[@id='textattr']"));
        System.out.println(textBox.getText());

        //ensuring checkbox for Music Festival is enabled
        WebElement musicFBtn= driver.findElement(By.xpath("//input[@value='music_festival']"));
        System.out.println("Is the Music Festival button enabled? "+musicFBtn.isEnabled());
        musicFBtn.click();

        //ensuring that Tech Talk is disabled
        WebElement techTalkBtn= driver.findElement(By.xpath("//input[@value='tech_talk']"));
        System.out.println("Is the Tech Talk Button is enabled? "+techTalkBtn.isEnabled());

        //clicking on Show More Options
        WebElement showMoreBtn= driver.findElement(By.xpath("//button[@onclick='toggleHiddenRadio(event)']"));
        showMoreBtn.click();

        //ensuring Art Exhibition is enabled
        WebElement artExBtn= driver.findElement(By.xpath("//input[@value='art_exhibition']"));
        System.out.println("Is the Art Exhibition button enabled? "+artExBtn.isEnabled());
        artExBtn.click();

        //retrieving the hidden message
        WebElement hiddenMsg= driver.findElement(By.xpath("//div[@id='hidden_message']"));
        System.out.println("The hidden message is "+hiddenMsg.getAttribute("title"));

        //checking if Checkbox1 is enabled
        WebElement checkBox1= driver.findElement(By.xpath("//input[@name='CheckboxFirst']"));
        System.out.println("Is Checkbox 1 enabled? "+checkBox1.isEnabled());
        checkBox1.click();

        //ensuring Checkbox2 is disabled
        WebElement checkBox2= driver.findElement(By.xpath("//input[@value='disabledCheckbox']"));
        System.out.println("Is Checkbox 2 enabled? "+checkBox2.isEnabled());

        //clearing Input Field
        WebElement inputField= driver.findElement(By.xpath("//input[@id='inputField']"));
        inputField.clear();
        inputField.sendKeys("here is the custom text entered");




    }
}
