 #Feature: MagicBricks Home Interiors Functionality
    #
#@HomeInteriors
#Scenario: Navigate to Home Interiors Post Property
#	  Given user is on MagicBricks homepage
#	  When user navigates to Home Interiors and hovers on Home Interior Design Services page
#	  And user clicks on Home Interior Design Services
#	  Then clicks on post Property button
#	  And on next page one popup appears which is closed by clicking
#	  Then user clicks on owner 
#	  Then clicks on Sell
#	  And owner fills contact details:
#| Mobile      |
#| 9876543210  |
#	  Then clicks on Start now button 
#
#
  #@Estimation
  #Scenario: Submit interior estimator without personal details using Excel
#	#Given user is on MagicBricks homepage
  #When user navigates to Home Interiors and hovers on Home Interior Design Services page
  #And user clicks on Home Interior Design Services
  #And user scrolls down and clicks on the Kitchen & Wardrobe calculate section
  #And user fills full estimator form from Excel row 1
  #And user fills contact details from Excel row 1
  #Then user should see the estimated quote 
#
  #@NegativeTest
#	#Scenario: Submit form with invalid 9-digit mobile number
  #Given user is on MagicBricks homepage
  #When user navigates to Home Interiors and hovers on Home Interior Design Services page
  #And user clicks on Home Interior Design Services
  #And user scrolls down and clicks on the Kitchen & Wardrobe calculate section
  #And user fills full estimator form from Excel row 2
  #And user fills contact details with invalid 9-digit mobile number from Excel row 2
 
 @HomeInteriors
Feature: Home Interiors Functionality
  Background:
    Given user is on MagicBricks homepage
    When user navigates to Home Interiors and hovers on Home Interior Design Services page
    And user clicks on Home Interior Design Services

  Scenario: Navigate to Home Interiors Post Property
    Then clicks on post Property button
    And on next page one popup appears which is closed by clicking
    Then user clicks on owner 
    Then clicks on Sell
    And owner fills contact details:
      | Mobile     |
      | 9876543210 |
    Then clicks on Start now button 

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
 
  