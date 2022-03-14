package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class ConsultarProdutosPage {
	
	private WebDriver driver;
	
	
	@FindBy(xpath = "//*[@id='menuSearch' and @class='img']")
	protected WebElement lupa;
	
	@FindBy(id = "searchSection")
	protected WebElement secaoDeBusca;
	
	@FindBy(id = "autoComplete")
	protected WebElement campoBusca;
	
	@FindBy(xpath = "//input[@name='mobile_search']")
	protected WebElement campoTextoBusca;
	
	@FindBy(xpath = "//img[@id='15']")
	protected WebElement produto;
	
	protected void consultar(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
