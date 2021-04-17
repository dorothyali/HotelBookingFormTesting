import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {

    private static final WebDriver driver = new ChromeDriver();

@BeforeSuite
    public static void main (String[] args) {

    System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
}

@Test (testName = "Create a new guest record")

    public static void newGuest() {
    driver.get(Utils.BASE_URL);
    WebForm webForm = new WebForm(driver);
    webForm.enterFirstName();
    webForm.enterSurName();
    webForm.enterPrice();
    webForm.enterCheckin();
    webForm.enterCheckOut();
    webForm.clickSave();
    webForm.verifyCreateSuccess();

}

@AfterSuite
    public static void cleanUp() throws InterruptedException {
    driver.manage().deleteAllCookies();
    driver.close();

}


}
