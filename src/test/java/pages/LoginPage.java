package pages;

import org.openqa.selenium.By;
import util.Evento;

public class LoginPage {

    public static final By frmUsername = By.cssSelector("#user-name");
    public static final By frmPassword = By.cssSelector("#password");
    public static final By btnLogin = By.cssSelector("#login-button");

    public static final By mnuProducts= By.cssSelector("#header_container > div.header_secondary_container > span");
    public static final By lblIncorrectLogin = By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3");



    public void preencherUsernameCorreto1() { Evento.sendKeys(frmUsername, "standard_user"); }
    public void preencherUsernameCorreto2() { Evento.sendKeys(frmUsername, "problem_user"); }
    public void preencherUsernameCorreto3() { Evento.sendKeys(frmUsername, "performance_glitch_user"); }
    public void preencherPasswordCorreto() {
        Evento.sendKeys(frmPassword, "secret_sauce");
    }


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


    public void clicarLoginBtn() {
        Evento.click(btnLogin);
    }


    public String validarLoginComSucesso() {
        return Evento.getText(mnuProducts);
    }
    public String validarLoginSemSucesso() {
        return Evento.getText(lblIncorrectLogin);
    }


}
