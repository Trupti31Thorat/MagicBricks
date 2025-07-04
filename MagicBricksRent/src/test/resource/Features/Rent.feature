Feature: MagicBricks Rent Section Functionalities

  @ownerPhoto
  Scenario: Open Rent Owner Properties Click Photo and Scroll
    Given user launches the MagicBricks website
    When user hovers on Rent and clicks on Owner Properties under Popular Choices
    And user clicks on first property photo
    Then user scrolls down the photo view page

  #@contactOwnerPositive
  #Scenario: Contact Owner with valid details
    #Given user is on Owner Properties page
    #When user clicks on Contact Owner button
    #And fills contact form with valid data from Excel
    #Then contact form should proceed to number verification
#
  #@contactOwnerNegative
  #Scenario: Contact Owner with invalid WhatsApp number
    #Given user is on Owner Properties page
    #When user clicks on Contact Owner button
    #And fills contact form with invalid phone number from Excel
    #Then phone number validation error should appear
#
  #@sortHighToLow
  #Scenario: Sort Owner Properties by Price High to Low for Mumbai
    #Given user is on Owner Properties page
    #When user selects Sort By as "Price: High to Low"
    #Then properties should rearrange in high to low order
#
  #@furnishedHomesBHK
  #Scenario: Furnished Homes BHK Selection and Window Handling
    #Given user is on Home Page
    #When user navigates to Furnished Homes from Rent dropdown
    #And user scrolls to bedroom selection section
    #And user clicks on 1BHK option
    #Then the page should show 1BHK furnished properties
   #
  #@findAgent
  #Scenario: Find Agent with Filters
    #Given user is on Home Page
    #When user navigates to Find an Agent from Rent dropdown
    #And filters by city as Mumbai and locality as Juhu
    #Then user clicks on View Details of first agent
#
  #@exploreLocalities
  #Scenario: Explore Localities and Search
    #Given user is on Home Page
    #When user navigates to Localities from Rent dropdown
    #And searches for Mumbai in the search box
    #Then user scrolls through the locality results
