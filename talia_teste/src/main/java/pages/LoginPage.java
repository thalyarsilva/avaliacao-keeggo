package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;
import utils.IniciarNavegador;

@Getter
public class LoginPage {

	private WebDriver driver;
		
	@FindBy(xpath = "//*[@id='menuUser']")
	protected WebElement menuUser;

	@FindBy(xpath = "//input[@name='username']")
	protected WebElement usuario;

	@FindBy(xpath = "//input[@name='password']")
	protected WebElement senha;

	@FindBy(xpath = "//button[@id='sign_in_btnundefined']")
	protected WebElement btnAcessar;
	
	@FindBy(xpath = "//*[@id=\"menuUserLink\"]/span")
	protected WebElement iconeDoUsuario;

	protected void login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
