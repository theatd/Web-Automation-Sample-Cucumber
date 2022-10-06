package pages.components;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.WebUtilities;

public class SubregistrationForm extends WebUtilities{
	
	 @FindBy(id = "firstName")	
	    public WebElement firstname;
	 @FindBy(id = "lastName")
	    public WebElement lastname;
	 @FindBy(id = "userEmail")
	    public WebElement email;

}
