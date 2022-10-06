package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



import utils.Printer;
import utils.WebUtilities;

public class HomePage extends WebUtilities {
   
	Printer log = new Printer(HomePage.class);   
	
	@FindBy(xpath = "//h5[contains(text(), 'Elements')]")   
	public WebElement Elements;
    
	@FindBy(xpath = "//h5[contains(text(), 'Forms')]")   
	public WebElement Forms;
	
}

