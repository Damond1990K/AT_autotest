package pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobject.utils.WebdriverSingleton;

public class HeaderMenu {

    WebDriver driver = WebdriverSingleton.getInstance();

@FindBy(xpath = "xpathdlaverhmenu")
private WebElement element;

public HeaderMenu(){
    PageFactory.initElements(driver,this);
}

private String pageUrl = "https://www.w3schools.com/js/default.asp";

@FindBy(xpath = "//*[@id=\"topnav\"]/div/div[1]/a[5]")
private WebElement javaButton;

@FindBy(xpath = "//*[@id=\"topnav\"]/div/div[1]/a[3]")
private WebElement htmlButton;

@FindBy(xpath = "//*[@id=\"topnav\"]/div/div[1]/a[4]")
private WebElement cssButton;

@FindBy(xpath = "//*[@id=\"topnav\"]/div/div[1]/a[6]")
private WebElement sqlButton;

}
