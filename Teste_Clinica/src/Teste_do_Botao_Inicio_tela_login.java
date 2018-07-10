

import javax.swing.JOptionPane;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Teste_do_Botao_Inicio_tela_login {
	 FirefoxDriver pagina;
	 @Before
		public void antes() {
			 
			 System.setProperty("webdriver.gecko.driver","C:\\uc13\\geckodriver.exe");
				
				pagina = new FirefoxDriver();
				pagina.get("http://10.10.139.13/clinicaOftalmo/");
				pagina.manage().window().maximize();
				
				WebElement email_Cpf = pagina.findElementByName("login");
				WebElement senha = pagina.findElementByName("senha");
				
				email_Cpf.sendKeys("xeroxdojapones@gmail.com");
				senha.sendKeys("123");

		}
	@Test
	public void test() {
		WebElement inicio = pagina.findElementByXPath("/html/body/header/a[1]/button");
		inicio.click();
//WebElement header = pagina.findElementByXPath("/html/body/header");
		
		//if ( header.getText().contains("maria")) {
		//	JOptionPane.showMessageDialog(null,  "TESTE OK");
		//}else {
		//	JOptionPane.showMessageDialog(null,  "TESTE FALHA");
		
	}
}


