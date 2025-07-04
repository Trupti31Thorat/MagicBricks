Feature: Find Pincode functionality in MagicBricks MB Advice module
 
Scenario: Search for a pincode by selecting state, city, and locality 
Given user is on the MagicBricks homepage 
When user clicks on the Find Pincode link in the MB Advice section 
And user selects a state from the dropdown 
And user selects a city from the dropdown 
And user selects a locality from the dropdown 
Then user clicks the Search button