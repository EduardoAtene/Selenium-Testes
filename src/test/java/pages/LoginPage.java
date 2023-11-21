package pages;

import org.openqa.selenium.By;
import util.Evento;

public class LoginPage {

    //==================================================================================================================
    //                                           Login Page
    //==================================================================================================================

    // Declaração de campos de preenchimento:

    public static final By frmUsername = By.cssSelector("#user-name");
    public static final By frmPassword = By.cssSelector("#password");
    public static final By btnLogin = By.cssSelector("#login-button");

    // Declaração de campos de validações:
    public static final By mnuProducts= By.cssSelector("#header_container > div.header_secondary_container > span");
    public static final By lblIncorrectLogin = By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3");


    //==================================================================================================================

    // MÉTODOS:

    // Preencher com dados válidos:
    public void preencherUsernameCorreto1() { Evento.sendKeys(frmUsername, "standard_user"); }
    public void preencherUsernameCorreto2() { Evento.sendKeys(frmUsername, "problem_user"); }
    public void preencherUsernameCorreto3() { Evento.sendKeys(frmUsername, "performance_glitch_user"); }
    public void preencherPasswordCorreto() {
        Evento.sendKeys(frmPassword, "secret_sauce");
    }

    //------------------------------------------------------------------------------------------------------------------

    // Preencher com dados incorretos / inválidos / em branco:
    public void preencherUsernameIncorreto() {
        Evento.sendKeys(frmUsername, "UsernameIncorreto");
    }
    public void preencherPasswordIncorreto() {
        Evento.sendKeys(frmPassword, "PasswordIncorreto");
    }
    public void preencherUsernameVazio() {
        Evento.sendKeys(frmUsername, "");
    }
    public void preencherPasswordVazio() {
        Evento.sendKeys(frmPassword, "");
    }
    public void preencherUsernameBloqueado() { Evento.sendKeys(frmUsername, "locked_out_user"); }

    //------------------------------------------------------------------------------------------------------------------

    // Efetuar Login:
    public void clicarLoginBtn() {
        Evento.click(btnLogin);
    }

    //------------------------------------------------------------------------------------------------------------------

    // Validações:
    public String validarLoginComSucesso() {
        return Evento.getText(mnuProducts);
    }
    public String validarLoginSemSucesso() {
        return Evento.getText(lblIncorrectLogin);
    }

    //------------------------------------------------------------------------------------------------------------------

}
