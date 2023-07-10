package AutomacaoWeb;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutomacaoCadastroBootStrap {

	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		 
		    // Codigo para abrir o navegador
			 driver = new ChromeDriver();
			 
		    // Comando para passar o caminho para indicar o site
			 driver.get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap");
			 Thread.sleep(2000);
 
		    // Comando para maximizar a tela 
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.id("switch-version-select")).click();
			 Thread.sleep(2000);

			 driver.findElement(By.cssSelector("#switch-version-select > option:nth-child(4)")).click();
			 Thread.sleep(1000);

			 driver.findElement(By.cssSelector("#gcrud-search-form > div.header-tools > div.floatL.t5 > a")).click();
			 Thread.sleep(1000);
			 
			 driver.findElement(By.cssSelector("#gcrud-search-form > div.header-tools > div.floatL.t5 > a > font > font")).click();
			 Thread.sleep(1000);
			
			 driver.findElement(By.xpath("//*[@id=\"field-customerName\"]")).sendKeys("Viviane");
			 Thread.sleep(1000);

			 driver.findElement(By.id("field-contactLastName")).sendKeys("Souza");
			 Thread.sleep(1000);

			  driver.findElement(By.id("id=\"field-contactFirstName\"")).sendKeys("viviane");
			 Thread.sleep(1000);
			 
			  driver.findElement(By.id("field-phone")).sendKeys("77 999110703");
			 Thread.sleep(1000);

			  driver.findElement(By.id("field-addressLine1")).sendKeys("Rua Otilia");
			 Thread.sleep(1000);
			 
			  driver.findElement(By.id("field-addressLine2")).sendKeys("Rua Castro");
			 Thread.sleep(1000);

			  driver.findElement(By.id("field-city")).sendKeys("Serra Dourada");
			 Thread.sleep(1000);

			  driver.findElement(By.id("field-state")).sendKeys("Bahia");
			  Thread.sleep(1000);

			  driver.findElement(By.id("field-postalCode")).sendKeys("47740000");
			  Thread.sleep(1000);

			  driver.findElement(By.id("id=\"field-country\"")).sendKeys("Brasil");
			  Thread.sleep(1000);

			  driver.findElement(By.id("id=\"field-salesRepEmployeeNumber\"")).sendKeys(" nao sei");
			  Thread.sleep(1000);

			  driver.findElement(By.id("id=\"field-creditLimit\"")).sendKeys(" 1000");
		      Thread.sleep(1000);

			  driver.findElement(By.id("id=\"field-deleted\"")).sendKeys("nao");
			 Thread.sleep(2000);

			  driver.findElement(By.cssSelector("#form-button-save > font > font")).click();
			 


		
			 
			 
		Thread.sleep(2000);
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
