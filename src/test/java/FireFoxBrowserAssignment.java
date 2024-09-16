import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserAssignment {
    public static void main(String[] args) {
        //creating object of Driver
        WebDriver driver=new FirefoxDriver();
//maximizing page
        driver.manage().window().maximize();
driver.navigate().to("https://www.syntaxprojects.com/");
String url=driver.getCurrentUrl();
        System.out.println(url);
        String title=driver.getTitle();
        System.out.println(title);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();

    }



}
