Feature: Appium Project


  @Regression
  Scenario: Search products
      Given open the app

      When search bar is visible and product name is entered
      Then select the first product from drop down
#
      Given click on first product
      When clicked on Buy-Now
      And selected continue button
      Then Atleast one of the payment method is selected and click pay-now
      And assert the cancel page