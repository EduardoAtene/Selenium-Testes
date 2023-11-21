package steps;

import org.junit.Assert;
import org.junit.Test;

import pages.LoginPage;
import util.BrowserEdge;

public class LoginSteps extends BrowserEdge {

    LoginPage loginPage = new LoginPage();


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


    @Test
    public void efetuarLoginSemSucessoCamposEmBranco() {

        loginPage.preencherUsernameVazio();
        loginPage.preencherPasswordVazio();
        loginPage.clicarLoginBtn();

        Assert.assertEquals(loginPage.validarLoginSemSucesso(), "Epic sadface: Username is required");
    }



    @Test
    public void efetuarLoginSemSucessoUsernameEmBranco() {

        loginPage.preencherUsernameVazio();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        Assert.assertEquals(loginPage.validarLoginSemSucesso(), "Epic sadface: Username is required");
    }


    @Test
    public void efetuarLoginSemSucessoPasswordEmBranco() {

        loginPage.preencherUsernameCorreto1();
        loginPage.preencherPasswordVazio();
        loginPage.clicarLoginBtn();

        Assert.assertEquals(loginPage.validarLoginSemSucesso(), "Epic sadface: Password is required");
    }


    @Test
    public void efetuarLoginSemSucessoUsernameIncorreto() {

        loginPage.preencherUsernameIncorreto();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        Assert.assertEquals(loginPage.validarLoginSemSucesso(), "Epic sadface: Username and password do not match any user in this service");
    }



    @Test
    public void efetuarLogiSemSucessoPasswordIncorreto() {

        loginPage.preencherUsernameCorreto1();
        loginPage.preencherPasswordIncorreto();
        loginPage.clicarLoginBtn();

        Assert.assertEquals(loginPage.validarLoginSemSucesso(), "Epic sadface: Username and password do not match any user in this service");
    }


    @Test
    public void efetuarLoginSemSucessoUsuarioBloqueado() {

        loginPage.preencherUsernameBloqueado();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        Assert.assertEquals(loginPage.validarLoginSemSucesso(), "Epic sadface: Sorry, this user has been locked out.");
    }

}
