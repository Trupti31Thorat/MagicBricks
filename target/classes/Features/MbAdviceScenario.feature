
Feature: Automation Testing For MagicBrics Application


#---------------------------------------research and insights scenario-1 ----------------------------------------------

#Feature: finding research and insights of the property                 													

@research
Scenario: Navigate to research and insights from MB Advise
Given the user is on the MB Advise page and nevigate to research and insights
When the user clicks on the research and insights tool
And slightly scroll down
And select city from  dropdown
Then select quarters  from dropdown
																														



#----------------------------------------PrintReport scenario-2-----------------------------------------------------------
#

#Feature: Using Robot class for Print functionality  																									

@PrintReport
Scenario: Print research data using Robot
  Given the user is on the MB Advise page and nevigate to research
  When the user navigates to Price Trends
  Then press Ctrl+P using Robot class to print																													




#
  #--------------------------------------Robot scroll with key down--scenario-3--------------------------------------TrendSteps
 # Feature: Scroll Trending Web Stories page using Robot																													
						
@RobotKeyDown																																									
  Scenario: Scroll Trending Web Stories using Robot PageDown
    Given user is on Trending Web Stories page
    When user presses PageDown key using Robot
    Then Web Stories section should scroll


#
#----------------------------------------Multiple Window handling scenario-4--------------------------------------


#Feature: Multiple Window handling with magicbricks 																									  

@WindowMultiHandle
Scenario: Open and handle multiple windows in MB Advice
  Given the user is on the MB Advise page
  When the user opens multiple links under MB Advice
  Then switch to each window and print title
  
  
  

  #--------------------------------------Excel Data Valid--scenario-5----------------------------
  
  
  #Feature: View Report form submission with valid data

  @ValidContact																																							#Complete
  Scenario: View Report form filled with valid data
    Given user launches the MagicBricks website
    When user hovers on Rent and clicks on actionable insights under mbadvice
    And user clicks on  View Report
    And user fills the contact form with valid details from Excel using
    |Localities.xlsx|
    Then user clicks on Continue button
    
   #  -----------------------------------Excel Data Invalid--scenario-6-----------------------------------------------
    
#Feature: View Report form submission with Invalid data
    @InvalidContact
Scenario: View Report form filled with Invalid data
  Given user launches the MagicBricks website																										
   When user hovers on Rent and clicks on actionable insights under mbadvice
   And user clicks on  View Report
   And user fills the contact form with Invalid details from Excel
   Then user clicks on Continue button and validate error
    
    
    
    
    
    
#-------------------------------------------------------------------------------------------------
#Feature: finding research and insights of the property 
 # @Form

  #Scenario: property valuation with download sample rteport
   # Given user is on property valuation page 
  #When user click on download report
  #Then user fills the contact form with valid details from Excel
  #Then click on continuoe
