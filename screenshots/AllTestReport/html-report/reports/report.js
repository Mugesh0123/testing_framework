$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/muges/eclipse-workspace/test/src/test/resources/featureFile/homebuttonclick.feature");
formatter.feature({
  "name": "To test geeky mart home button functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user have to login geeky mart click home button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user  login page \"https://www.geekymart.com/index.php?route\u003daccount/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeButton.user_login_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user  enter username \"mugeshmugesh35@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "HomeButton.user_enter_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user  enter password \"Mugesh@143\"",
  "keyword": "And "
});
formatter.match({
  "location": "HomeButton.user_enter_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user  in home page \"Logout\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeButton.user_in_home_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click home button",
  "keyword": "And "
});
formatter.match({
  "location": "HomeButton.user_click_home_button()"
});
formatter.result({
  "status": "passed"
});
});