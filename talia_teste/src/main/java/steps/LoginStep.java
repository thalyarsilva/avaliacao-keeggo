package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.CapturarTelas;
import utils.IniciarNavegador;

public class LoginStep extends LoginPage {

	WebDriver driver = new ChromeDriver();

	@Given("que esteja no site Advantage clico no icone USER")
	public void que_esteja_no_site_Advantage_clico_no_icone_USER() throws Throwable {
		login(IniciarNavegador.navegador);
		Thread.sleep(2000);
		menuUser.click();

	}

	@When("preencho o campo usuario")
	public void preencho_o_campo_usuario() throws Throwable {
		usuario.sendKeys("talia.rocha");
		Thread.sleep(3000);
	}

	@And("preencho o campo senha")
	public void preencho_o_campo_senha() throws Throwable {
		senha.sendKeys("Miranilde28");
		Thread.sleep(3000);
	}

	@And("clico em SigIn")
	public void clico_em_sig_in() {
		btnAcessar.click();
	}

	@Then("valido o acesso ao sistema")
	public void valido_o_acesso_ao_sistema() throws Throwable {
		login(IniciarNavegador.navegador);
		Assert.assertEquals(iconeDoUsuario.isDisplayed() , true);

	}
}
