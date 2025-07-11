Feature: Magic Bricks Home Loans Functionality

  #-------------------------------------	Scenario TC: 1 and 2 -----------------------------------------------
  @SBIforminput1
  Scenario Outline: Verify selection of SBI Home Loan
    Given the user is on the Magic Bricks homepage
    When the user clicks on the "SBI Home Loans" link in the Home Loans Menu bar
    And the user enters the loan amount in the "<Loan Amount>" field
    Then the user enters a valid mobile number in the "<Mobile Number>" field
    Then the user enters a valid value in "<Property City>" field
    Then the user selects the city where the property is located from the Property City dropdown
    Then the user selects the appropriate option for Is Property Finalized? "<PropertyFinalized>"
    And the user selects the appropriate option for Is Token Amount Paid "<TokenAmountPaid>"
    And the user clicks on the "Check Eligibility" button
    Then the user should be redirected to the Mobile Number Verification page

    Examples: 
      | Loan Amount | Mobile Number | Property City | PropertyFinalized | TokenAmountPaid |
      |     5000000 |    9876543210 | mum           | Yes               | No              |
      |     3000000 |     912346789 | pun           | Yes               | No              |

  @SBIforminput2
  Scenario: Verify selection of SBI Home Loan with data from Excel
    Given the user is on the Magic Bricks homepage
    When the user clicks on the "SBI Home Loans" link in the Home Loans Menu bar
    And the user fills the SBI Home Loan form with data from Excel
    Then the user should be redirected to the Mobile Number Verification page

  #--------------------------------Scenario 3-------------------------------------------------------------
  @CityNavigation
  Scenario: Verify navigation to City Selection Page
    Given user is on Magic Bricks homepage
    When the user clicks on the "Home Loans" link in the navigation bar
    Then the user should be redirected to the Home Loans page
    Then the user scrolls down on the Home Loans Page
    And the user clicks on "Claim Now" button on SBI Home Loan Offer
    Then the user should be redirected to the MagicLoans page
    Then the user scrolls down on the MagicLoans Page
    And the user clicks on "Get Started-->" button
    Then the user clicks on one of the cities
    Then the user clicks on "Next" button to generate signup form

  #-------------------------------Scenario TC:-4 and 5 ---------------------------------------------------------------
  @EMICalc
  Scenario: Calculate Home Loan EMI with data from Excel
    Given I am on the home page
    When I navigate to the home loans menu
    And I click on the home loan EMI calculator
    And I calculate EMI for all rows in Excel
    Then I should see the recalculated EMI

  #--------------------------------Scenario 6-----------------------------------------------------------------
  @BalanceTransfer
  Scenario: Navigate to Home Loans and perform balance transfer
    Given the user is on the home page
    When the user navigates to the Home Loans section
    And the user clicks on the Balance Transfer option
    And the user fills the old and new loan details with data from Excel
    Then the user compares the old and new loan details
