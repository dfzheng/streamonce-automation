Feature: Addon and Webhook

  Given I am on myTW login page

  Scenario: Login myTW
    When I send a email to group
    And I wait for a while
    And I enter Username as "" and Password as ""
    And I enter Security answer as ""
    Then I will access my TW homepage


  Scenario: Create Group
    When I click create group
    And I enter group name and choose defaul group type as public
    And I click create group button
    Then The group will be created successfully and I will on the group page
    And I wait for a while
    And the creator's email and integrate user email will be in the group

  Scenario: Add TW users
    When I click Manage Users
    And I enter member as "cnctester3@dev.thoughtworks.com"
    And I click Save
    Then The member should be in the members
    And The member should be in the email list