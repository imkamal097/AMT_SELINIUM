Feature: Add to cart
@set21
Scenario Outline: To verify whether the checkout is done correctly

When User agree to terms and conditions button
When User Clicks Checkout button
When User Clicks the continue in address option
When User Clicks In store pickup
When User Clicks continue
When User Clicks COD option
When User Click continue in payment confirmation page
When user select confirm 
Then check the order placed successfully or not