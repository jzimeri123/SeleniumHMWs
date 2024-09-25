import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A7WebElementCommAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/selenium_commands_selector-homework.php");

        //Retrieving the text and printing in console and verifying it is correct
        WebElement attributeText = driver.findElement(By.xpath("//div[@id='textattr']"));
        String text = attributeText.getText();
        if(text.equals("inspect me to view my custom attribute")){
            System.out.println("The text is correct");
        }else{
            System.out.println("There is a bug because the texts don't match");
        }


        //ensuring checkbox for Music Festival is enabled
        WebElement musicFBtn = driver.findElement(By.xpath("//input[@value='music_festival']"));
        if (musicFBtn.isEnabled()) {
            System.out.println("The Music Festival checkbox is enabled");
            musicFBtn.click();
        }

        //ensuring that Tech Talk is disabled
        WebElement techTalkBtn = driver.findElement(By.xpath("//input[@value='tech_talk']"));
        boolean statusOfTech = techTalkBtn.isEnabled();
        if (!statusOfTech) {
            System.out.println("The Tech Talk radio button is disabled");
        } else {
            System.out.println("The Tech Talk radio button is enabled");
        }

            //clicking on Show More Options
            WebElement showMoreBtn= driver.findElement(By.xpath("//button[@onclick='toggleHiddenRadio(event)']"));
            showMoreBtn.click();

            //finding and ensuring Art Exhibition is enabled
            WebElement artExBtn = driver.findElement(By.xpath("//input[@value='art_exhibition']"));
            if(artExBtn.isDisplayed()) {
                System.out.println("The Art Exhibition option is displayed");
                artExBtn.click();
            } else{
                System.out.println("The Art Exhibition option is not displayed");
            }

            //retrieving the hidden message in Mystery Message
            WebElement hiddenMsg = driver.findElement(By.xpath("//div[@id='hidden_message']"));
            System.out.println("The hidden message is " + hiddenMsg.getAttribute("title"));

            //checking if Checkbox1 is enabled
            WebElement checkBox1 = driver.findElement(By.xpath("//input[@name='CheckboxFirst']"));
            if(checkBox1.isEnabled()) {
                System.out.println("Checkbox1 is enabled");
                checkBox1.click();
            }

            //ensuring Checkbox2 is disabled
            WebElement checkBox2 = driver.findElement(By.xpath("//input[@value='disabledCheckbox']"));
            System.out.println("Is Checkbox 2 enabled? " + checkBox2.isEnabled());

            //clearing Input Field
            WebElement inputField = driver.findElement(By.xpath("//input[@id='inputField']"));
            inputField.clear();
            inputField.sendKeys("here is the custom text entered");


        }
    }
