
| **Action**                  | **Description**                                                    | **Example**                                      |
| --------------------------- | ------------------------------------------------------------------ | ------------------------------------------------ |
| **click()**                 | Simulates a mouse click on a button, link, checkbox, etc.          | `element.click();`                               |
| **sendKeys() / type()**     | Types text into an input box (used in Selenium / Playwright).      | `element.sendKeys("John");`                      |
| **clear()**                 | Clears text from an input field.                                   | `element.clear();`                               |
| **getText()**               | Reads visible text from an element.                                | `String text = element.getText();`               |
| **getAttribute()**          | Gets the value of an attribute (like `id`, `class`, `href`, etc.). | `String text = element.getAttribute("href");`    |
| **getCssValue()**           | Gets the CSS property value (like color, font-size).               | `String text = element.getCssValue("color");`    |
| **submit()**                | Submits a form element.                                            | `element.submit();`                              |
| **isDisplayed()**           | Checks if the element is visible on the page.                      | `boolean displayed = element.isDisplayed();`                         |
| **isEnabled()**             | Checks if an element (like a button) can be interacted with.       | `boolean enabled = element.isEnabled();`                           |
| **isSelected()**            | Checks if a checkbox or radio button is selected.                  | `boolean selected = element.isSelected();`                          |
| **hover / moveToElement()** | Moves the mouse pointer over an element (for tooltips or menus).   | `actions.moveToElement(element).perform();`      |
| **doubleClick()**           | Performs a double-click on the element.                            | `actions.doubleClick(element).perform();`        |
| **contextClick()**          | Performs a right-click on the element.                             | `actions.contextClick(element).perform();`       |
| **dragAndDrop()**           | Drags an element and drops it onto another element.                | `actions.dragAndDrop(source, target).perform();` |
| **selectByVisibleText()**   | Selects an option from a dropdown by its visible text.             | `select.selectByVisibleText("Option 1");`        |
| **scrollIntoView()**        | Scrolls the page so that the element is visible.                   | `element.scrollIntoView();`                      |
| **getTagName()**            | Returns the HTML tag name of the element.                          | `String text = element.getTagName();`                          |



| Type                 | Comparison Method             | Example                         | Result    |           |        |
| -------------------- | ----------------------------- | ------------------------------- | --------- | --------- | ------ |
| String               | `.equals()`                   | `"cat".equals("cat")`           | ✅ true    |           |        |
| String (ignore case) | `.equalsIgnoreCase()`         | `"Cat".equalsIgnoreCase("cat")` | ✅ true    |           |        |
| Number               | `==`, `>`, `<`, etc.          | `10 > 5`                        | ✅ true    |           |        |
| Floating number      | `Math.abs(a - b) < tolerance` | `                               | 0.3 - 0.3 | < 0.0001` | ✅ true |
| Boolean              | `==`, `!=`                    | `true == false`                 | ❌ false   |           |        |





```
//Complex Scenario for validation or comparing a value

//Identify the element
WebElement username = driver.findElement(By.id("username"));

//Get the value of element
String currentUsernameValue = username.getDomAttribute("value");

//Compare the string value with expected value
if(currentUsernameValue.equals("expected user name value here ")){
    
    System.out.println("Pass");
else {
    System.out.println("Fail");

}



```
