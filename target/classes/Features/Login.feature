Feature: Login Action 
    
Scenario Outline: Login with valid and Invalid Credentials 

  	Given user is on Login Page
	And User enters "<username>" and "<password>" 
   	And click loginbutton
   	
Examples: 
        |username|password|
        |mamatha123s|Mammu123@|
        |mama345|dfsd2|
