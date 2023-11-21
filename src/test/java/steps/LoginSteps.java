package steps;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import pages.LoginPage;
import util.BaseTest;
import util.Browser;
import util.BrowserEdge;

public class LoginSteps extends BrowserEdge {

    LoginPage loginPage = new LoginPage();

    //==================================================================================================================
    //
    //                                            LOGIN PAGE | Login
    //
    //==================================================================================================================
    // ID:     01
    // TÍTULO: Realizar login COM SUCESSO

    @Test
    public void efetuarLoginComSucesso1() {
        loginPage.preencherUsernameCorreto1();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        Assert.assertEquals(loginPage.validarLoginComSucesso(), "Products");
    }

    @Test
    public void efetuarLoginComSucesso2() {

        loginPage.preencherUsernameCorreto2();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        Assert.assertEquals(loginPage.validarLoginComSucesso(), "Products");
    }

    @Test
    public void efetuarLoginComSucesso3() {

        loginPage.preencherUsernameCorreto3();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        Assert.assertEquals(loginPage.validarLoginComSucesso(), "Products");
    }

    //==================================================================================================================
    // ID:     02
    // TÍTULO: Realizar login SEM SUCESSO - Campos em branco

    @Test
    public void efetuarLoginSemSucessoCamposEmBranco() {

        loginPage.preencherUsernameVazio();
        loginPage.preencherPasswordVazio();
        loginPage.clicarLoginBtn();

        Assert.assertEquals(loginPage.validarLoginSemSucesso(), "Epic sadface: Username is required");
    }


    //==================================================================================================================
    // ID:     03
    // TÍTULO: Realizar login SEM SUCESSO - Campo "Username" em branco

    @Test
    public void efetuarLoginSemSucessoUsernameEmBranco() {

        loginPage.preencherUsernameVazio();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        Assert.assertEquals(loginPage.validarLoginSemSucesso(), "Epic sadface: Username is required");
    }

    //==================================================================================================================
    // ID:     04
    // TÍTULO: Realizar login SEM SUCESSO - Campo "Password" em branco

    @Test
    public void efetuarLoginSemSucessoPasswordEmBranco() {

        loginPage.preencherUsernameCorreto1();
        loginPage.preencherPasswordVazio();
        loginPage.clicarLoginBtn();

        Assert.assertEquals(loginPage.validarLoginSemSucesso(), "Epic sadface: Password is required");
    }

    //==================================================================================================================
    // ID:     05
    // TÍTULO: Realizar login SEM SUCESSO - Campo "Username" incorreto

    @Test
    public void efetuarLoginSemSucessoUsernameIncorreto() {

        loginPage.preencherUsernameIncorreto();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        Assert.assertEquals(loginPage.validarLoginSemSucesso(), "Epic sadface: Username and password do not match any user in this service");
    }

    //==================================================================================================================
    // ID:     06
    // TÍTULO: Realizar login SEM SUCESSO - Campo "Password" incorreto

    @Test
    public void efetuarLogiSemSucessoPasswordIncorreto() {

        loginPage.preencherUsernameCorreto1();
        loginPage.preencherPasswordIncorreto();
        loginPage.clicarLoginBtn();

        Assert.assertEquals(loginPage.validarLoginSemSucesso(), "Epic sadface: Username and password do not match any user in this service");
    }

    //==================================================================================================================
    // ID:     07
    // TÍTULO: Realizar login SEM SUCESSO - Usuário bloqueado

    @Test
    public void efetuarLoginSemSucessoUsuarioBloqueado() {

        loginPage.preencherUsernameBloqueado();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        Assert.assertEquals(loginPage.validarLoginSemSucesso(), "Epic sadface: Sorry, this user has been locked out.");
    }

    //==================================================================================================================

}
