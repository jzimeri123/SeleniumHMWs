import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2WebDriverCommandsAssignment {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        String title1= driver.getTitle();
        System.out.println(title1);
        driver.navigate().to("https://www.syntaxprojects.com/");
        String title2= driver.getTitle();
        System.out.println(title2);
        driver.navigate().back();
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().refresh();
        driver.quit();

    }
}
