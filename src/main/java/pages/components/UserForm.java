package pages.components;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.WebUtilities;

public class UserForm extends WebUtilities{
	
	 @FindBy(id = "userName")	
	    public WebElement username;
	 
	 @FindBy(id = "currentAddress")
	    public WebElement address;
	 @FindBy(id = "userEmail")
	    public WebElement email;
	 @FindBy(id = "permanentAddress")
	    public WebElement permanentaddress;
	 @FindBy(id = "submit")
	     public WebElement submit;
}
