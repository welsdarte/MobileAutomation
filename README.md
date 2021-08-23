
-[STRUCTURE](##Structure)
-[AMU LANGUAGE](##AMU Language)

##Structure
BasePage and TestCases are the main classes that hold out important test information.
All element declarations and actions goes into BasePage class or another class that inherits the BasePage class (CariPage etc.)
All action combinations goes into TestCases class or it's child classes

- to declarate web elements use Xpath and Selenium's FindBy annotation like so:

@FindBy(xpath = "//*[@text='some visible text']")
public WebElement elementName;

or

@FindBy(xpath = "//*[contains(@text,'some text that included by another text')]")
public WebElement elementName;

now you can use these variable to perform simple actions like:

- elementName.click();
- elementName.clear();
- elementName.sendKeys("abc");


##AMU Language






![Screen Shot 2021-08-03 at 05 48 18](https://user-images.githubusercontent.com/71753904/128037175-676230fe-e5c1-4a19-b421-6934d86fb90b.png)
![Screen Shot 2021-08-03 at 05 54 26](https://user-images.githubusercontent.com/71753904/128037505-c1e1320c-f0be-4722-a779-3216043b223d.png)

