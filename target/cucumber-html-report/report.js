$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/User/workspace/POMC/src/main/java/FeaturesRunner/Amazon.feature");
formatter.feature({
  "line": 1,
  "name": "Amazon Signin and Product selection",
  "description": "",
  "id": "amazon-signin-and-product-selection",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "User able to signin and select product",
  "description": "",
  "id": "amazon-signin-and-product-selection;user-able-to-signin-and-select-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User already opened the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Amazon Logo is visible",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User will hover to signin button and click it",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "SignIn page will be open",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "enter username and password and signin",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validate homepage login",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_has_already_opened_the_browser()"
});
formatter.result({
  "duration": 13960427022,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.amazon_Logo_is_visible()"
});
formatter.result({
  "duration": 25332514,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.isDisplayed(Unknown Source)\r\n\tat pages.AmazonLoginPage.ValidateSignLogo(AmazonLoginPage.java:41)\r\n\tat Stepdefinitions.StepDefinitions.amazon_Logo_is_visible(StepDefinitions.java:28)\r\n\tat ✽.When Amazon Logo is visible(C:/Users/User/workspace/POMC/src/main/java/FeaturesRunner/Amazon.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinitions.user_will_hover_to_signin_button_and_click_it()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.signin_page_will_be_open()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.enter_username_and_password_and_signin()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.validate_homepage_login()"
});
formatter.result({
  "status": "skipped"
});
});