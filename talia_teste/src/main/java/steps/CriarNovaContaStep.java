package steps;

import java.util.Random;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CriarContaPage;
import utils.IniciarNavegador;

public class CriarNovaContaStep extends CriarContaPage{
	WebDriver drive;
	Random numeroAleatorio = new Random();

	@Given("que abro a pagina de login")
	public void que_abro_a_pagina_de_login() {
		cadastroCliente(IniciarNavegador.navegador);
	}
	@When("clico em criar uma nova conta")
	public void clico_em_criar_uma_nova_conta() throws Throwable {
		menuUser.click();
		Thread.sleep(3000);
		criarNovaConta.click();
	}
	@And("preencho meu cadatro com detalhes da conta, detalhes pessoais, morada.Concordo com os termos de uso e privacidade")
	public void preencho_meu_cadatro_com_detalhes_da_conta_detalhes_pessoais_morada_concordo_com_os_termos_de_uso_e_privacidade() throws Throwable {
		 
		usuario.sendKeys("Talia" + numeroAleatorio.nextInt(1000));
		email.sendKeys("talia_rocha@yahoo.com.br");
		senha.sendKeys("Talia123");
		confirmSenha.sendKeys("Talia123");
		primeiroNome.sendKeys("Talia");
		sobreNome.sendKeys("Rocha");
		telefone.sendKeys("(11)98425-0626");
		pais.click();
		new Select(pais).selectByVisibleText("Brazil");
		cidade.sendKeys("Cotia");
		Thread.sleep(1000);
		endereco.sendKeys("Rua das Flores, 185");
		estado.sendKeys("São Paulo" + Keys.CONTROL + Keys.END);
		Thread.sleep(2000);
		codigoPostal.sendKeys("02759-070");
		termoAceito.click();
		
	}
	@Then("realizo meu registro com sucesso")
	public void realizo_meu_registro_com_sucesso() throws Throwable {
		clicarRegistra.click();
	}



	
}
