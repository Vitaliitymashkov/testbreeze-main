# Test Automation Framework - Test Breeze
![](img/Symphony_Solutions-and-TEST_BREEZE_logo.png)

## Description
This maven project contains two submodules: common/core module of test automation framework and acceptance test module

Technologies used: Spring, CucumberJVM, TestNG, Selenide, RestAssured, Allure

### Table of contents
1. [Required Software and Tools & Prerequisites](#Required-Software-and-Tools-&-Prerequisites)
2. [How to build maven projects and run all tests](#how-to-run-acceptance-tests)
3. [Reports](#reports)

<a name="required-software-and-tools"></a>
### Required Software and Tools & Prerequisites

* **Java** version: **Oracle Java 11** and higher (to check execute `java --version` in command line after installation)
* **Apache Maven** version: **3.9.4** and higher (to check execute `mvn --version` in command line after installation)
* **Allure commandline** - instructions on [how to install](https://www.npmjs.com/package/allure-commandline) (to check execute `allure --version` in command line after installation)

 <a name="how-to-run-acceptance-tests"></a>
### How to build maven projects and run all tests 

> **_NOTE:_** You may find detailed information about Test Breeze solution [here](Documentation.md)

* Open a terminal or command prompt
* Go to project's root
* Execute `mvn clean install -Dapp_env=dev` in order to run tests
* Supported browsers are: Chrome(default), ChromeHeadless. Pass following parameter `-Dbrowser=ChromeHeadless` in oder to run UI tests in headless mode
* In order to run tests in parallel mode set `dataproviderthreadcount` to value `> 1` for maven-failsafe-plugin properties in pom.xml

<a name="reports"></a>
### Reports  
* Run `allure generate acceptance-tests/target/allure-results --clean -o acceptance-tests/target/site`
* **Allure html test report** should be available under `acceptance-tests/target/site`
* Run `allure open -h localhost acceptance-tests/target/site` in order to open report in the browser
