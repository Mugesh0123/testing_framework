Feature: Login the website

@login
Scenario: User should login the website
    Given user should be in login  page "https://sharks.sivajigroups.com"
    When user  enter phone number "8248151460"
    And user enter password "admin"
    And user click login button
    And user click profile icon
    Then click logout option