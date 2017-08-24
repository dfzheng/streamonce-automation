Feature: DiscussionJiveToEmail
#This is how background can be used to eliminate duplicate steps
  Background:
  User navigates to myTW

    Given I am on myTW login page


#Scenario with AND
  Scenario:
    When I enter Username as "cnctester2@dev.thoughtworks.com" and Password as "1R&@SDNvOOoQnQ6Nn$9wx@R&s0"
    And  I enter Security answer as "Super Mario Bros"
    And  I open a new tab and go to testing group
    And  I post a new discussion in Jive
    And I open a new tab and login Gmail with "cnctester2@dev.thoughtworks.com"
    And  I wait for a while
    Then I get the email in Gmail