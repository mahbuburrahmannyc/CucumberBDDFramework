@google @Regression @FunctionalTest
Feature: User able to search in Google

Scenario Outline: User Able to Search in Google Positive

Given User in Google Home Page
When Search by key Word "<Keyword>"
Then Verify Search result Appear

Examples:

   |Keyword|
   |Car    |