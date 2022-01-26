package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static utils.Utils.*;

public class TelaInicialPage extends BasePage {
	
	
	//BasePage
	public void acionarAbaAdmin() {
		abaAdmin.click();		
	}
	
	//ELEMENTOS
	@FindBy(name = "btnAdd")
	private WebElement botaoAdd;
	
	public void acionarBotaoAdd() {
		botaoAdd.click();
		
	}
	
	public void acessarMenuCustomFields() {
		Actions acao = new Actions(driver);
		acao.moveToElement(abaPIM).build().perform();
		acao.moveToElement(menuConfiguration).build().perform();
		acao.moveToElement(menuCustomFields).click().build().perform();
	}
	
	
	
}
