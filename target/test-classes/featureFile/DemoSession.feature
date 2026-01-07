Feature: Add Branches Functionality

  @Monkey
  Scenario Outline: Admin adds a new location successfully
    When the admin navigates to the Administration menu
    And the admin selects the Branches option
    And the admin clicks on the Add Branch button
    And the admin enters the branch name "<BranchName>"
    And the admin enters the location "<Location>"