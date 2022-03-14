package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class LogoutPage {

	private WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"menuUserLink\"]/span")
	protected WebElement iconeDoUsuario;

	@FindBy(xpath = "//*[@id=\"loginMiniTitle\"]/label[3]")
	protected WebElement sair;
	
	@FindBy(xpath = "//*[@id='menuUser']")
	protected WebElement menuUser;
	
	
	@FindBy(xpath = "//*[@id=\"loginMiniTitle\"]/label[3]")
	protected WebElement sair2;
	
	protected void logout(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
