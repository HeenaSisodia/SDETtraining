@activityCRM
Feature: Basic Syntax

Scenario: Create leads using parameterization
    Given User is on CRM page
    When User enters "admin" and "pa$$w0rd"
    Then Create leads using details 
    And Verify Results
    And Close the Browser