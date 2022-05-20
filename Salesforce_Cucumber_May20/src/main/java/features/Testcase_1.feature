Feature: Funtionality of salesforce


Scenario: Check the salesforce test cases

When Enter the username as 'hari.radhakrishnan@qeagle.com'
When Enter the password as 'Tuna@123'
When Click the Login button
Then Not redirected to home page
When Click on Create New
Then Click on Event
Then Fill Mandatory Information
Then Click on Attach
Then Click on Done
Then Click on Save Event
Then Click on the newly created event under Recent Items
Then Click on Edit
Then Clear Date
Then Update the End Date as tomorrow's date
And Save the changes
When Click on the newly created event under Recent Items and Delete the Event
And Verify the Event is removed from Recent Items







