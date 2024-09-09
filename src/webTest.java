import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.gecko.driver","/Users/judyy/Documents/WebDriver/geckodriver.exe");
        
        WebDriver driver = new FirefoxDriver();
        
        driver.get("http://www.google.com");
        driver.quit();
	}

}
