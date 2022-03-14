package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdicionarProdutosPage;
import utils.IniciarNavegador;

public class AdicionarProdutosStep extends AdicionarProdutosPage {

	@Given("com navegador aberto na url correta")
	public void com_navegador_aberto_na_url_correta() throws Throwable {
		adicionar(IniciarNavegador.navegador);
	}

	@When("clico em um produto especifico")
	public void clico_em_um_produto_especifico() {
		caixaDeSom.click();
	}

	@And("o adiciono no meu carrinho")
	public void o_adiciono_no_meu_carrinho() throws Throwable {
		Thread.sleep(2000);
		compreAgora.click();
		adicionarAoCarrinho.click();
	}
	
	@Then("valido o produto adicionado com sucesso")
	public void valido_o_produto_adicionado_com_sucesso() throws Throwable {
		Thread.sleep(2000);
		carrinhoDeCompra.click();
	}
	
}
