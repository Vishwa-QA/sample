package project.actions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import project.page.HomePage;
import project.page.PaymentPage;

public class PaymentPageActions {

    PaymentPage paymentPage;

    public PaymentPageActions(AndroidDriver<MobileElement> androidDriver) {
        paymentPage = new PaymentPage(androidDriver);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),PaymentPage.class);
    }

    public void clickOnPayNow()
    {
        paymentPage.clickOnPayNow();
    }

    public void confirmCancel()
    {
        paymentPage.confirmCancel();
    }
}
