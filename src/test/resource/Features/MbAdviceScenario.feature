
<<<<<<< HEAD
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
=======
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
<<<<<<< HEAD
#


#-----------------------------------------Latest_Blogs_Screenshot----------------------------------------------
 
#
=======



#-----------------------------------------Latest_Blogs_Screenshot----------------------------------------------
 #

>>>>>>> 6f304837b531716b8c9fa5d00444a260dc41f325
#Feature: Taking screenshot of page																															  #Complete
#
#@Latest_Blogs_Screenshot
#Scenario: Navigate to Latest Blogs from MB Advise
#Given the user is on the MB Advise page nevigate to Latest Blogs
#When When the user clicks on the Latest Blogs
#Then take screenshot


#---------------------------------------------------PrintReport-----------------------------------------------------------
<<<<<<< HEAD


=======
#
#
>>>>>>> 6f304837b531716b8c9fa5d00444a260dc41f325
#Feature: Using Robot class for Print functionality  																									#Complete
#
#@PrintReport
#Scenario: Print research data using Robot
  #Given the user is on the MB Advise page and nevigate to research
  #When the user navigates to Price Trends
  #Then press Ctrl+P using Robot class to print
#
<<<<<<< HEAD
#
#

#---------------------------------------------------Multiple Window handling---------------------------------------

=======



#---------------------------------------------------Multiple Window handling---------------------------------------
#
>>>>>>> 6f304837b531716b8c9fa5d00444a260dc41f325
#
#Feature: Multiple Window handling with magicbricks 																									  #Complete
#
#@WindowMultiHandle
#Scenario: Open and handle multiple windows in MB Advice
  #Given the user is on the MB Advise page
  #When the user opens multiple links under MB Advice
  #Then switch to each window and print title
  #
<<<<<<< HEAD
  
=======
  #
>>>>>>> 6f304837b531716b8c9fa5d00444a260dc41f325

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

<<<<<<< HEAD

 
  #----------------------------------------Excel Data Valid------------------------------
  
  
  Feature: View Report form submission with valid data
>>>>>>> origin/MbAdvice

  @ValidContact																																							#Complete
  Scenario: View Report form filled with valid data
    Given user launches the MagicBricks website
    When user hovers on Rent and clicks on actionable insights under mbadvice
    And user clicks on  View Report
<<<<<<< HEAD
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
=======
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
>>>>>>> origin/MbAdvice
    
    
    
    
    
    
<<<<<<< HEAD
#-------------------------------------------------------------------------------------------------
#Feature: finding research and insights of the property 
 # @Form

  #Scenario: property valuation with download sample rteport
   # Given user is on property valuation page 
  #When user click on download report
  #Then user fills the contact form with valid details from Excel
  #Then click on continuoe
=======
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
=======
  #----------------------------------------------------------------------------------------------------------
  #Feature: Search City and Show Trends using Excel data
#
#@ExcelData
  #Scenario Outline: Fetch city from Excel, select via Robot key and show trends
    #Given user is on Rates and Trends page
    #When user enters city name from Excel with "<RowIndex>"
    #And selects suggestion using Robot
    #And clicks on Show Trends button
    #Then Trends page for that city should be displayed
    #Examples:
    #|RoWIndex|
    #|1       |
  #
  #-----------------------------------------------------------excel new------------
  #
  Feature: Contact dealer with Excel																													#Complete

@ContactDealer
Scenario: Contact dealer with excel By nevigating into Localities
  Given the user is on the MB Advise page and nevigate Localities page
  When the user clicks on see all projects
  And the user click on contact dealer
  And fill the form with name email and mobileno
  Then click on continueo
  
  
  #
  #
  #
  #
  
>>>>>>> 6f304837b531716b8c9fa5d00444a260dc41f325
>>>>>>> origin/MbAdvice
