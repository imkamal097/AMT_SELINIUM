
Feature: Update the products in the cart
@set20
Scenario: To verify the update happens in the cart
When User select the product "<row>"
When User select the product "<row>" and "<quantity>"
When User Click the update button 
Then verify the product quantity updated or not "<message>"

Examples:
   |  row  |  quantity  | message  |
   |  1    |   0        |  2       |
   |  2    |   1        |  4       |