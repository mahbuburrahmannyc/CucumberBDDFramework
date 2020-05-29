@newtour @FunctionalTest
Feature: Users ability to create account

Scenario Outline: Positive user Should able to create account using Register

Given Browse to Newtours homepage
When Navigate to register page
And Fill form with some basic information
And Complete creating account with "<UserName>"
Then Verify account created successfully

Examples:

    |UserName|
    |Rahman  |
