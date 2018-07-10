import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testeCliente {

FirefoxDriver pagina;
	
	@Before
	public void antes() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\uc13\\geckodriver.exe");
		pagina = new FirefoxDriver();
		pagina.get("http://10.10.139.13/clinicaOftalmo/");
		
		WebElement login = pagina.findElementByName("login");
		login.sendKeys("xeroxdojapones@gmail.com");

		WebElement senha = pagina.findElementByName("senha");
		senha.sendKeys("123");
		
		WebElement entrar = pagina.findElementByXPath("/html/body/header/form/input[3]");
		entrar.click();
		
	}
	
	@Test
	public void test() {
		WebElement btnCliente = pagina.findElementByXPath("/html/body/header/a[4]/button");
		btnCliente.click();
				
		WebElement btnCadastrarCliente = pagina.findElementByXPath("/html/body/a/button");
		btnCadastrarCliente.click();
				
		WebElement nome = pagina.findElementByName("nome");
		nome.sendKeys("Paulo João");

		WebElement telefone = pagina.findElementByName("telefone");
		telefone.sendKeys("51 996 365 323");
		
		WebElement cpf = pagina.findElementByName("cpf");
		cpf.sendKeys("223 258 147 63");
		
		WebElement email = pagina.findElementByName("email");
		email.sendKeys("paulojoao@gmail.com");
		
		WebElement senha = pagina.findElementByName("senha");
		senha.sendKeys("123");
		
		WebElement senha2 = pagina.findElementByName("senha2");
		senha2.sendKeys("123");
			
		WebElement salvar = pagina.findElementByXPath("/html/body/form/input[8]");
		salvar.click();

		WebElement btnEditar = pagina.findElementByXPath("/html/body/table/tbody/tr[2]/td[6]/a/button");
		btnEditar.click();
		
		WebElement btnExcluir = pagina.findElementByXPath("/html/body/table/tbody/tr[2]/td[7]/a/button");
		btnExcluir.click();
		
	}

	@After
	public void depois() {
		WebElement sair = pagina.findElementByXPath("/html/body/header/a[6]/button");
		sair.click();
		
	}
	
}