import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testeBaixar {

	
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
		
		WebElement btnBaixas = pagina.findElementByXPath("/html/body/header/a[5]/button");
		btnBaixas.click();
		
		WebElement btnVisualizar = pagina.findElementByXPath("/html/body/table/tbody/tr[2]/td[4]/a/button");
		btnVisualizar.click();
	}

	@After
	public void depois() {
		WebElement sair = pagina.findElementByXPath("/html/body/header/a[6]/button");
		sair.click();
		
	}
	
}

