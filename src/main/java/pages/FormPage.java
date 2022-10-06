package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.components.SubregistrationForm;
import utils.Printer;
import utils.WebUtilities;

public class FormPage extends WebUtilities {
   
	Printer log = new Printer(FormPage.class);   
	
	@FindBy(xpath = "//div[@class='main-header']")   
	public WebElement title;

	
	@FindBy(xpath = "//*[@id='item-0']/span[contains(text(), 'Practice Form')]") 
	public WebElement Practice_Form;
	
	@FindBy(xpath = "//h5[contains(text(), 'Student Registration Form')]")   
	public WebElement Student_Registration_Form;
	
	@FindBy(id = "userForm")
	public SubregistrationForm subRegistrationform;
}  

