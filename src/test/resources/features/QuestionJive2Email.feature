Feature: QuestionJive2Email
#This is how background can be used to eliminate duplicate steps
  Background:
  User navigates to myTW
    Given I am on myTW login page
#Scenario with AND
  Scenario:
    When I login myTW
    And  I enter Security answer
    And  I open a new tab and go to testing group
    And  I post a new question in Jive
    And  I wait for a while
    Then I get the email in Gmail