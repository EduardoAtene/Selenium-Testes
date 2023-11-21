package pages;

import org.openqa.selenium.By;
import util.Evento;

public class CheckoutPage {

    //==================================================================================================================
    //                                          Página Checkout | CADASTRO
    //==================================================================================================================

    // DECLARAÇÃO DOS CAMPOS:

    public static final By firstName = By.cssSelector("#first-name");
    public static final By lastName = By.cssSelector("#last-name");
    public static final By zipCode = By.cssSelector("#postal-code");
    public static final By continueBtn = By.cssSelector("#continue");

    public static final By msgCheckout = By.cssSelector("#header_container > div.header_secondary_container > span");
    public static final By msgCheckoutError = By.cssSelector("#checkout_info_container > div > form > div.checkout_info > div.error-message-container.error > h3");

    public void preencherFirstName() {
        Evento.sendKeys(firstName, "Coraline");
    }

    public void preencherLastName() {
        Evento.sendKeys(lastName, "Jones");
    }

    public void preencherZipCode() {
        Evento.sendKeys(zipCode, "12345");
    }

    public void preencherFirstNameVazio() {
        Evento.sendKeys(firstName, "");
    }

    public void preencherLastNameVazio() {
        Evento.sendKeys(lastName, "");
    }

    public void preencherZipCodeVazio() {
        Evento.sendKeys(zipCode, "");
    }

    public void clicarContinueBtn() {
        Evento.click(continueBtn);
    }

    public String validarCheckoutComSucesso() {
        return Evento.getText(msgCheckout);
    }

    public String validarCheckoutSemSucesso() {
        return Evento.getText(msgCheckoutError);
    }

}
