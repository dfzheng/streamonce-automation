Feature: EmailToJive
#This is how background can be used to eliminate duplicate steps

  Scenario:
    When I send a email to group
    And I wait for a while
    And I am on myTW login page
    And I enter Username as "cnctester2@dev.thoughtworks.com" and Password as "1R&@SDNvOOoQnQ6Nn$9wx@R&s0"
    And I enter Security answer as "Super Mario Bros"
    And I wait for a while
    Then I should see a discussion with the same title as the email
    And I open the discussion to check the content and sender






