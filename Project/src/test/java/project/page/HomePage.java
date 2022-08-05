package project.page;

import io.appium.java_client.MobileElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import project.actions.HomePageActions;
import project.base.BaseClass;

import java.util.List;

public class HomePage extends  BaseClass {



     AndroidDriver<MobileElement> androidDriver1;

   public  HomePage(AndroidDriver<MobileElement> androidDriver)
    {
        androidDriver1 = androidDriver;
    }

    public void clickOnSearchBar() {


        MobileElement searchBar = androidDriver1.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.ImageView[2]");
        searchBar.click();
    }

    public  void clickOnTextViewAndSendKeys(String product)
    {

        List<MobileElement> textView = androidDriver1.findElements(By.className("android.widget.TextView"));
        textView.get(1).click();
        List<MobileElement> search1 = androidDriver1.findElements(By.className("android.widget.EditText"));
        search1.get(0).sendKeys(product);
    }



}
