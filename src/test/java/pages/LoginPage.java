package pages;

import org.openqa.selenium.By;
import util.BaseTest;

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
    public void preencherUsernameCorreto1() { BaseTest.sendKeys(frmUsername, "standard_user"); }
    public void preencherUsernameCorreto2() { BaseTest.sendKeys(frmUsername, "problem_user"); }
    public void preencherUsernameCorreto3() { BaseTest.sendKeys(frmUsername, "performance_glitch_user"); }
    public void preencherPasswordCorreto() {
        BaseTest.sendKeys(frmPassword, "secret_sauce");
    }

    //------------------------------------------------------------------------------------------------------------------

    // Preencher com dados incorretos / inválidos / em branco:
    public void preencherUsernameIncorreto() {
        BaseTest.sendKeys(frmUsername, "UsernameIncorreto");
    }
    public void preencherPasswordIncorreto() {
        BaseTest.sendKeys(frmPassword, "PasswordIncorreto");
    }
    public void preencherUsernameVazio() {
        BaseTest.sendKeys(frmUsername, "");
    }
    public void preencherPasswordVazio() {
        BaseTest.sendKeys(frmPassword, "");
    }
    public void preencherUsernameBloqueado() { BaseTest.sendKeys(frmUsername, "locked_out_user"); }

    //------------------------------------------------------------------------------------------------------------------

    // Efetuar Login:
    public void clicarLoginBtn() {
        BaseTest.click(btnLogin);
    }

    //------------------------------------------------------------------------------------------------------------------

    // Validações:
    public String validarLoginComSucesso() {
        return BaseTest.getText(mnuProducts);
    }
    public String validarLoginSemSucesso() {
        return BaseTest.getText(lblIncorrectLogin);
    }

    //------------------------------------------------------------------------------------------------------------------

}
