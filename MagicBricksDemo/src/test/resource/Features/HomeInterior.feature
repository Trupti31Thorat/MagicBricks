 Feature: MagicBricks Home Interiors Functionality

  @HomeInteriors
  Scenario: Navigate to Home Interiors and submit city, budget and contact details for Pune
    Given user is on MagicBricks homepage
    When user navigates to Home Interiors and hovers on Home Interior Design Services page
    And user clicks on Home Interior Design Services
    And user selects city as "Pune"
    Then on next page user  budget as "5-10 Lakhs"
    And user clicks on Check Project
    And user fills contact form with name "John", mobile "9876543210"
    Then user should see designer matching confirmation

  #@RewardPopup
  #Scenario: User presses back without submitting contact details and gets reward pop-up
    #Given user comes back on home interior design # Retaining 'Given' to set the state
    #When selects view phone no. # Changed to 'When' for action initiation
    #Then without filling the contact details form user presses the back button # Retaining 'Then' as it describes the *result* of the user's action
    #Then reward popup should appear
    #When user clicks "Check Now" on reward popup # Main action for next part of scenario
    #Then contact form should appear # Assertion for the main action
#
  #@Estimation
  #Scenario: Submit estimator with kitchen and wardrobe details
    #Given user is on Home Interior Design Services Page # Retaining 'Given' to set the state
    #When user scrolls down and clicks on the Kitchen & Wardrobe calculate section # Changed to 'When' for action initiation
    #And user enters kitchen details: # This implies an action, so 'And' is correct here
      #| Shape   | Size |
      #| L-Shape | Big  |
    #And user clicks Next
    #And user enters wardrobe details: # This implies an action, so 'And' is correct here
      #| Description                |
      #| 2 wardrobes of Medium size |
    #And user clicks Next
    #When user fills interior requirements: # Changed to 'When' as this is the primary action for this block of inputs
      #| ForUse   | Timeline         | City |
      #| Self-Use | Within one month | Pune |
    #And user submits the form # This is a further action, so 'And' is correct here
    #Then user should see the estimated quote
#
  #@NegativeTest
  #Scenario: Submit form with blank fields
    #Given user is on the contact form page
    #When user submits form without entering required fields
    #Then user should see validation error message
