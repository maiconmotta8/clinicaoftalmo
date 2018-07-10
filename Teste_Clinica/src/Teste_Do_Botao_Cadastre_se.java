

import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

 public class Teste_Do_Botao_Cadastre_se {
	 FirefoxDriver pagina;
	 
	 @Before
		public void antes() {
			 
			 System.setProperty("webdriver.gecko.driver","C:\\uc13\\geckodriver.exe");
				
				pagina = new FirefoxDriver();
				pagina.get("http://10.10.139.13/clinicaOftalmo/");
				pagina.manage().window().maximize();
				
				

		}

	@Test
	public void test() {
		WebElement cadastre_se = pagina.findElementByXPath("/html/body/header/a[3]/button");
		cadastre_se.click();
		
		WebElement nome = pagina.findElementByName("nome");
		WebElement telefone = pagina.findElementByName("telefone");
		WebElement cpf = pagina.findElementByName("cpf");
		WebElement email = pagina.findElementByName("email");
		WebElement senha = pagina.findElementById("senha");
		WebElement confirme_senha = pagina.findElementByName("senha2");
		WebElement salvar = pagina.findElementByXPath("/html/body/form/input[7]");
		nome.sendKeys("maria");
		telefone.sendKeys("51999906691");
		cpf.sendKeys("00817810097");
		email.sendKeys("maria@gmail.com");
		senha.sendKeys("12345");
		confirme_senha.sendKeys("12345");
		salvar.click();
		
		
		
		
	//	JOptionPane.showMessageDialog(null,  "TESTE OK");
		
		
		
		
	}
	@After
	public void depois() {

		WebElement email_Cpf = pagina.findElementByName("login");
		WebElement senha = pagina.findElementByName("senha");
		WebElement entrar= pagina.findElementByXPath("/html/body/header/form/input[3]");
		
		
		
		email_Cpf.sendKeys("maria@gmail.com");
		senha.sendKeys("12345");
		entrar.click();
		WebElement header = pagina.findElementByXPath("/html/body/header");
		
		if ( header.getText().contains("maria")) {
			JOptionPane.showMessageDialog(null,  "TESTE OK");
		}else {
			JOptionPane.showMessageDialog(null,  "TESTE FALHA");
		}
		
		
	}

}
