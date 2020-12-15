@activityCRM
Feature: Basic Syntax

Scenario Outline: Schedule a meeting and invite members
    Given User is on CRM page
    When User enters "admin" and "pa$$w0rd"
    Then Schedule a meeting for members 
    And Search members "<FirstName>" "<LastName>" and create meeting
    And Verify creation of meetings
    And Close the Browser
    
Examples:
    | FirstName 				| LastName 				|
    | Rohit 				| Sharma |
    | Ram 	| Kumar  | 