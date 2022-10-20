import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondSeleniumTest {
    @Test
    public void openHomePageCheck() {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.qaguru.lv/");
    }
}