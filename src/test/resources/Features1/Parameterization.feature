Feature: Diffrent way to Paraterize the scenario and steps

#Scenario: Parameterize int into step
 #Given I have 11 and 20
 #When I add them
# Then result must even
 
 Scenario: Parameterize word in a step
  Given I have apple fruit
  Then  display its color
 
  Scenario: Parameterize string in a step
  Given I have "a string which containss" space
  
 Scenario: paramaterizing multiple value in singlr step  
  Given I have following rto codes and city names:
 |MH|Mahastra|
 |RJ|Rajastan|
 |MP|Madhya Pradesh|
 |GJ|Gujrat|
 |UK|Uttarakhand|
 |UP|Uttar Pradesh|

Scenario: Parameterizing list of values to single step
 Given I have following capital city names:
 |Delhi|
 |Gandhi Nagar|
 |Mumbai|
 |Hudrabad|
 |Banglor|
 |Luckhnow|
 |Kolkata|