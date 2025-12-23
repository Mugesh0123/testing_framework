Feature: Add Customer functionality

  Scenario: Admin adds a new customer successfully
    When the admin clicks on the Management menu
    And the admin clicks on the Customer option
    And the admin clicks on the Add Customer button
    And the admin enters the customer name "Arsath"
    And the admin enters the customer phone number "8056650042"
    And the admin clicks on the Save button
    Then the admin should see the message "Add Customer succeeded Add Details"
    

Scenario: Admin searches by phone number and deletes the customer
  When the admin clicks on the Management menu
  And the admin clicks on the Customer option
  And the admin searches for the customer using phone number "8056650042"
  And the admin deletes the customer details
  And nd the admin clicks on the Confirm button
     
