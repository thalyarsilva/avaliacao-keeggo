package utils;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.AfterStep;

public class CapturarTelas {
	
	public static void tirarPrint(String nomeArquivo) throws Exception {

		TakesScreenshot captura = ((TakesScreenshot) IniciarNavegador.navegador);
		File arqCaptura = captura.getScreenshotAs(OutputType.FILE);
		String dirImg = System.getProperty("user.dir") + "/Evidencias/";
		try {
			FileUtils.copyFile(arqCaptura, new File(dirImg, nomeArquivo));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@AfterStep
	public void tirarPrint() throws Exception {

		Thread.sleep(1000);
		Date dataAtual = new Date();
		DateFormat formatoData = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
		String dataFormatada = formatoData.format(dataAtual);
		String capturaTelaNome = "Evidencia " + dataFormatada + ".png";
		CapturarTelas.tirarPrint(capturaTelaNome);
	}

}
