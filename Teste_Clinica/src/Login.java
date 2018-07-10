

import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	
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
		

		WebElement email_Cpf = pagina.findElementByName("login");
		WebElement senha = pagina.findElementByName("senha");
		WebElement entrar= pagina.findElementByXPath("/html/body/header/form/input[3]");
		
		
		
		email_Cpf.sendKeys("xeroxdojapones@gmail.com");
		senha.sendKeys("123");
		entrar.click();
		
		
		//JOptionPane.showMessageDialog(null,  "TESTE OK");
	
		
	}
	@After
	public void depois() {
	WebElement header = pagina.findElementByXPath("/html/body/header");
	
	if ( header.getText().contains("Toshi")) {
		JOptionPane.showMessageDialog(null,  "TESTE OK");
	}else {
		JOptionPane.showMessageDialog(null,  "TESTE FALHA");
}
	}
}
