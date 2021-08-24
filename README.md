
- [Structure](#structure)
- [AMU Language](#amu-language)
- [Transpiling](#transpiling)

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
  
  __List of all available actions by now:___
  
  ![Screen Shot 2021-08-24 at 15 04 51](https://user-images.githubusercontent.com/71753904/130613559-9d59067c-3c39-4008-a2f8-162c8fa42cf6.png)

  
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
  
  TestCase blocks must come after from all the scenarios in the .amu file. General amu code looks like this:
  
  ![Screen Shot 2021-08-24 at 15 01 58](https://user-images.githubusercontent.com/71753904/130613381-fe5329db-fdc7-4710-9fb9-ec684dc239f9.png)

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
  
  for more: 
  
  [amuLexer.g4](https://github.com/welsdarte/MobileAutomation/blob/master/src/amuLexer.g4)
  
  [amuParser.g4](https://github.com/welsdarte/MobileAutomation/blob/master/src/amuParser.g4)
  
  
  # Transpling
  
  The __visitor__ visits the parse tree rules and generate java code fragments like statements declarations etc. Generated codes stored in ArrayLists.
  
  __Transpiler__ takes those Arraylists and create Java code and overwrites it to BasePage and TestCases classes.
  
  If new features will be added to grammar, these files must be revised.
  
  After Transpiler executed all the scenarios becomes java methods in BasePage.java and all the testCases becomes @Test annotations in TestCase.java.
  If a wanted action not supported by AMU then custom child classes can be created (UploadPhotoPage extends BasePage and UploadCases extends TestCases) and tests     can be written mannually according to the [above structure](#structure).
  
  For manual tests:
  - [Appium Official Documentation](https://appium.io/docs/en/about-appium/api/)
  - [Appium series](https://www.youtube.com/watch?v=2MHxU2PohII&list=PLPO0LFyCaSo1DKak8ZhEJ3NXrj2shNM0N)
  - [Xpath tester](https://www.freeformatter.com/xpath-tester.html)
  
