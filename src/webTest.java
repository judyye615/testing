import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.gecko.driver","/Users/judyy/Documents/WebDriver/geckodriver.exe");
        //新建一个firefox浏览器实例
        WebDriver driver = new FirefoxDriver();
        //打开百度首页
        driver.get("http://www.google.com");
        driver.quit();
	}

}
