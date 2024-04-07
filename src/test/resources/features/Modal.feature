
@Regressivos
Feature: Validate modals
  As QA student
  I want to validate all the modals
  So i can validate the automation
  
  Background: be on the modal page
  Given I am on the modal page

  
  Scenario: Validate small modal
    When I click on small modal button
    And validate small modal text
    Then small modal validation sucess
    
  Scenario: Validate large modal
    When I click on large modal button
    And validate large modal text
    Then large modal validation sucess
    

 