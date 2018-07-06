

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	
	FirefoxDriver pagina;
	
	@Before
	public void antes() {
		 
		 System.setProperty("webdriver.gecko.driver","C:\\uc13\\geckodriver.exe");
			
			pagina = new FirefoxDriver();
			pagina.get("https://www.senacrs.com.br/");
			
	}

	@Test
	public void test() {
		
	}

}
