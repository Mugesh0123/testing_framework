Feature: Add Manage Transfer Functionality

  Scenario: Admin successfully Transfer the Items from One Branch To Another Branch
    And the admin clicks on the Management menu
    And the admin selects the Sales Inventory option
    And the admin clicks on the Manage Transfers button
    And the admin clicks on the Select Item dropdown text box
    And the admin select from the Select Item dropdown text box
    And the admin clicks on the Brand dropdown text box
    And the admin select from the Brand dropdown text box
    And the admin clicks on the Brand dropdown text box
    And the admin select from the Brand dropdown text box
    And the admin clicks on the size dropdown text box
    And the admin select from the size dropdown text box
    And the admin clicks on the color dropdown text box
    And the admin select from the color dropdown text box
    #And the admin clicks on the Transfer Type dropdown text box
    #And the admin select from the Transfer Type dropdown text box
    #And the admin clicks on the From Branch dropdown text box
    #And the admin select from the From Branch dropdown text box 
    #And the admin clicks on the To Branch dropdown text box
    #And the admin select from the To Branch dropdown text box 
    And the admin enters the Quantity "10"
    And the admin enters the Transfer Note(Optional) "Transferred Successful"
    And the admin clicks on the Confirm Transfer button