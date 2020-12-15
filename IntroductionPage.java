package pageobject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IntroductionPage extends ParentPage{

    @FindBy(xpath = "//*[@id=\"main\"]/div[3]/a")
    private WebElement tryButton;

    public IntroductionPage(){
        super();
        PageFactory.initElements(driver, this);
    }

    public void tryButtonClick(){
        tryButton.click();
    }
}
