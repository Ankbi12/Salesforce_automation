Feature: Funtionality of the Login Page


Background:
Given Launch the browser and load the url


Scenario: Tc001_Positive functionality of the login page
When Enter the username as 'hari.radhakrishnan@qeagle.com'
And Enter the password as 'Tuna@123'
When Click the Login button
Then Landing in the home page
 
