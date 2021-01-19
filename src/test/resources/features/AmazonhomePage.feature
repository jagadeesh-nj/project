Feature: Amazon homePage Feature

Scenario Outline: Validate the Home page
    Given user is on amazon login Page
    When user clicks on Signin button 
    And User enters the "<Username>" and "<Password>"
    And User cliks on Enter button 
    And User validates the Amazon HomePage
    And user enters the "<keyword>" in search feild
    And User click the search button
    And User selects the item
    And User place the order
    
    
    
    Examples:
    
    |  Username                     |   Password      | keyword                    |
    |  jagadeesh88.n@gmail.com      |  Audiomanajer@2 | gionee 10000mah power bank |
    
    

  