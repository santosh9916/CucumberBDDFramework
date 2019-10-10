$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/santoshbihari.m/eclipse-workspace/CucumberBDDFramework/src/main/java/com/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Flipkart Login Page",
  "description": "",
  "id": "flipkart-login-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "# without Example keyword"
    },
    {
      "line": 5,
      "value": "#Scenario: Login Test Scenario"
    },
    {
      "line": 6,
      "value": "#Given \tUser is already on Login Page"
    },
    {
      "line": 7,
      "value": "#When \ttitle of login page is flipkart"
    },
    {
      "line": 8,
      "value": "#Then \tuser is enters \"9916410879\" and \"SantosH@2020\""
    },
    {
      "line": 9,
      "value": "#Then \tuser clicks on login button"
    },
    {
      "line": 10,
      "value": "#Then \tuser is in User account page"
    },
    {
      "line": 13,
      "value": "# Using Examples keyword"
    }
  ],
  "line": 14,
  "name": "Login Test Scenario",
  "description": "",
  "id": "flipkart-login-page;login-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "title of login page is flipkart",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user is enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user is in User account page",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "flipkart-login-page;login-test-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 23,
      "id": "flipkart-login-page;login-test-scenario;;1"
    },
    {
      "cells": [
        "santosh",
        "test123"
      ],
      "line": 24,
      "id": "flipkart-login-page;login-test-scenario;;2"
    },
    {
      "cells": [
        "9916410879",
        "SantosH@2020"
      ],
      "line": 25,
      "id": "flipkart-login-page;login-test-scenario;;3"
    },
    {
      "cells": [
        "jhdgh",
        "jknddh"
      ],
      "line": 26,
      "id": "flipkart-login-page;login-test-scenario;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 24,
  "name": "Login Test Scenario",
  "description": "",
  "id": "flipkart-login-page;login-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "title of login page is flipkart",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user is enters \"santosh\" and \"test123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user is in User account page",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_already_an_login_page()"
});
formatter.result({
  "duration": 4672660910,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.title_of_login_page_is_flipkart()"
});
formatter.result({
  "duration": 7068603,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "santosh",
      "offset": 16
    },
    {
      "val": "test123",
      "offset": 30
    }
  ],
  "location": "LoginStepDefination.user_is_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 171392435,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 3081769745,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_is_in_home_page()"
});
formatter.result({
  "duration": 28141874,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@id\u003d\u0027container\u0027]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div\"}\n  (Session info: chrome\u003d76.0.3809.132)\n  (Driver info: chromedriver\u003d2.43.600229 (3fae4d0cda5334b4f533bede5a4787f7b832d052),platform\u003dMac OS X 10.13.6 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027EXIMR-IM-737\u0027, ip: \u0027fe80:0:0:0:82:48f6:4c2:4e9b%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.6\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.43.600229 (3fae4d0cda5334..., userDataDir: /var/folders/h1/0r0zypq52ls...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:51117}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 76.0.3809.132, webStorageEnabled: true}\nSession ID: 94d0597675a7f9f366a285631658227b\n*** Element info: {Using\u003dxpath, value\u003d//div[@id\u003d\u0027container\u0027]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat com.stepDefination.LoginStepDefination.user_is_in_home_page(LoginStepDefination.java:50)\n\tat ✽.Then user is in User account page(/Users/santoshbihari.m/eclipse-workspace/CucumberBDDFramework/src/main/java/com/features/login.feature:19)\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefination.quitBrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 25,
  "name": "Login Test Scenario",
  "description": "",
  "id": "flipkart-login-page;login-test-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "title of login page is flipkart",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user is enters \"9916410879\" and \"SantosH@2020\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user is in User account page",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_already_an_login_page()"
});
formatter.result({
  "duration": 4717900096,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.title_of_login_page_is_flipkart()"
});
formatter.result({
  "duration": 4825899,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9916410879",
      "offset": 16
    },
    {
      "val": "SantosH@2020",
      "offset": 33
    }
  ],
  "location": "LoginStepDefination.user_is_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 199869728,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 3081568884,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_is_in_home_page()"
});
formatter.result({
  "duration": 15182336,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@id\u003d\u0027container\u0027]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div\"}\n  (Session info: chrome\u003d76.0.3809.132)\n  (Driver info: chromedriver\u003d2.43.600229 (3fae4d0cda5334b4f533bede5a4787f7b832d052),platform\u003dMac OS X 10.13.6 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027EXIMR-IM-737\u0027, ip: \u0027fe80:0:0:0:82:48f6:4c2:4e9b%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.6\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.43.600229 (3fae4d0cda5334..., userDataDir: /var/folders/h1/0r0zypq52ls...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:51159}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 76.0.3809.132, webStorageEnabled: true}\nSession ID: 534ba336264a31a94d104305022859a6\n*** Element info: {Using\u003dxpath, value\u003d//div[@id\u003d\u0027container\u0027]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat com.stepDefination.LoginStepDefination.user_is_in_home_page(LoginStepDefination.java:50)\n\tat ✽.Then user is in User account page(/Users/santoshbihari.m/eclipse-workspace/CucumberBDDFramework/src/main/java/com/features/login.feature:19)\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefination.quitBrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 26,
  "name": "Login Test Scenario",
  "description": "",
  "id": "flipkart-login-page;login-test-scenario;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "title of login page is flipkart",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user is enters \"jhdgh\" and \"jknddh\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user is in User account page",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_already_an_login_page()"
});
formatter.result({
  "duration": 4467942402,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.title_of_login_page_is_flipkart()"
});
formatter.result({
  "duration": 5087179,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jhdgh",
      "offset": 16
    },
    {
      "val": "jknddh",
      "offset": 28
    }
  ],
  "location": "LoginStepDefination.user_is_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 151680532,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 3072380762,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_is_in_home_page()"
});
formatter.result({
  "duration": 15095899,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@id\u003d\u0027container\u0027]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div\"}\n  (Session info: chrome\u003d76.0.3809.132)\n  (Driver info: chromedriver\u003d2.43.600229 (3fae4d0cda5334b4f533bede5a4787f7b832d052),platform\u003dMac OS X 10.13.6 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027EXIMR-IM-737\u0027, ip: \u0027fe80:0:0:0:82:48f6:4c2:4e9b%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.6\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.43.600229 (3fae4d0cda5334..., userDataDir: /var/folders/h1/0r0zypq52ls...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:51198}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 76.0.3809.132, webStorageEnabled: true}\nSession ID: 4bd75c438a5dd1287bbcb9b7cc4bc965\n*** Element info: {Using\u003dxpath, value\u003d//div[@id\u003d\u0027container\u0027]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat com.stepDefination.LoginStepDefination.user_is_in_home_page(LoginStepDefination.java:50)\n\tat ✽.Then user is in User account page(/Users/santoshbihari.m/eclipse-workspace/CucumberBDDFramework/src/main/java/com/features/login.feature:19)\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefination.quitBrowser()"
});
formatter.result({
  "status": "skipped"
});
});