package steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LogoutPage;
import utils.IniciarNavegador;

public class LogoutStep extends LogoutPage {

	@Given("que estou logado no sistema")
	public void que_estou_logado_no_sistema() throws Throwable {
	}

	@When("clico no menu user")
	public void clico_no_menu_user() throws Throwable {
		logout(IniciarNavegador.navegador);
		iconeDoUsuario.click();
	}

	@And("clico em sair")
	public void clico_em_sair() throws Throwable {
		Thread.sleep(3000);
		sair.click();
	}

	@Then("valido o Logout")
	public void valido_o_Logout() throws Throwable {
		logout(IniciarNavegador.navegador);
		Assert.assertEquals(iconeDoUsuario.isDisplayed() , false);
	}


	
}
