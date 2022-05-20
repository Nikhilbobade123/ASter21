Feature: This is my first feature

Background:
Given browser is launched and url is opened
  
Scenario: second scenario
When we get title of homepage
  Then it must be equal to expected title
  And title must contain bars

 Scenario: third scenario
 When we get title of home page
  Then it must be equal to expected title
 
  