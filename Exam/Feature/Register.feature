
Feature: Registration 

 @tag10
  Scenario: new Registration
    Given launch application
    When Select the gender as male
    And enter first name as "Anamika"
    And enter last name as "singh"
    Then enter email as "anamika123@gmail.com"
    And enter password as "11111111"
    And confirm password as"11111111"
    And click on Register button
    And Alex registered successfully

  