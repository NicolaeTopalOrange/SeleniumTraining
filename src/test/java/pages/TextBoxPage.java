package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxPage extends BasePage{
    WebDriver driver;
    String url = "https://www.tutorialspoint.com/selenium/practice/text-box.php";

    // Locator
    By fullNameLocator = By.id("fullname");
    By emailLocator = By.id("email");
    By currentAdressLocator = By.id("address");
    By passwordLocator = By.id("password");
    By submitLocator = By.className("btn btn-primary");

   //constructor
    public TextBoxPage(WebDriver webDriver){
        driver = webDriver;
    }

    public void open(){
        driver.get(url);
    }

    public void waitPageisLoaded(){
        waitElementIsLoaded(fullNameLocator);
    }
    public void waitElementisClickable(){
        waitElementIsClickable(submitLocator);
    }

    public void enterFullName (String fullName){
        WebElement fullNamefld = driver.findElement(fullNameLocator);
        fullNamefld.clear();
        fullNamefld.sendKeys(fullName);
    }

    public void enterEmail(String email){
        WebElement emailFld = driver.findElement(emailLocator);
        emailFld.clear();
        emailFld.sendKeys(email);
    }

    public void enterCurrentAddres(String address){
        WebElement addressFld= driver.findElement(currentAdressLocator);
        addressFld.clear();
        addressFld.sendKeys(address);
    }

    public void enterPassword(String password){
        WebElement passwordFld= driver.findElement(passwordLocator);
        passwordFld.clear();
        passwordFld.sendKeys(password);
    }

    public void clickToSubmit(){
        driver.findElement(submitLocator).click();
    }

}
