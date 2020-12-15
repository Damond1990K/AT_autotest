package pageobject.pages;

import pageobject.pages.ParentPage;
import pageobject.utils.WebdriverSingleton;

public class NewClass {

    public static void main(String[] args) {

      ParentPage main = new ParentPage();
      main.open();
      main.loginButtonClick();
      main.clickLeftMenuByNumber(4);

      main.loginButtonClick()
              .loginButtonClick()
              .clickLeftMenuByNumber(4);

    }
}
