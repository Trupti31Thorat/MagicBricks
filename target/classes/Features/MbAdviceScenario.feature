
#---------------------------------------research and insights----------------------------------------------
#
#Feature: finding research and insights of the property                 													#Complete
#
#@research
#Scenario: Navigate to research and insights from MB Advise
#Given the user is on the MB Advise page and nevigate to research and insights
#When the user clicks on the research and insights tool
#And slightly scroll down
#And select city from  dropdown
#And select quarters  from dropdown
#Then select year  from dropdown
#


#-----------------------------------------Latest_Blogs_Screenshot----------------------------------------------
 
#
#Feature: Taking screenshot of page																															  #Complete
#
#@Latest_Blogs_Screenshot
#Scenario: Navigate to Latest Blogs from MB Advise
#Given the user is on the MB Advise page nevigate to Latest Blogs
#When When the user clicks on the Latest Blogs
#Then take screenshot


#---------------------------------------------------PrintReport-----------------------------------------------------------


#Feature: Using Robot class for Print functionality  																									#Complete
#
#@PrintReport
#Scenario: Print research data using Robot
  #Given the user is on the MB Advise page and nevigate to research
  #When the user navigates to Price Trends
  #Then press Ctrl+P using Robot class to print
#
#
#

#---------------------------------------------------Multiple Window handling---------------------------------------

#
#Feature: Multiple Window handling with magicbricks 																									  #Complete
#
#@WindowMultiHandle
#Scenario: Open and handle multiple windows in MB Advice
  #Given the user is on the MB Advise page
  #When the user opens multiple links under MB Advice
  #Then switch to each window and print title
  #
  

  #---------------------------------------------------------Robot scroll with key down----------------------------------------TrendSteps
  #Feature: Scroll Trending Web Stories page using Robot																													
#							
#	@RobotKeyDown																																									#Complete
  #Scenario: Scroll Trending Web Stories using Robot PageDown
    #Given user is on Trending Web Stories page
    #When user presses PageDown key using Robot
    #Then Web Stories section should scroll

  #--------------------------------------------------WindowHandle-------------------------------------------------

#
#Feature: Window handling with magicbricks																														#Complete
#
#@WindowHandle
#Scenario: Handle new window in Find Pincode
  #Given the user is on the MB Advise page and nevigate to Find Pincode page
  #When the user clicks on Find Pincode under MB Advice
  #Then switch to new window and validate the title
  #


 
  #----------------------------------------Excel Data Valid------------------------------
  
  
  Feature: View Report form submission with valid data

  @ValidContact																																							#Complete
  Scenario: View Report form filled with valid data
    Given user launches the MagicBricks website
    When user hovers on Rent and clicks on actionable insights under mbadvice
    And user clicks on  View Report
    And user fills the contact form with valid details from Excel
    Then user clicks on Continue button
    
    
    #----------------------------------------Excel Data Invalid-------------------------------------------------
    
#Feature: View Report form submission with Invalid data
    #@InvalidContact
#Scenario: View Report form filled with Invalid data
  #Given user launches the MagicBricks website																										#Complete
   #When user hovers on Rent and clicks on actionable insights under mbadvice
   #And user clicks on  View Report
   #And user fills the contact form with Invalid details from Excel
   #Then user clicks on Continue button and validate error
    #
    #
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    