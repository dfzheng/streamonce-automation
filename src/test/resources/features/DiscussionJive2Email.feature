Feature: DiscussionJiveToEmail
#This is how background can be used to eliminate duplicate steps
  Background:
  User navigates to myTW

    Given I am on myTW login page


#Scenario with AND
  Scenario:
    When I enter Username as "" and Password as ""
    And  I enter Security answer as ""
    And  I open a new tab and go to testing group
    And  I post a new discussion in Jive
    And I open a new tab and login Gmail with ""
    And  I wait for a while
    Then I get the email in Gmail