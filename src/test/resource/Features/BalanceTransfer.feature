Feature: Home Loan Balance Transfer
  As a user
  I want to navigate to the home loans section and perform a balance transfer
  So that I can compare the old and new loan details

  Background:
    Given the user is on the home page

  Scenario Outline: Navigate to Home Loans and perform balance transfer
    When the user navigates to the Home Loans section
    And the user clicks on the Balance Transfer option
    And the user fills the old and new loan details with data from Excel
    Then the user compares the old and new loan details
   
