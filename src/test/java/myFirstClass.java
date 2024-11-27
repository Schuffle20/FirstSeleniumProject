import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myFirstClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");

//        String googleSource = driver.getPageSource();
//        System.out.println("Google Page Source is :"+ googleSource);

        String googleHandle = driver.getWindowHandle();
        System.out.println("Google Handle is :"+ googleHandle);
//
//        String googleTitle = driver.getTitle();
//        System.out.println("Google Title is : "+ googleTitle);
//
//        driver.navigate().to("https://www.udemy.com");
//        String udemyTitle = driver.getTitle();
//        System.out.println("Udemy Title is : "+udemyTitle);
//
//        String udemyUrl = driver.getCurrentUrl();
//        System.out.println("Udemy URL is: "+ udemyUrl);
//
//        driver.navigate().back();
//        driver.getCurrentUrl();
//
//        String googleUrl = driver.getCurrentUrl();
//        System.out.println("Google URL is: "+ googleUrl);
//
//        driver.manage().window().fullscreen();
////        Thread.sleep(2000);
//        driver.navigate().refresh();
//        String googleUrl1 = driver.getCurrentUrl();
//        System.out.println("Google URL is: "+ googleUrl1);
//
//        driver.navigate().forward();
//        String udemyUrl1 = driver.getCurrentUrl();
//        System.out.println("Udemy URL is: "+ udemyUrl1);
        Thread.sleep(1000);
        driver.quit();
    }
}
