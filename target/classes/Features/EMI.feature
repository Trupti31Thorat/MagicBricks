Feature: Magic Bricks EMI Functionality
#Scenario Outline: Calculate Home Loan EMI
#    Given I am on the home page
#    When I navigate to the home loans menu
#    And I click on the home loan EMI calculator
#    And I fill in the loan amount "<loan_amount>"
#    And I fill in the loan tenure "<loan_tenure>"
#    And I fill in the interest rate "<interest_rate>"
#		And I select appropriate option for Is Property Finalized? "<PropertyFinalized>"
#    And I click on "Recalculate Your EMI"
#    Then I should see the recalculated EMI
#
#    Examples:
#      | loan_amount | loan_tenure | interest_rate | PropertyFinalized|
#      | 3000000     | 10          | 12            | Yes              |
#      | 4500000     | 8           |             | Yes              |

Scenario: Calculate Home Loan EMI with data from Excel
  Given I am on the home page
  When I navigate to the home loans menu
  And I click on the home loan EMI calculator
  And I calculate EMI for all rows in Excel
  Then I should see the recalculated EMI
