package utils;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class IniciarNavegador {
	
	public static WebDriver navegador;
	public static String url = "https://advantageonlineshopping.com/#/";

	@Before
	public void iniciar() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chrome/versions/99/chromedriver.exe");
		navegador = new ChromeDriver();
		navegador.navigate().to(url);
		navegador.manage().window().maximize();
		navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	//@AfterClass
	public static WebDriver finalizar() {
		if (navegador != null) {
			navegador.quit();
			navegador = null;

		}
		return navegador;

	}
	
}
