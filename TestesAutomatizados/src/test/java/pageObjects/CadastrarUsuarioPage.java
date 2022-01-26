package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastrarUsuarioPage {
	
	@FindBy(id = "systemUser_employeeName_empName")
	private WebElement campoEmployer;
	
	@FindBy(id = "systemUser_userName")
	private WebElement campoUsername;
	
	@FindBy(id = "systemUser_password")
	private WebElement campoPassword;
	
	@FindBy(id = "systemUser_confirmPassword")
	private WebElement campoConfirmPassword;

	@FindBy(name = "btnSave")
	private WebElement botaoSave;
	
	
	public void informarCampoEmployer(String employerName) {
		campoEmployer.sendKeys(employerName);
		
	}
	
	public void informarCampoUsername(String username) {
		campoUsername.sendKeys(username);		
	}
	
	public void informarCampoPassword(String password) {
		campoPassword.sendKeys(password);
	}
	
	public void informarCampoConfirmPassword(String confirmPassword) {
		campoConfirmPassword.sendKeys(confirmPassword);
	}
	
	public void acionarBotaoSave() {
		botaoSave.click();
		
	}
	
}
