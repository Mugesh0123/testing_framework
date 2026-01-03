Feature: Add Inventory Functionality

  Scenario: Admin successfully adds a new sales inventory item
    And the admin clicks on the Management menu
    And the admin selects the Sales Inventory option
    And the admin clicks on the Add Inventory button
    And the admin enters the item name "Screw Driver"
    And the admin enters the description "Screw Driver Lists" 
    And the admin selects a branch from the dropdown list 
    And the admin selects a Category from the dropdown list
    And the admin opens the Select Brand dropdown
    And the admin selects a brand from the dropdown list 
    And the admin opens the Select Size dropdown
    And the admin selects a size from the dropdown list
    And the admin opens the Select Color dropdown
    And the admin selects a color from the dropdown list
    And the admin enters the sale price "199"
    And the admin increases the stock quantity by clicking
    And the admin clicks the Save Inventory button
    And wait for some time for 10000 seconds
