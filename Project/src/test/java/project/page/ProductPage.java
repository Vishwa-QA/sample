package project.page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ProductPage {
    AndroidDriver<MobileElement> androidDriver;

    public ProductPage(AndroidDriver<MobileElement> androidDriver) {
        this.androidDriver = androidDriver;
    }

    public void selectFirstProductFromDropdown()
    {
        MobileElement dropDown = androidDriver.findElementById("tv_suggestion_txt");
        dropDown.click();
    }

    public void selectFirstProduct()
    {
        MobileElement firstProduct = androidDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]");
        firstProduct.click();
    }

    public void clickOnBuyNow()
    {
        MobileElement buyNow = androidDriver.findElementById("blibli.mobile.commerce:id/bt_buy");
        buyNow.click();
    }
    public void clickOnContinue()
    {
        MobileElement continueButton = androidDriver.findElementById("blibli.mobile.commerce:id/bt_checkout");
        continueButton.click();
    }
}
