| Locator Type              | Example                                         | Description                                    |
| ------------------------- | ----------------------------------------------- | ---------------------------------------------- |
| **By.id**                 | `By.id("username")`                             | Fastest and unique                             |
| **By.name**               | `By.name("pass")`                               | Common for form inputs                         |
| **By.className**          | `By.className("primary")`                       | Finds by class attribute                       |
| **By.cssSelector**        | `form#loginForm button[name='cancel']`          | Uses CSS syntax for flexible element selection |
| **By.xpath (text)**       | `//a[text()='Forgot Password?']`                | Finds element by exact text                    |
| **By.xpath (contains)**   | `//a[contains(text(),'Forgot')]`                | Partial text matching                          |
| **By.xpath (conditions)** | `//input[@type='password' and @id='password']`  | Multiple attribute conditions                  |
| **By.xpath (hierarchy)**  | `//div[@class='actions']/button[@name='login']` | Finds child elements within a specific parent  |
