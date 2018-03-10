Feature: Testing Flight info functionlaity in Flight page
Scenario: Checking the flight info functionality 
    Given I Open Mercury Flight Application
    When Click on the Register link in the Home page
    And Enter details in Registeration page
    And click on flight link, give all details about flight
    Then user should able to see flight pricing 