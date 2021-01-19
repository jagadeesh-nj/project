package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePageObjects {
	

	    WebDriver driver; 
	
	
	    @FindBy(xpath = "//span[@class = 'nav-line-2 nav-long-width']")
		private WebElement signin;
		
	
	    @FindBy(xpath = "//input[@type= 'email']")
	    private WebElement username;
	    
	    @FindBy(xpath = "//span[@id='continue']")
	    private WebElement continuebtn;
	
	    @FindBy(xpath = "//input[@type= 'password']")
	    private WebElement password;
	
	
	    @FindBy(xpath = "//input[@id = 'signInSubmit']")
	    private WebElement  submitbutton;
	
	
	
		@FindBy(xpath = "//input[@id= 'twotabsearchtextbox']")
		private WebElement searchfeild;
		
		@FindBy(xpath = "//input[@id = 'nav-search-submit-button']")
		private WebElement searchbtn;

		@FindBy(xpath = "//span[contains( text(), 'Gionee 10000mAh Li-Polymer S')]")
		private WebElement item;
		
		@FindBy(xpath = "//input[@id='buy-now-button']")
		private WebElement buybtn;
		
	
		public AmazonHomePageObjects(WebDriver driver){
			this.driver = driver;
			PageFactory.initElements(driver, this);
			
	}
	

	public WebElement clickOnSignin() {
		return signin ; 
	}
	
	
	public void enterUserName(String usernameDetails) {
		 username.sendKeys(usernameDetails);; 
	}
	
	public WebElement clickOnctnbtn() {
		return continuebtn ; 
	}
	
	
	public void enterpassword(String passworddetails) {
		 password.sendKeys(passworddetails); ; 
	}
	
	
	public WebElement clickOnLogin() {
		return submitbutton ; 
	}
	
	public void enterSearchcriteria(String itemdetails) {
		searchfeild.sendKeys(itemdetails);
		
	}
	
	public WebElement clickOnsearch(){
		return searchbtn;
}
	
	public WebElement clickOnitem(){
		return item;
	}
	
	public WebElement clickOnbuy(){
		return buybtn;
	}
	
	
}
