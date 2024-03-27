package mg.inclusiv;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Parametrage driver  Edge
       // System.setProperty("webdriver.edge.driver", "C:\\Users\\inclu\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        //Instanciation driver navigateurs
        // WebDriver driverEdge = new EdgeDriver();
        //WebDriver driverFirefox= new FirefoxDriver();
        WebDriver driverChrome = new ChromeDriver();

        driverChrome.get("https://google.com/");
        WebElement element= driverChrome.findElement(By.name("q"));
        element.sendKeys("Inclusiv Academy");
        element.sendKeys(Keys.RETURN);
        WebElement searchfirstLink = driverChrome.findElement(By.xpath("//div[@id='search']//a"));
        searchfirstLink.click();





    }
}