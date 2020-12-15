@activityCRM
Feature: Basic Syntax

Scenario Outline: Creating a Product.

    Given User is on CRM page
    When User enters "admin" and "pa$$w0rd"
    Then Create Products with details "<Name>" "<Price>"
    And Verify Products
    And Close the Browser
    
Examples:
    | Name 				| Price 				|
    | Training 				| 1000 |