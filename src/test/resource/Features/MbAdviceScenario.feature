
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
#
#
#Feature: Using Robot class for Print functionality  																									#Complete
#
#@PrintReport
#Scenario: Print research data using Robot
  #Given the user is on the MB Advise page and nevigate to research
  #When the user navigates to Price Trends
  #Then press Ctrl+P using Robot class to print
#



#---------------------------------------------------Multiple Window handling---------------------------------------
#
#
#Feature: Multiple Window handling with magicbricks 																									  #Complete
#
#@WindowMultiHandle
#Scenario: Open and handle multiple windows in MB Advice
  #Given the user is on the MB Advise page
  #When the user opens multiple links under MB Advice
  #Then switch to each window and print title
  #
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
  