package project.steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.actions.HomePageActions;
import project.actions.PaymentPageActions;
import project.actions.ProductPageActions;
import project.base.BaseClass;

public class StepDefinition extends BaseClass {


//    @Before
//    public void setUp() throws Exception {
//        prerequisite();
//       // androidDriver = super.getDriver();
//    }
    @Given("open the app")
    public void openTheApp() throws Exception {
        prerequisite();
      androidDriver = super.getDriver();

    }
//    @When("login is clicked and credentials are given")
//    public  void clickLoginAndFillDetails()
//    {
//        MobileElement loginButton = androidDriver.findElement(By.xpath(""));
//        if(loginButton.isDisplayed())
//        {
//            loginButton.click();
//            MobileElement email = androidDriver.findElement(By.xpath(""));
//            MobileElement pass = androidDriver.findElement(By.xpath(""));
//            email.sendKeys("19euit178@skcet.ac.in");
//            pass.sendKeys("blibli178");
//        }
//    }

    @Then("home page is asserted")
    public void verifyHomePageLoaded()
    {
        //Assert.assertEquals("");
    }

    @When("search bar is visible and product name is entered")
    public  void verifySearchBarVisibleAndSearchProduct() throws Exception {


        HomePageActions homePageActions = new HomePageActions(androidDriver);

        homePageActions.clickSearchBar();
        homePageActions.searchProduct("watch");


    }
    @Then("select the first product from drop down")
    public void selectFirstProductFromDropDown()
    {

        ProductPageActions productPageActions = new ProductPageActions(androidDriver);
        productPageActions.clickOnProductFromDropdown();
    }

    @Given("click on first product")
    public  void clickOnFirstProduct()
    {
        ProductPageActions productPageActions = new ProductPageActions(androidDriver);
        productPageActions.selectFirstProduct();
    }


    @When("clicked on Buy-Now")
    public void clickOnBuyNow() throws InterruptedException {
        Thread.sleep(5000);
        ProductPageActions productPageActions = new ProductPageActions(androidDriver);
        productPageActions.clickOnBuyNow();
    }
    @And("selected continue button")
    public void clickOnContinue()
    {
        ProductPageActions productPageActions = new ProductPageActions(androidDriver);
        productPageActions.clickOnContinue();
    }

    @Then("Atleast one of the payment method is selected and click pay-now")
    public  void selectAnyPaymentMethodAndClickPayNow()
    {

        PaymentPageActions paymentPageActions = new PaymentPageActions(androidDriver);
        paymentPageActions.clickOnPayNow();
    }
   @And("assert the cancel page")
    public void assertCancelPage()
   {
       PaymentPageActions paymentPageActions = new PaymentPageActions(androidDriver);
        paymentPageActions.confirmCancel();
   }


}
