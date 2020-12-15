package pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobject.utils.WebdriverSingleton;

import java.util.List;

public class ParentPage {

    private String pageUrl = "https://www.w3schools.com/html/default.asp";

    protected WebDriver driver = WebdriverSingleton.getInstance();

    protected HeaderMenu headerMenu = new HeaderMenu();

    @FindBy(xpath = "//*[@id=\"w3loginbtn\"]")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"leftmenuinnerinner\"]/a")
    private List<WebElement> leftMenu;

    public ParentPage(){
        PageFactory.initElements(driver,this);
    }

    public ParentPage open(){
        driver.get(pageUrl);
        return this;
    }

    public ParentPage loginButtonClick(){
        loginButton.click();
        return this;
    }

public ParentPage clickLeftMenuByNumber(int number){
        if (leftMenu.size() >= number && number >0 ) {
            leftMenu.get(number - 1).click();
        }
        else {
            System.out.println("Index out of bounds");
        }
        return this;
}
}
