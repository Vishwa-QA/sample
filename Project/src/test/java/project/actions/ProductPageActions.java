package project.actions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import project.page.ProductPage;

public class ProductPageActions {
    ProductPage productPage;

    public  ProductPageActions(AndroidDriver<MobileElement> androidDriver)
    {
        productPage = new ProductPage(androidDriver);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),ProductPage.class);

    }
    public void clickOnProductFromDropdown()
    {
        productPage.selectFirstProductFromDropdown();
    }

    public void selectFirstProduct()
    {
       productPage.selectFirstProduct();
    }
    public void clickOnBuyNow()
    {
        productPage.clickOnBuyNow();
    }

    public void clickOnContinue()
    {
        productPage.clickOnContinue();
    }
}
