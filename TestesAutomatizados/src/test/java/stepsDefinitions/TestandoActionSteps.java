package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class TestandoActionSteps {
	
	@Quando("eu acionar o submenu customField")
	public void euAcionarOSubmenuCustomField() {
	    Na(TelaInicialPage.class).acessarMenuCustomFields();
	}

	@Entao("o sistema apresenta a tela customField")
	public void oSistemaApresentaATelaCustomField() {
	    assertEquals("Add Custom Field", driver.findElement(By.id("heading")).getText());
	}

}
