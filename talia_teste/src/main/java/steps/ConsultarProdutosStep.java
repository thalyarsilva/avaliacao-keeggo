package steps;

import org.openqa.selenium.Keys;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ConsultarProdutosPage;
import utils.IniciarNavegador;

public class ConsultarProdutosStep extends ConsultarProdutosPage {

	@Given("que esteja logado no site")
	public void que_esteja_logado_no_site() throws Throwable {
		consultar(IniciarNavegador.navegador);
	}

	@When("clico no icone da lupa")
	public void clico_no_icone_da_lupa() throws Throwable {
		if (secaoDeBusca.isDisplayed()) {
			secaoDeBusca.click();
		}
		
	}

	@And("pesquiso algum produto especifico")
	public void pesquiso_algum_produto_especifico() throws Throwable {
		if (secaoDeBusca.isDisplayed()) {
			campoBusca.sendKeys("BEATS" + Keys.ENTER);
			Thread.sleep(3000);
		} else {
			campoTextoBusca.sendKeys("BEATS" + Keys.ENTER);
			Thread.sleep(3000);
		}
	}

	@Then("aparece na tela opcoes compativeis a minha pesquisa")
	public void aparece_na_tela_opcoes_compativeis_a_minha_pesquisa() throws Throwable {
		Thread.sleep(3000);
		produto.click();
	}

}
