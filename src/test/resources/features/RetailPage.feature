
@retailPage
Feature: Test Environment Retail Page

	Background: 
  Given User is on Retail website 
	And User click on MyAccount
	When User click on Login 
	And User enter username "ricardoq7077@gmail.com" and password "ricardo"
	And User click on Login button
	Then User should be logged in to MyAccount dashboard
	
	
	
	@RegisterAffiliate
	Scenario: Register as an Affiliate user with Cheque Payment Method
	When User click on ‘Register for an Affiliate Account’ link 
	And User fill affiliate form with below information
	|company|website|taxID|paymentMethod|payeeName|
	|BlackEagle, LLC|blackeagle.com|12-3456789|Cheque|Arnold Eagle|
	And User check on About us check box 
	And User click on Continue button 
	Then User should see a success message 
	
	
	@editAffiliate
	Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
	When User click on ‘Edit your affiliate information’ link
	And user click on Bank Transfer radio button
	And User fill Bank information with below information
	|bankName|abaNumber|swiftCode|accountName|accountNumber|
	|Monroe Bank|TD/12345|ISO 3166|eagle, llc|12345678|
	And User click on Continue button 
	Then User should see a success message 
	
	
	@editAccount
	Scenario: Edit your account Information 
	When User click on ‘Edit your account information’ link 
	And User modify below information 
	|firstName|lastName|email|telephone|
	|Daniel|Henry|ricardo5556@gmail.com|987-678-1223|
	And User click on Continue button 
	Then User should see a message "Success: Your account has been successfully updated."