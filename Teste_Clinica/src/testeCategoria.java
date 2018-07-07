import javax.swing.JOptionPane;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testeCategoria {

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
		
		
		
		WebElement btnCategoria = pagina.findElementByXPath("/html/body/header/a[3]/button");
		btnCategoria.click();
		
		

	}

}
