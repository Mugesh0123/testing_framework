Feature: Add Customer functionality

Background:
    When the admin clicks on the Management menu
    And the admin clicks on the Customer option
    


Scenario: Admin adds a new customer successfully
    And the admin clicks on the Add Customer button
    And the admin enters the customer name "Arsath"
    And the admin enters the customer phone number "8056650042"
    And the admin clicks on the Save button
    
  # @Regression  
Scenario Outline: Admin adds a new customer successfully
    And the admin clicks on the Add Customer button
    And the admin enters the customer name "<CustomerName>"
    And the admin enters the customer phone number "<PhoneNumber>"
    And the admin clicks on the Save button

Examples:
    | CustomerName | PhoneNumber |
    | Arsath01     | 7418484756  |
    | Arsath02     | 8682850408  |
    
Scenario: Admin searches by phone number and deletes the customer
    And the admin searches for the customer using phone number "8056650042"
    And the admin deletes the customer details
    And nd the admin clicks on the Confirm button