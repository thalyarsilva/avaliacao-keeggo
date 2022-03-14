package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class AdicionarProdutosPage {
	
		private WebDriver driver;
	
		@FindBy(xpath = "//div[@id='speakersImg']")
		protected WebElement caixaDeSom;
		
		@FindBy(xpath = "//button[@name='buy_now']")
		protected WebElement compreAgora;
	
		@FindBy(xpath = "//button[@name='save_to_cart']")
		protected WebElement adicionarAoCarrinho;
		
		@FindBy(xpath = "//*[@id='menuCart']")
		protected WebElement carrinhoDeCompra;
		
		protected void adicionar(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	}

