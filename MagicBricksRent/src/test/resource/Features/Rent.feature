Feature: MagicBricks Rent Section Functionalities

  #@ownerPhoto
  #Scenario: Open Rent Owner Properties Click Photo and Scroll
    #Given user launches the MagicBricks website
    #When user hovers on Rent and clicks on Owner Properties under Popular Choices
    #And user clicks on first property photo
    #Then user scrolls down the photo view page
    

  #@contactOwnerPositive
#	Scenario: Contact Owner from Rent in that Owner Properties with valid data
  #Given user launches the MagicBricks website
  #When user hovers on Rent and clicks on Owner Properties under Popular Choices
  #And user clicks on Contact Owner button
  #And user fills the contact form with valid data from Excel
  #And user clicks on Continue button
  #Then contact form should proceed next
  

 #@contactOwnerNegative
 #Scenario: Contact Owner from Rent in Owner Properties with invalid WhatsApp number
  #Given user launches the MagicBricks website
  #When user hovers on Rent and clicks on Owner Properties under Popular Choices
  #And user clicks on Contact Owner button
  #And user fills the contact form with invalid WhatsApp number from Excel
  #And user clicks on Continue button
  #Then phone number validation error message should appear
  
  
  #@sortHighToLow
  #Scenario: Sort Owner Properties by Price High to Low
  #Given user launches the MagicBricks website
  #When user hovers on Rent and clicks on Owner Properties under Popular Choices
  #And user selects Sort By as "Price: High to Low"
  #Then sorting should be applied

#	@furnishedHomesBHK
#	Scenario: Furnished Homes BHK Selection and Window Handling
  #Given user launches the MagicBricks website
  #When user hovers on Rent and clicks on Furnished Homes under Popular Choices
  #And user scrolls to the bedroom selection section
  #And user clicks on 1BHK option
  #Then the page should display only 1BHK furnished properties
  
   
  #@findAgent
#	Scenario: Find Agent with City and Locality from Excel
  #Given user launches the MagicBricks website
  #When user hovers on Rent and clicks on Find an Agent under Explore
  #And user filters agents using city and locality from Excel
  #Then user clicks on View Details of the first agent
  
  
  @exploreLocalities
  Scenario: Explore Localities and Search
  Given user launches the MagicBricks website
  When user hovers on Rent and clicks on Localities under Explore
  And user enters city "Mumbai" in the search box and selects from suggestions
  Then user scrolls down to view locality results
