package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class CriarContaPage {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//*[@class='create-new-account ng-scope']")
	protected WebElement criarNovaConta;
		
	@FindBy(xpath = "//input[@name='usernameRegisterPage']")
	protected WebElement usuario;

	@FindBy(xpath = "//input[@name='emailRegisterPage']")
	protected WebElement email;
	
	@FindBy(xpath = "//input[@name='passwordRegisterPage']")
	protected WebElement senha;
	
	@FindBy(xpath = "//input[@name='confirm_passwordRegisterPage']")
	protected WebElement confirmSenha;
	
	@FindBy(xpath = "//input[@name='first_nameRegisterPage']")
	protected WebElement primeiroNome;
	
	@FindBy(xpath = "//input[@name='last_nameRegisterPage']")
	protected WebElement sobreNome;
	
	@FindBy(xpath = "//input[@name='phone_numberRegisterPage']")
	protected WebElement telefone;
	
	@FindBy(xpath = "//*[@name='countryListboxRegisterPage']")
	protected WebElement pais;
	
	@FindBy(xpath = "//*[@name='cityRegisterPage']")
	protected WebElement cidade;
	
	@FindBy(xpath = "//*[@name='addressRegisterPage']")
	protected WebElement endereco;
	
	@FindBy(xpath = "//*[@name='state_/_province_/_regionRegisterPage']")
	protected WebElement estado;
	
	@FindBy(xpath = "//input[@name='i_agree']")
	protected WebElement termoAceito;
	
	@FindBy(xpath = "//button[@id='register_btnundefined']")
	protected WebElement clicarRegistra;
	
	@FindBy(xpath = "//input[@name='postal_codeRegisterPage']")
	protected WebElement codigoPostal;
	
	@FindBy(xpath = "//*[@id='menuUser']")
	protected WebElement menuUser;
	
	protected void cadastroCliente(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
