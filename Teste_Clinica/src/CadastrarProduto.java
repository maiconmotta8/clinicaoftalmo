import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class CadastrarProduto {

	FirefoxDriver pagina;
	
	@Before
	public void antes() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\181620123\\eclipse\\java-oxygen\\eclipse\\geckodriver.exe");
		pagina = new FirefoxDriver();
		pagina.get("http://10.10.139.13/clinicaOftalmo/index.php");	
	}
	@Test
		public void test() {
			WebElement login = pagina.findElementByName("login");
			login.sendKeys("heineck.bruno@gmail.com");
			
			WebElement senha = pagina.findElementByName("senha");
			senha.sendKeys("1234");
			
			WebElement entrar = pagina.findElementByXPath("/html/body/header/form/input[3]");
			entrar.click();
			
			WebElement produto = pagina.findElementByXPath("/html/body/header/a[2]/button");
			produto.click();
			
			WebElement novoProduto = pagina.findElementByXPath("/html/body/a/button");
			novoProduto.click();
			
			WebElement Nome = pagina.findElementByName("nome");
			Nome.sendKeys("Paracetamol");
			
			WebElement  Preço = pagina.findElementByName("preco");
			Preço.sendKeys("2,75");
			
			WebElement  Quantidade = pagina.findElementByName("quantidade");
			Quantidade.sendKeys("20");
			
			WebElement  Categoria = pagina.findElementByName("categoria");
			Categoria.sendKeys("Remedio");
			
			WebElement  Salvar = pagina.findElementByXPath("/html/body/form/input[5]");
			Salvar.click();
	}
}
