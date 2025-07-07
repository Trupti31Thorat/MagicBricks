
Feature: Login functionality for MagicBricks
@Login
  Scenario: Login to MagicBricks as buyer using Excel data
    Given user is on MagicBricks homepage
    When user hovers on login and clicks login
    And user enters mobile number from Excel row 1
    And user waits for manual captcha and clicks next
    And user waits for manual OTP entry 
    Then user clicks continue






