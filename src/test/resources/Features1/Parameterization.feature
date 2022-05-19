Feature: Diffrent way to Paraterize the scenario and steps

Scenario: Parameterize int into step
 Given I have 11 and 20
 When I add them
 Then result must even
 
 Scenario: Parameterize string in a step
  Given I have78orange fruite
  Then  display its color
 
 