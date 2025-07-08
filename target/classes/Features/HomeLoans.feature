Feature: Magic Bricks Home Loans Functionality

@Homepage
Scenario: Verify navigation to Home Loans Page
Given user is on Magic Bricks homepage
When the user clicks on the "Home Loans" link in the navigation bar
Then the user should be redirected to the Home Loans page
When the user fills the loan form with "5000000" amount
And the user enters mobile number "9764964324" 
And the user enters property city "Mum"
And the user selects "mumbai,maharashtra" for property city
And the user selects "Yes" for property finalized
And the user selects "No" for is token amount paid
And the user clicks on the Check Eligibility button
Then the eligibility form should be submitted successfully








#@SBIforminput1
#Scenario Outline: Verify selection of SBI Home Loan
  #Given the user is on the Magic Bricks homepage
  #When the user clicks on the "SBI Home Loans" link in the Home Loans Menu bar
  #And the user enters the loan amount in the "<Loan Amount>" field
  #Then the user enters a valid mobile number in the "<Mobile Number>" field
  #Then the user selects the city where the property is located from the "<Property City>" dropdown
  #Then the user selects the appropriate option for "<Is Property Finalized?>"
  #And the user selects the timeframe for finalizing the property
  #And the user clicks on the "Check Eligibility" button
  #Then the user should be redirected to the Mobile Number Verification page
#
#Examples:
  #| Loan Amount | Mobile Number | Property City | Is Property Finalized? |
  #| 5000000     | 9876543210    | Pune          | Yes                    |
  #| 3000000     | 9123456789    | Mumbai        | No                     |
#
#
@SBIforminput2
Scenario: Verify selection of SBI Home Loan with data from Excel
  Given the user is on the Magic Bricks homepage
  When the user clicks on the "SBI Home Loans" link in the Home Loans Menu bar
  And the user fills the SBI Home Loan form with data from Excel
  Then the user should be redirected to the Mobile Number Verification page
  

  
  


@CityNavigation
Scenario: Verify navigation to Home Loans Page
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




#@EMICalc
#Scenario: Calculate Home Loan EMI with data from Excel
  #Given I am on the home page
  #When I navigate to the home loans menu
  #And I click on the home loan EMI calculator
  #And I calculate EMI for all rows in Excel
  #Then I should see the recalculated EMI



#@BalanceTransfer
#
  #Background:
    #Given the user is on the home page
#
  #Scenario Outline: Navigate to Home Loans and perform balance transfer
    #When the user navigates to the Home Loans section
    #And the user clicks on the Balance Transfer option
    #And the user fills the old and new loan details with data from Excel
    #Then the user compares the old and new loan details
   
  