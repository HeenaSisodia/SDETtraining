@activityHRM
Feature: Basic Syntax

Scenario: Counting Dashlets
    Given User is on CRM page
    When User enters "admin" and "pa$$w0rd"
    Then Count number of dashlets
    And Print number and title of each dashlet
    And Close the Browser