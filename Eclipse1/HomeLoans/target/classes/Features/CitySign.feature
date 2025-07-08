Feature: Magic Bricks City Functionality

@Homepage
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
