Feature: SBI HomeLoan Functionality

#@SBIforminput1
#Scenario Outline: Verify selection of SBI Home Loan
  #Given the user is on the Magic Bricks homepage
  #When the user clicks on the "SBI Home Loans" link in the Home Loans Menu bar
  #And the user enters the loan amount in the "<Loan Amount>" field
  #Then the user enters a valid mobile number in the "<Mobile Number>" field
  #Then  the user enters a valid value in "<Property City>" field
  #Then the user selects the city where the property is located from the Property City dropdown
  #Then the user selects the appropriate option for Is Property Finalized? "<PropertyFinalized>"
  #And the user selects the appropriate option for Is Token Amount Paid "<TokenAmountPaid>"
  #And the user clicks on the "Check Eligibility" button
  #Then the user should be redirected to the Mobile Number Verification page
#
#Examples:
  #| Loan Amount | Mobile Number |Property City | PropertyFinalized| TokenAmountPaid |
  #| 5000000     | 9876543210    |mum           |Yes							 | No               |
  #| 3000000     | 9123456789    |          |Yes							 | No               |
  


@SBIforminput2
Scenario: Verify selection of SBI Home Loan with data from Excel
  Given the user is on the Magic Bricks homepage
  When the user clicks on the "SBI Home Loans" link in the Home Loans Menu bar
  And the user fills the SBI Home Loan form with data from Excel
  Then the user should be redirected to the Mobile Number Verification page
  
