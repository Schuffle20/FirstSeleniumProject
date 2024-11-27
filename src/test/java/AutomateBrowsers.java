import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class AutomateBrowsers {
    public static void main(String[] args) {
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();

//        WebDriverManager.edgedriver().setup();
//        WebDriver driver = new EdgeDriver();

        WebDriverManager.safaridriver().setup();
        WebDriver driver = new SafariDriver();


    };
}
