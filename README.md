
- [Structure](#structure)
- [AMU Language](#amu-language)

# Structure
  BasePage and TestCases are the main classes that hold out important test information.
  All element declarations and actions goes into BasePage class or another class that inherits the BasePage class (CariPage etc.)
  All action combinations goes into TestCases class or it's child classes

  - to declarate web elements use Xpath and Selenium's FindBy annotation like so:
  ```
  @FindBy(xpath = "//*[@text='some visible text']")
  public WebElement elementName;
  ```
  or
  ```
  @FindBy(xpath = "//*[contains(@text,'some text that included by another text')]")
  public WebElement elementName;
  ```
  now you can use these variable to perform simple actions like:

  - `elementName.click();`
  - `elementName.clear();`
  - `elementName.sendKeys("abc");`


# AMU Language
AMU stands for Average Mobile User and it is the source code for generating the above structure code in Java.
An .amu file consists of 3 parts:
  - [Action](action)
  - [Scenario](scenario)
  - [TestCase](testCase)
  
  # Action
  Actions are the command-like smallest code pieces in amu language and used for writing scenarios
  
  ex.
  `I clicked "Start" then`
  `I typed "pass1234" to "Enter password...`
  
  # Scenario
  Scenarios are basic containers that can contain multiple actions. They are optimization solution for the test cases' length and complexity by reducing recurring     code size. A scenario block starts with a unique scenario name (identifier), { actions }
  
  ex.
  ```
   loginToApp{
     I clicked "login" then
     I typed "user1" to "username" and
     I typed "pass1" to "password" then
   }
  ```
  
  # TestCase
  TestCases are the final block build with scenarios. On every test case start, app relaunches and returns to its original state (Not full reset). 
  
  ex.
  ```
  canAdd50Cards(
     <loginToApp>
     <addCard:50>
  )
  ```
  
  TestCase blocks must come after from all the scenarios in the .amu file. General amu syntax looks like this:
  
  ```
  scenario1{
    action1
    action2
    action3
  }
  scenario2{
    action1
  }
  
  testCase1(
    <scenario1>
    <scenario2>
  )
  testCase2(
    <scenario2:10>
  )
  ```
  for more: [lexer](https://github.com/welsdarte/MobileAutomation/blob/master/src/amuLexer.g4), [parser](https://github.com/welsdarte/MobileAutomation/blob/master/src/amuParser.g4)
  
  
  After Transpiler executed all the scenarios becomes java methods in BasePage.java and all the testCases becomes @Test annotations in TestCase.java.
  






![Screen Shot 2021-08-03 at 05 48 18](https://user-images.githubusercontent.com/71753904/128037175-676230fe-e5c1-4a19-b421-6934d86fb90b.png)
![Screen Shot 2021-08-03 at 05 54 26](https://user-images.githubusercontent.com/71753904/128037505-c1e1320c-f0be-4722-a779-3216043b223d.png)

