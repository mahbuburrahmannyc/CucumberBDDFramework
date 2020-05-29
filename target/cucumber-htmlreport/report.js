$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Google.feature");
formatter.feature({
  "line": 2,
  "name": "User able to search in Google",
  "description": "",
  "id": "user-able-to-search-in-google",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@google"
    },
    {
      "line": 1,
      "name": "@Regression"
    },
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User Able to Search in Google Positive",
  "description": "",
  "id": "user-able-to-search-in-google;user-able-to-search-in-google-positive",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "User in Google Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Search by key Word \"\u003cKeyword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verify Search result Appear",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "user-able-to-search-in-google;user-able-to-search-in-google-positive;",
  "rows": [
    {
      "cells": [
        "Keyword"
      ],
      "line": 12,
      "id": "user-able-to-search-in-google;user-able-to-search-in-google-positive;;1"
    },
    {
      "cells": [
        "Car"
      ],
      "line": 13,
      "id": "user-able-to-search-in-google;user-able-to-search-in-google-positive;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6171745100,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User Able to Search in Google Positive",
  "description": "",
  "id": "user-able-to-search-in-google;user-able-to-search-in-google-positive;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    },
    {
      "line": 1,
      "name": "@Regression"
    },
    {
      "line": 1,
      "name": "@google"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User in Google Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Search by key Word \"Car\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verify Search result Appear",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSteps.user_in_Google_Home_Page()"
});
formatter.result({
  "duration": 3593809699,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Car",
      "offset": 20
    }
  ],
  "location": "GoogleSteps.search_by_key_Word(String)"
});
formatter.result({
  "duration": 7177231699,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSteps.verify_Search_result_Appear()"
});
formatter.result({
  "duration": 62699,
  "status": "passed"
});
formatter.after({
  "duration": 720208800,
  "status": "passed"
});
formatter.uri("MyNewtoursRegister.feature");
formatter.feature({
  "line": 2,
  "name": "Users ability to create account",
  "description": "",
  "id": "users-ability-to-create-account",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@newtour"
    },
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Positive user Should able to create account using Register",
  "description": "",
  "id": "users-ability-to-create-account;positive-user-should-able-to-create-account-using-register",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Browse to Newtours homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Navigate to register page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Fill form with some basic information",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Complete creating account with \"\u003cUserName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify account created successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "users-ability-to-create-account;positive-user-should-able-to-create-account-using-register;",
  "rows": [
    {
      "cells": [
        "UserName"
      ],
      "line": 14,
      "id": "users-ability-to-create-account;positive-user-should-able-to-create-account-using-register;;1"
    },
    {
      "cells": [
        "Rahman"
      ],
      "line": 15,
      "id": "users-ability-to-create-account;positive-user-should-able-to-create-account-using-register;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3367723900,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Positive user Should able to create account using Register",
  "description": "",
  "id": "users-ability-to-create-account;positive-user-should-able-to-create-account-using-register;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    },
    {
      "line": 1,
      "name": "@newtour"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Browse to Newtours homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Navigate to register page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Fill form with some basic information",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Complete creating account with \"Rahman\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify account created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyNewToursRegisterSteps.browse_to_Newtours_homepage()"
});
formatter.result({
  "duration": 36888450700,
  "status": "passed"
});
formatter.match({
  "location": "MyNewToursRegisterSteps.navigate_to_register_page()"
});
formatter.result({
  "duration": 25818906400,
  "status": "passed"
});
formatter.match({
  "location": "MyNewToursRegisterSteps.fill_form_with_some_basic_information()"
});
formatter.result({
  "duration": 1224630601,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rahman",
      "offset": 32
    }
  ],
  "location": "MyNewToursRegisterSteps.complete_creating_account_with(String)"
});
formatter.result({
  "duration": 34993112500,
  "status": "passed"
});
formatter.match({
  "location": "MyNewToursRegisterSteps.verify_account_created_successfully()"
});
formatter.result({
  "duration": 43942700,
  "status": "passed"
});
formatter.after({
  "duration": 666880899,
  "status": "passed"
});
});