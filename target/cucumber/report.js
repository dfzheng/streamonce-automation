$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('features/DiscussionJive2Email.feature');
formatter.feature({
  "line": 1,
  "name": "DiscussionJive2Email",
  "description": "",
  "id": "discussionjive2email",
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
  "line": 6,
  "name": "I am on myTW login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.goTomyTW()"
});
formatter.result({
  "duration": 6870189067,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 9,
      "value": "#Scenario with AND"
    }
  ],
  "line": 10,
  "name": "",
  "description": "",
  "id": "discussionjive2email;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I login myTW",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I enter Security answer",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I open a new tab and go to testing group",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I post a new discussion in Jive",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I open a new tab and login Gmail with \"cnctester3@dev.thoughtworks.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I wait for a while",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I get the email in Gmail",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.I_enter_Username_as_and_Password_as()"
});
formatter.result({
  "duration": 1061749091,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinitions.I_enter_Security_answer_as()"
});
formatter.result({
  "duration": 947745862,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinitions.I_open_a_new_tab_and_go_to_testing_group()"
});
formatter.result({
  "duration": 7149045432,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinitions.I_post_a_new_discussion_in_Jive()"
});
formatter.result({
  "duration": 3668765103,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cnctester3@dev.thoughtworks.com",
      "offset": 39
    }
  ],
  "location": "stepdefinitions.I_open_a_new_tab_and_login_Gmail_with(String)"
});
formatter.result({
  "duration": 1990508429,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinitions.I_wait_for_a_while()"
});
formatter.result({
  "duration": 40002805286,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinitions.I_get_the_email_in_Gmail()"
});
formatter.result({
  "duration": 10250918523,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[test2017-09-15 17:29]\u003e but was:\u003c[Getting started on Google+]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat step_definitions.stepdefinitions.I_get_the_email_in_Gmail(stepdefinitions.java:232)\n\tat ✽.Then I get the email in Gmail(features/DiscussionJive2Email.feature:17)\n",
  "status": "failed"
});
});