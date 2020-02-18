package exceltask;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo1 extends Baseclass {
	public Pojo1() {
PageFactory.initElements(dr, this);
	}
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement lastname;
	

	
	public WebElement getLastname() {
		return lastname;
	}


	public WebElement getFirstname() {
		return firstname;
	}
	
	
	

}
