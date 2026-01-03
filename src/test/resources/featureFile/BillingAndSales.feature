Feature: Billing Sales

@Regression
  Scenario: Admin successfully completes a product sale
    When the admin clicks on the Billing menu
    And the admin selects the Sales option
    And the admin selects a product from the product list
    And the admin confirms the selected product
    And the admin clicks on Select Customer
    And the admin click a customer
    And the admin clicks a payment mode
    And the admin selects a payment type
    When the admin clicks on the All Dropdown Button
    And the admin selects a location in All Dropdown list
    And the admin clicks the payment(Sale) button
    And the admin selects the Order List option
    And user can able to see the "INV-2025-000078" in the billing Orders