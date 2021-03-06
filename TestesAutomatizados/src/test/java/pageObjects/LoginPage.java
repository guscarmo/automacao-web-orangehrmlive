package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(name = "txtUsername")
	private WebElement campoUsuario;
	
	@FindBy(xpath = "//input[@name='txtPassword']")
			//or xpath = //div[@id='divPassword']//input[@name='txtPassword']
	private WebElement campoSenha;
	
	@FindBy(name = "Submit")
	private WebElement botaoLogin;
	
	@FindBy(xpath = "//span[contains(text(), 'admin123')]")
	private WebElement link;


	public void informarCampoUsuario(String usuario) {
		campoUsuario.sendKeys(usuario);
	}
	
	public void informarCampoSenha(String senha) {
		campoSenha.sendKeys(senha);
	}
	
	public void acionarBotaoLogin() {		
		botaoLogin.click();
	}
	
	public void realizarLogin(String usuario, String senha) {
		informarCampoUsuario(usuario);
		informarCampoSenha(senha);
		acionarBotaoLogin();
		
		
	}
}
