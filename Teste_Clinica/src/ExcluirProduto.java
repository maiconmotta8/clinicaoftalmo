import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ExcluirProduto {

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
			
			WebElement excluir = pagina.findElementByXPath("/html/body/table/tbody/tr[3]/td[9]/a/button");
			excluir.click();
	}

}