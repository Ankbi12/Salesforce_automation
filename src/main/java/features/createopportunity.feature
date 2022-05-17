Feature: Create New Opportunity on Salesforce Application



Background:



Given Open the chrome browser
And Load the Application URL and login
And go to global icon
And select Create Opportunity


Scenario: TC001_Create a Positive functionality of New opportunity with mandatory fields

Given Enter new opportunity name "New Opportunity"
And Select Close date
And Select stage
When click the save button
Then new Opportunity created Successfully

Scenario: TC001_Create a Negative functionality of New opportunity with mandatory fields

Given Enter new opportunity name "New Opportunity"
And Select Close date
And Do not Select stage
When click the save button
Then new Opportunity will not be created 