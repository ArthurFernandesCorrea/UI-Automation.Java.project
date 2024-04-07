
@Regressivos
Feature: Validate Student registration form demoqa
  As QA student
  I want to fill out the form
  So i can validate the automation

  
  Scenario: Fill out the form with valid data
    Given that I am on the form page
    When fill out the form with valid data
    And click on submit
    Then then a filled out form will be displayed 

  