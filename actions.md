| Action Type               | Example                                         | Description                                    |
| ------------------------- | ----------------------------------------------- | ---------------------------------------------- |
| Enter text                | `sendKeys("<whatever you want to enter>")`      | Sends input text to the input fields           |
| Get Field Value           | `getDomAttribute("value")`                      | Gets value of input fields                     |
| Click element             | `click()`                                       | Clicks a web element                           |
| element is displayed      | `isDisplayed()`                                 | to check if element is displayed               |


| **Action**                  | **Description**                                                    | **Example**                                      |
| --------------------------- | ------------------------------------------------------------------ | ------------------------------------------------ |
| **click()**                 | Simulates a mouse click on a button, link, checkbox, etc.          | `element.click();`                               |
| **sendKeys() / type()**     | Types text into an input box (used in Selenium / Playwright).      | `element.sendKeys("John");`                      |
| **clear()**                 | Clears text from an input field.                                   | `element.clear();`                               |
| **getText()**               | Reads visible text from an element.                                | `String text = element.getText();`               |
| **getAttribute()**          | Gets the value of an attribute (like `id`, `class`, `href`, etc.). | `String text = element.getAttribute("href");`                  |
| **getCssValue()**           | Gets the CSS property value (like color, font-size).               | `String text = element.getCssValue("color");`                  |
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




```
//Complex Scenario for validation or comparing a value






```
