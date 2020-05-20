Feature: Test Foreign Exchange rates

Scenario: Test the latest exchange rates
Given Hit the URL for exchange rates
When Check API is available 
Then Validate the response status code

Scenario: Test the latest exchange rates
Given Hit the URL for exchange rates
When Check API is available 
Then Validate the response status line

Scenario: Test the latest exchange rates
Given Hit the incorrect URL for exchange rates
When Check API is available 
Then Validate the error response code

Scenario: Test the latest exchange rates for specific date
Given Hit the URL for exchange rates with date
When Check API is available 
Then Validate the response status code

Scenario: Test the latest exchange rates for specific date
Given Hit the URL for exchange rates with date
When Check API is available 
Then Validate the response status line

Scenario: Test the latest exchange rates for future date
Given Hit the URL for exchange rates with date
When Check API is available 
Then Validate the response status line 


