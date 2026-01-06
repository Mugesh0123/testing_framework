Feature: Add Branches Functionality

  @Monkey
  Scenario Outline: Admin adds a new location successfully
    When the admin navigates to the Administration menu
    And the admin selects the Branches option
    And the admin clicks on the Add Branch button
    And the admin enters the branch name "<BranchName>"
    And the admin enters the location "<Location>"
    And the admin enters the contact number "<ContactNumber>"
    And the admin clicks on the Save Branch button
    And the admin waits until the transfer details are loaded
    And the admin clicks the Edit button
    And the admin clears the branch name text box
    And the admin enters the branch name as "Theni North"
    And the admin clicks on the Save Changes button
    And the admin waits until the transfer details are loaded
     Examples:
      | BranchName  | Location | ContactNumber |
      | Theni South | Cumbum   | 8682850408    |
