$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('features/DiscussionJive2Email.feature');
formatter.feature({
  "line": 1,
  "name": "DiscussionJiveToEmail",
  "description": "",
  "id": "discussionjivetoemail",
  "keyword": "Feature"
});
formatter.background({
  "comments": [
    {
      "line": 2,
      "value": "#This is how background can be used to eliminate duplicate steps"
    }
  ],
  "line": 3,
  "name": "",
  "description": "User navigates to myTW",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on myTW login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.goTomyTW()"
});
formatter.result({
  "duration": 6058229819,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 6,
      "value": "#Scenario with AND"
    }
  ],
  "line": 7,
  "name": "",
  "description": "",
  "id": "discussionjivetoemail;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I enter Username as \"cnctester2@dev.thoughtworks.com\" and Password as \"1R\u0026@SDNvOOoQnQ6Nn$9wx@R\u0026s0\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter Security answer as \"Super Mario Bros\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I open a new tab and go to testing group",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I post a new discussion in Jive",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I open a new tab and login Gmail with \"cnctester2@dev.thoughtworks.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I wait for a while",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I get the email in Gmail",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "cnctester2@dev.thoughtworks.com",
      "offset": 21
    },
    {
      "val": "1R\u0026@SDNvOOoQnQ6Nn$9wx@R\u0026s0",
      "offset": 71
    }
  ],
  "location": "stepdefinitions.I_enter_Username_as_and_Password_as(String,String)"
});
formatter.result({
  "duration": 800709042,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Super Mario Bros",
      "offset": 28
    }
  ],
  "location": "stepdefinitions.I_enter_Security_answer_as(String)"
});
formatter.result({
  "duration": 746719980,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinitions.I_open_a_new_tab_and_go_to_testing_group()"
});
formatter.result({
  "duration": 6434977145,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinitions.I_post_a_new_discussion_in_Jive()"
});
formatter.result({
  "duration": 4787220576,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cnctester2@dev.thoughtworks.com",
      "offset": 39
    }
  ],
  "location": "stepdefinitions.I_open_a_new_tab_and_login_Gmail_with(String)"
});
formatter.result({
  "duration": 1989157710,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinitions.I_wait_for_a_while()"
});
formatter.result({
  "duration": 40002903827,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinitions.I_get_the_email_in_Gmail()"
});
formatter.result({
  "duration": 10143229726,
  "error_message": "org.junit.ComparisonFailure: expected:\u003ctest2017-08-23 13:1[9]\u003e but was:\u003ctest2017-08-23 13:1[5]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat step_definitions.stepdefinitions.I_get_the_email_in_Gmail(stepdefinitions.java:225)\n\tat ✽.Then I get the email in Gmail(features/DiscussionJive2Email.feature:14)\n",
  "status": "failed"
});
});