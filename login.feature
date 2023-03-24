Feature: "login functionality"

  Scenario: 
    Given User open browser
    When User opens URL "https://demo.opencart.com/admin/"
    And User enters username as "demo" and Password as "demo" Click on login
    Then User click on Log out link
    And close browser
