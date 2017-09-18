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
  "duration": 7602364952,
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
  "duration": 662460486,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: keys should be a string\n  (Session info: chrome\u003d60.0.3112.113)\n  (Driver info: chromedriver\u003d2.31.488774 (7e15618d1bf16df8bf0ecf2914ed1964a387ba0b),platform\u003dMac OS X 10.12.6 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 41 milliseconds\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027CNdfzheng.local\u0027, ip: \u0027fe80:0:0:0:ca1:1876:131e:fa7c%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12.6\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.31.488774 (7e15618d1bf16df8bf0ecf2914ed1964a387ba0b), userDataDir\u003d/var/folders/q0/43fl0y850d5g9ph3m8m0yczr0000gn/T/.org.chromium.Chromium.gJ4IpY}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d60.0.3112.113, platform\u003dMAC, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: c046a965253ae301a735fcaa4e6da653\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:671)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:272)\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:96)\n\tat step_definitions.stepdefinitions.I_enter_Username_as_and_Password_as(stepdefinitions.java:64)\n\tat ✽.When I login myTW(features/DiscussionJive2Email.feature:11)\n",
  "status": "failed"
});
formatter.match({
  "location": "stepdefinitions.I_enter_Security_answer_as()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepdefinitions.I_open_a_new_tab_and_go_to_testing_group()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepdefinitions.I_post_a_new_discussion_in_Jive()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "stepdefinitions.I_wait_for_a_while()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepdefinitions.I_get_the_email_in_Gmail()"
});
formatter.result({
  "status": "skipped"
});
});