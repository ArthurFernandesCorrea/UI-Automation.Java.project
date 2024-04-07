@Regressivos
Feature: Validate Alerts
  As QA student
  I want to validate all the alerts
  So i can validate the automation
  
  Background: be on the alerts page
  	Given that I am on the alerts page 

  
  Scenario: Validate basic alert
  	When I click on the basic alert button
  	And validate basic alert
  	Then basic alert validation success
  	
  Scenario: Validate five seconds alert
  	When I click on the five seconds alert button
  	And validate five seconds alert
  	Then five seconds alert validation success
  	
  Scenario: Validate confirm box alert
  	When I click on the confirm box alert button
  	And validate confirm box alert
  	Then confirm box alert validation success
  	
  Scenario: Validate prompt box alert
  	When I click on the prompts box alert button
  	And validate prompt box alert
  	Then prompt box alert validation success
   

  
