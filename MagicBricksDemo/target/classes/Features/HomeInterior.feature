@HomeInteriors
Feature: Home Interiors Functionality
  
  Background:
    Given user is on MagicBricks homepage
    When user navigates to Home Interiors and hovers on Home Interior Design Services page
    And user clicks on Home Interior Design Services

 # Scenario: Navigate to Home Interiors Post Property
    #Then clicks on post Property button
    #And on next page one popup appears which is closed by clicking
    #Then user clicks on owner 
    #Then clicks on Sell
   	#And owner fills contact details with "<mobile>"
    #Then clicks on Start now button
    #Examples:
     # | mobile      |
     # | 9876543210  |  


#@EngineeredWood
  #Scenario: Scroll and open Engineered Woods guide
    #When user scrolls down to "Your Home Interiors Price Guide" section
    #And user clicks on "Engineered Woods"
    #Then Engineered Woods page should open

  @Estimation
  Scenario: Submit interior estimator without personal details using Excel
    And user scrolls down and clicks on the Kitchen & Wardrobe calculate section
    And user fills full estimator form from Excel row 1
    And user fills contact details from Excel row 1
    Then user should see the estimated quote 

  @NegativeTest
  Scenario: Submit form with invalid 9-digit mobile number
    And user scrolls down and clicks on the Kitchen & Wardrobe calculate section
    And user fills full estimator form from Excel row 2
    And user fills contact details with invalid 9-digit mobile number from Excel row 2
  
    
  @Language
  Scenario: View all interior services and change language
    Then scrolls down and clicks on View All
    And on next page clicks on the language dropdown
    And selects a different language from the list
  
 
  