package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.components.UserForm;
import utils.Printer;
import utils.WebUtilities;

public class ElementPage extends WebUtilities {
   
	Printer log = new Printer(ElementPage.class);   
	
	@FindBy(xpath = "//div[@class='main-header']")   
	public WebElement page_title;
	
	@FindBy(xpath = "//*[@id='item-0']/span[contains(text(), 'Text Box')]") 
	public WebElement Textbox;
	
	@FindBy(id = "userForm")
	public UserForm userForm;
	
	 @FindBy(id = "name")	
	 public WebElement name; 
	 @FindBy(id = "email")
	    public WebElement email;
	 @FindBy(xpath = "//*[@id='currentAddress' and @class='mb-1']")
	    public WebElement current_address;
	 @FindBy(xpath = "//*[@id='permanentAddress'and @class='mb-1']")
	    public WebElement permanent_address;
}  

