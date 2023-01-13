package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebUniversityPage {
    public WebUniversityPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h1[text() ='LOGIN PORTAL']")
    public WebElement loginPortalButonu;
    @FindBy(xpath = "//*[@*='Username']")
    public WebElement username;
    @FindBy(id="password")
    public WebElement password;
    @FindBy(id="login-button")
    public WebElement submitBtn;
}
