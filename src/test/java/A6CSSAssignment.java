import com.sun.source.tree.Tree;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A6CSSAssignment {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector-homework.php");
        WebElement userID= driver.findElement(By.cssSelector("input#UserID"));
        userID.sendKeys("12345");
        WebElement userName= driver.findElement(By.cssSelector("input#UserName"));
        userName.sendKeys("username");
        WebElement introToLecture= driver.findElement(By.cssSelector("input[name*='LectureIntro']"));
        introToLecture.sendKeys("Good morning");
        WebElement feedbackRay= driver.findElement(By.cssSelector("input#FeedbackFromRay"));
        feedbackRay.sendKeys("Everything is ok");
        WebElement feedbackDucky= driver.findElement(By.cssSelector("input#FeedbackfromDucky"));
        feedbackDucky.sendKeys("Everything is awesome");
        WebElement clientID= driver.findElement(By.cssSelector("input[name*='ClientID']"));
        clientID.sendKeys("11223344");
        WebElement email= driver.findElement(By.cssSelector("input[name*='email']"));
        email.sendKeys("email@gmail.com");
        WebElement courseTopic= driver.findElement(By.cssSelector("input[name*='CourseTopic']"));
        courseTopic.sendKeys("CSS Assignment");






    }
}
