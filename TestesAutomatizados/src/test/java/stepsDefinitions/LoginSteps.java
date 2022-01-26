package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;
import static utils.Utils.*;

public class LoginSteps {
	
	
	@Quando("eu informar o usuario {string}")
	public void euInformarOUsuario(String usuario) {
		Na(LoginPage.class).informarCampoUsuario(usuario);
	}

	@Quando("informar a senha {string}")
	public void informarASenha(String senha) {
		Na(LoginPage.class).informarCampoSenha(senha);

	}

	@Quando("clicar no botao login")
	public void clicarNoBotaoLogin() {
		Na(LoginPage.class).acionarBotaoLogin();
	}

	@Entao("o sistema exibe a mensagem de usuario invalido")
	public void oSistemaExibeAMensagemDeUsuarioInvalido() {
	    assertEquals("Invalid credentials", driver.findElement(By.id("spanMessage")).getText());
	}

	@Quando("eu infomar o usuario {string}")
	public void euInfomarOUsuario(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Entao("o sistema exibe o usuario logado")
	public void oSistemaExibeOUsuarioLogado() {
		assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
	    
	}


}
