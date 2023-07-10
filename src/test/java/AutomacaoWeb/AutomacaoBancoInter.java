package AutomacaoWeb;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomacaoBancoInter {

	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		
		 // Codigo para mostrar o caminho do Chrome
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		 
	    // Codigo para abrir o navegador
		 driver = new ChromeDriver();
		 
	    // Comando para passar o caminho para indicar o site
		 driver.get("https://www.bancointer.com.br/");
		 
	    // Comando para maximizar a tela 
		 driver.manage().window().maximize();
		 
	   // Pausa
		Thread.sleep(2000);
		
		 // fechar cookies
		driver.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
		Thread.sleep(1000);

		
      // Comando para clicar - abra sua conta
		driver.findElement(By.cssSelector("#gatsby-focus-wrapper > div > header > section > div > div > div > div > div.styles__LogoNIcons-sc-1gbjc3e-6.gjJzHM > div.styles__SearchNFlags-sc-1gbjc3e-8.yVPnY > div.styles__ButtonsWrapper-sc-1gbjc3e-9.PKrxs > button:nth-child(1)")).click();
		Thread.sleep(2000);

	  // Comando preencher
		driver.findElement(By.name("nome")).sendKeys("Viviane");
		Thread.sleep(500);
		driver.findElement(By.name("celular")).sendKeys("(77) 99904-5180");
		Thread.sleep(500);
		driver.findElement(By.name("email")).sendKeys("vivianesouza@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.name("cpf")).sendKeys("456.876.907.12");
		Thread.sleep(500);
		driver.findElement(By.name("dataNascimento")).sendKeys("23/09/2005");
		Thread.sleep(500);

		// Comando aceitar politica de privacidade
		driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div:nth-child(6) > div > label")).click();
		Thread.sleep(1000);
		
		// Comando continuar
		driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div.col-12.text-center > div.d-none.d-md-block > button")).click();


		
		Thread.sleep(1000);
       //fechar nevegador
         driver.quit();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
