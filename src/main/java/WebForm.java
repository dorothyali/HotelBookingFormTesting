import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class WebForm extends PageObject {

    private final String FIRSTNAME = "Tom";
    private final String SURNAME = "Jerry";
    private final String PRICE = "1000";
    private final String IN = "2021-04-25";
    private final String CHECKOUT = "2021-04-30";

    @FindBy(id = "firstname")
    private WebElement first_name;


    @FindBy(id = "lastname")
    private WebElement last_name;

    @FindBy(id = "totalprice")
    private WebElement total_price;

    @FindBy(id = "depositpaid")
    private WebElement deposit_paid;

    @FindBy(id = "checkin")
    private WebElement in;

    @FindBy(id = "checkout")
    private WebElement check_out;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div[7]/input")
    private WebElement save;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName() {
        this.first_name.sendKeys(FIRSTNAME);

    }

    public void enterSurName() {
        this.last_name.sendKeys(SURNAME);
    }

    public void enterPrice() {
        this.total_price.sendKeys(PRICE);
    }

    public void enterCheckin() {
        this.in.sendKeys(IN);
    }

    public void enterCheckOut() {
        this.check_out.sendKeys(CHECKOUT);

    }

    public void clickSave() {
        this.save.click();

    }

    public void verifyCreateSuccess() {
        Assert.assertEquals(driver.getPageSource().contains(FIRSTNAME), true);
        System.out.println("New Record Created");
    }

}
