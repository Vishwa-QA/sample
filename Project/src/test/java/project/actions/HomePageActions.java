package project.actions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import project.page.HomePage;

public class HomePageActions {

    HomePage homePage;
    //AndroidDriver<MobileElement> androidDriver;

    public HomePageActions(AndroidDriver<MobileElement> androidDriver) {

        homePage = new HomePage(androidDriver);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),HomePage.class);

    }



    public void clickSearchBar(){
        homePage.clickOnSearchBar();
    }
    public void searchProduct(String product)
    {
        homePage.clickOnTextViewAndSendKeys(product);
    }
}
