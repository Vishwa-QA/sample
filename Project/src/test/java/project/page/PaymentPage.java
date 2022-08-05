package project.page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;

public class PaymentPage {

    AndroidDriver<MobileElement> androidDriver;

    public PaymentPage(AndroidDriver<MobileElement> androidDriver) {
        this.androidDriver = androidDriver;
    }

    public void clickOnPayNow()
    {
        MobileElement payNow = androidDriver.findElementById("blibli.mobile.commerce:id/bt_pay_now");
        payNow.click();
    }

    public void confirmCancel()
    {
        MobileElement cancelText = androidDriver.findElementById("blibli.mobile.commerce:id/tv_order_cancelled");
        Assert.assertEquals("Not cancelled", "Order canceled", cancelText.getText().trim());

    }
}
