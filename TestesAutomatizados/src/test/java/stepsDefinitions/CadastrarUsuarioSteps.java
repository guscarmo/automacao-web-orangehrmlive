package stepsDefinitions;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastrarUsuarioPage;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.*;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class CadastrarUsuarioSteps {


@Quando("eu acionar aba admin")
public void euAcionarAbaLogin() {
	Na(TelaInicialPage.class).acionarAbaAdmin();
    
}

@Quando("acionar o botao add")
public void acionarOBotaoAdd() {
	Na(TelaInicialPage.class).acionarBotaoAdd();
}

@Quando("informar o campo employer name {string}")
public void informarOCampoEmployerName(String employerName) {
	Na(CadastrarUsuarioPage.class).informarCampoEmployer(employerName);
}

@Quando("informar o campo username {string}")
public void informarOCampoUsername(String username) {
	Na(CadastrarUsuarioPage.class).informarCampoUsername(username);
}

@Quando("informar o campo password {string}")
public void informarOCampoPassword(String password) {
	Na(CadastrarUsuarioPage.class).informarCampoPassword(password);
}

@Quando("informar o campo confirm password {string}")
public void informarOCampoConfirmPassword(String confirmPassword) {
	Na(CadastrarUsuarioPage.class).informarCampoConfirmPassword(confirmPassword);
	
	try{
    	Thread.sleep(1000);
    }
    catch(InterruptedException ie) {
    	
    }
}

@E("acionar o botao salvar")
public void acionarOBotaoSalvar() {
    Na(CadastrarUsuarioPage.class).acionarBotaoSave();
    
}


@Entao("o sistema cadastra o usuario {string}")
public void oSistemaCadastraOUsuario(String username) {
    assertTrue(driver.findElement(By.xpath("//a[text()='" + username + "']")).isDisplayed());
}


	
}
