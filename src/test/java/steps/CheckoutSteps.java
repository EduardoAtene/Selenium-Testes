package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.InventoryPage;
import util.Browser;
import util.BrowserEdge;

public class CheckoutSteps extends BrowserEdge {

    LoginSteps loginSteps = new LoginSteps();

    InventoryPage inventoryPage = new InventoryPage();

    CartPage cartPage = new CartPage();

    CheckoutPage checkoutPage = new CheckoutPage();


    @Test
    public void efetuarCheckoutComSucesso() {
        loginSteps.efetuarLoginComSucesso1();

        inventoryPage.clicarAddBackpack();
        inventoryPage.clicarAddTShirt();
        inventoryPage.clicarAddOnesie();
        inventoryPage.clicarAddBikeLight();
        inventoryPage.clicarAddJacket();
        inventoryPage.clicarAddRedTShirt();
        inventoryPage.clicarCart();

        cartPage.clicarCheckoutBtn();

        checkoutPage.preencherFirstName();
        checkoutPage.preencherLastName();
        checkoutPage.preencherZipCode();
        checkoutPage.clicarContinueBtn();

        Assert.assertEquals(checkoutPage.validarCheckoutComSucesso().toLowerCase(), "CHECKOUT: OVERVIEW".toLowerCase());
    }

    @Test
    public void efetuarCheckoutComCepInvalido() {
        loginSteps.efetuarLoginComSucesso1();

        inventoryPage.clicarAddBackpack();
        inventoryPage.clicarCart();

        cartPage.clicarCheckoutBtn();

        checkoutPage.preencherFirstName();
        checkoutPage.preencherLastName();
        checkoutPage.preencherZipCodeVazio();
        checkoutPage.clicarContinueBtn();

        Assert.assertEquals(checkoutPage.validarCheckoutSemSucesso(), "Error: Postal Code is required");
    }
    

    @Test
    public void efetuarCheckoutSemSucesso() {
        loginSteps.efetuarLoginComSucesso1();

        inventoryPage.clicarAddBackpack();
        inventoryPage.clicarAddTShirt();
        inventoryPage.clicarAddOnesie();
        inventoryPage.clicarAddBikeLight();
        inventoryPage.clicarAddJacket();
        inventoryPage.clicarAddRedTShirt();
        inventoryPage.clicarCart();

        cartPage.clicarCheckoutBtn();

        checkoutPage.preencherFirstNameVazio();
        checkoutPage.preencherLastNameVazio();
        checkoutPage.preencherZipCodeVazio();
        checkoutPage.clicarContinueBtn();

        Assert.assertEquals(checkoutPage.validarCheckoutSemSucesso(), "Error: First Name is required");
    }

    @Test
    public void efetuarCheckoutSemSucessoCamposEmBranco() {
        loginSteps.efetuarLoginComSucesso1();

        inventoryPage.clicarAddBackpack();
        inventoryPage.clicarCart();
        cartPage.clicarCheckoutBtn();

        checkoutPage.clicarContinueBtn();

        Assert.assertEquals(checkoutPage.validarCheckoutSemSucesso(), "Error: First Name is required");
    }

//    @Test
//    public void efetuarCheckoutSemSucessoDadosInvalidos() {
//        loginSteps.efetuarLoginComSucesso1();
//
//        inventoryPage.clicarAddBackpack();
//        inventoryPage.clicarCart();
//        cartPage.clicarCheckoutBtn();
//
//        checkoutPage.preencherFirstName();
//        checkoutPage.preencherLastName();
//        checkoutPage.preencherZipCode();
//        checkoutPage.clicarContinueBtn();
//
//        Assert.assertEquals(checkoutPage.validarCheckoutSemSucesso(), "Error: Invalid data");
//    }
//
//    @Test
//    public void efetuarCheckoutSemSucessoUsuarioBloqueado() {
//        loginSteps.efetuarLoginSemSucessoUsuarioBloqueado();
//
//        inventoryPage.clicarAddBackpack();
//        inventoryPage.clicarCart();
//        cartPage.clicarCheckoutBtn();
//
//        checkoutPage.preencherFirstName();
//        checkoutPage.preencherLastName();
//        checkoutPage.preencherZipCode();
//        checkoutPage.clicarContinueBtn();
//
//        Assert.assertEquals(checkoutPage.validarCheckoutSemSucesso(), "Error: User is blocked");
//    }
}
