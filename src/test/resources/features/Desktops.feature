#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.

@desktops
Feature: Test Environment Retail Page

Background:
		Given User in on Retail website
    When User click on Desktops tab
    And User clicks on Show all desktops
    
 @itemPresent
  Scenario: User verify all items are present in Desktops tab
     Then User should see all items are present in Desktop page
    
 @AddHp   
	Scenario: User add HP LP3065 from Desktops tab to the cart
		And User click ADD TO CART option on "HP LP3065" item
		And User select quantity "1"
		And User click add to Cart button
		Then User should see a message "Success: You have added HP LP3065 to your shopping cart!"
		
 @AddCanon
	 Scenario: User add Canon EOS 5D from Desktops tab to the cart
	 And User click ADD TO CART option on "Canon EOS 5D" item
	 And User select color from dropdown "Red"
	 And User select quantity "1"
	 And User click add to Cart button
	 Then User should see a message "Success: You have added Canon EOS 5D Camera to your shopping cart!"
	 
 @CanonReview
 		Scenario: User add a review to Canon EOS 5D item in Desktops tab
 		And User click on Canon EOS 5D item
 		And User click on write a review link
 		And User fill the review information with below information
 		|name|review|rate|
 		|Abe Kusoglu|The camera is absolutely awesome, I love it!!|5|
 		And User click on Continue Button
 		Then User should see a message with "Thank you for your review.It has been submitted to the webmaster for approval."
