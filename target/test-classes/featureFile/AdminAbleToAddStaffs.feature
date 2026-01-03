Feature: Add Staff functionality

@Smoke
Scenario Outline: Admin adds a new staff member successfully
    When the admin clicks on the Administration menu
    And the admin clicks on the Profile option
    And the admin clicks on the Add Staff button
    And the admin enters the staff name "<StaffName>"
    And the admin enters the staff email "<Email>"
    And the admin enters the staff phone number "<PhoneNumber>"
    And the admin enters the password "<Password>"
    And the admin waits until 10000 seconds
    And the admin clicks on the Branch dropdown
    And the admin selects a branch from the dropdown
    And the admin clicks the Add button
    And the admin opens the Branch dropdown
    And the admin selects a branch from the Branch dropdown
    And the admin clicks on the Add button
    Then the admin clicks on the Save Staff button
    And the admin clicks on the delete button
    And the admin clicks on the Confirm button
    
 #  And the admin clicks on the Edit option button
 #  And the admin clears the text box in the staff name 
 #  When user edit the staff name as "Ahamed Ahamed"
 #  And the admin clicks on the Update Staff button
    And the admin waits until 10000 seconds

    Examples:
    | StaffName | Email            | PhoneNumber | Password   |
    | Arsath    | arsath@test.com  | 8056650042  | Arsath@990 |
    
    