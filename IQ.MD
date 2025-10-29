## IQ

### What is automation testing
- Automated Testing allows repetitive tasks to be executed without the intervention of a manual tester. It is used to automate testing tasks that are difficult or time consuming to perform manually
- It’s important for saving time, improving accuracy of the software product, and enabling repetitive testing tasks like regression testing.
- Automation tests can be run at any time of the day. no dependency on human to triggered as it can be scheduled
- Automation tests can also enter test data compare the expected result with the actual result and generate detailed test reports.


### What are advantages/benifits of automation testing
- Faster execution 
- Shift left by running regressing every day or with every build
- reduces chances of human error
- can run anytime of day
- proper detailed report


### What are different components/modules are Selenium product 
### What is difference between  Selenium RC vs Web Driver vs IDE vs Grid (or any combination)
1. Selenium RC (No longer Supported)- 
    - It worked by infusing JavaScript into a website page to control the program's way of behaving
    - It needed RC server to be begun before running tests
    - it was slow and was not compatible with all the browsers
2. Selenium Web Driver (Available to use)- 
    - This is a fresher and further developed instrument for program robotization. 
    - It tends to large numbers of the impediments of Selenium RC and has turned into the standard decision for web testing computerization.
    - cross browser compatiblity using drivers.
3. Selenium IDE (No longer Supported)- 
    - Selenium IDE is primarily a record and playback tool for creating simple automated test scripts. It's a browser extension available for Chrome and Firefox.
    - Selenium IDE is easy to use and is often used by beginners for creating quick test scripts without writing much code.
    - Selenium IDE supports only its own Selenium scripting language, making it less flexible for complex automation tasks.
    - It is limited to browsers with browser extensions (typically Chrome and Firefox).
    - It is for testers who may not have strong programming skills.
    - It is suitable for simple test scenarios and may not be suitable for complex automation tasks.
4. Selenium Grid - 
    - It is a smart proxy server that enables parallel test execution across multiple machines and browser environments. 
    - It works by routing WebDriver commands (in JSON format) from a central hub to one or more remote nodes, each running different browsers or operating systems.


### What is locator?
- A locator identifies web elements which is present in the webpages (e.g., buttons, fields) in Selenium. 
- Types include ID, Name, XPath, CSS Selector, Class Name, Tag Name, Link Text, and Partial Link Text.

### What is Page Object Model (POM) or Maven?
- this is dependency and project workflow management tool commonly known as Build tool for developers.
- this is also commonly used in selenium projects as this is simple to use and it helps with executing the test cases in simple way using plugins.


### What are different wait times?
### What is difference between implicit vs explicit vs fluent wait?

Implicit Waits
An implicit wait tells WebDriver to poll the DOM for a certain amount of time when trying to find any element (or elements) not immediately available. The default setting is 0. Once set, the implicit wait is set for the life of the WebDriver object. Let's consider an example.

```
# import webdriver
from selenium import webdriver

driver = webdriver.Firefox()

# set implicit wait time
driver.implicitly_wait(10) # seconds

# get url (Replace sample URL with your URL )
driver.get("http://somedomain / url_that_delays_loading")

# get element after 10 seconds ( Replace myDynamicElement elememnt with your elememnt id )
myDynamicElement = driver.find_element_by_id("myDynamicElement")
```

This waits up to 10 seconds before throwing a Timeout Exception unless it finds the element to return within 10 seconds. To check out how to practically implement Implicit Waits in WebDriver, checkout.



Credits- https://www.geeksforgeeks.org/software-testing/selenium-webdriver-vs-rc-vs-ide/
