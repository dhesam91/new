$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FlightInfo.feature");
formatter.feature({
  "line": 1,
  "name": "Testing Flight info functionlaity in Flight page",
  "description": "",
  "id": "testing-flight-info-functionlaity-in-flight-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 20661617097,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Checking the flight info functionality",
  "description": "",
  "id": "testing-flight-info-functionlaity-in-flight-page;checking-the-flight-info-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I Open Mercury Flight Application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Click on the Register link in the Home page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Enter details in Registeration page",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "click on flight link, give all details about flight",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user should able to see flight pricing",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeSteps.openFlightApplication()"
});
formatter.result({
  "duration": 6875184319,
  "status": "passed"
});
formatter.match({
  "location": "HomeSteps.navigatetoregisterpage()"
});
formatter.result({
  "duration": 740472980,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.createUserRegistration()"
});
formatter.result({
  "duration": 5570928164,
  "status": "passed"
});
formatter.match({
  "location": "FlightInfoSteps.clickonFlightLink()"
});
formatter.result({
  "duration": 2276876555,
  "status": "passed"
});
formatter.match({
  "location": "FlightInfoSteps.flightconfiramtion()"
});
formatter.result({
  "duration": 25415,
  "status": "passed"
});
formatter.after({
  "duration": 1912109632,
  "status": "passed"
});
formatter.uri("Home.feature");
formatter.feature({
  "line": 1,
  "name": "Testing Register link functionlaity in Flight page",
  "description": "",
  "id": "testing-register-link-functionlaity-in-flight-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6395017910,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Checking the Register link on Home page",
  "description": "",
  "id": "testing-register-link-functionlaity-in-flight-page;checking-the-register-link-on-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I Open Mercury Flight Application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Click on the Register link in the Home page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Register page should displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeSteps.openFlightApplication()"
});
formatter.result({
  "duration": 3369210122,
  "status": "passed"
});
formatter.match({
  "location": "HomeSteps.navigatetoregisterpage()"
});
formatter.result({
  "duration": 1021137323,
  "status": "passed"
});
formatter.match({
  "location": "HomeSteps.registerpagedisplayed()"
});
formatter.result({
  "duration": 36280657,
  "status": "passed"
});
formatter.after({
  "duration": 1024977896,
  "status": "passed"
});
formatter.uri("Register.feature");
formatter.feature({
  "line": 1,
  "name": "Testing User Register functionlaity in Flight page",
  "description": "",
  "id": "testing-user-register-functionlaity-in-flight-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5264735595,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Checking the user Register functionality",
  "description": "",
  "id": "testing-user-register-functionlaity-in-flight-page;checking-the-user-register-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I Open Mercury Flight Application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Click on the Register link in the Home page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Enter details in Registeration page",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user registration successful",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeSteps.openFlightApplication()"
});
formatter.result({
  "duration": 3073135101,
  "status": "passed"
});
formatter.match({
  "location": "HomeSteps.navigatetoregisterpage()"
});
formatter.result({
  "duration": 757032701,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.createUserRegistration()"
});
formatter.result({
  "duration": 5047965616,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.userregisterconfirmation()"
});
formatter.result({
  "duration": 120018631,
  "status": "passed"
});
formatter.after({
  "duration": 994692698,
  "status": "passed"
});
});