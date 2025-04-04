@f6
Feature: Add to cart
@set18
Scenario Outline: Add to cart and checkout
When Click the Product_Category
When Click the type of product
When Click the particular product "<prdct>"
When Click add to cart button is clicked "<qnty>"
When Click the Add to cart button
When Click the shopping cart button
Then The product is added in shopping cart page "<message>"

Examples:
| prdct                |      qnty        |    message             |
| TCP Public MT/AT     |       2          |    TCP Public MT/AT    |
| TCP Public Complete  |       5          |    TCP Public Complete |   

