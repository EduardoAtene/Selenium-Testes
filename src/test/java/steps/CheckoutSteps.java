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

    //==================================================================================================================
    //                                                 CADASTRO CHECKOUT
    //==================================================================================================================

    // CADASTRO CHECKOUT COM SUCESSO
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

        // Validação:
        Assert.assertEquals(checkoutPage.validarCheckoutComSucesso(), "CHECKOUT: OVERVIEW");
    }

    // CADASTRO CHECKOUT SEM SUCESSO - CEP Inválido
    @Test
    public void efetuarCheckoutComCepInvalido() {
        loginSteps.efetuarLoginComSucesso1();

        inventoryPage.clicarAddBackpack(); // Adiciona itens ao carrinho
        inventoryPage.clicarCart();

        cartPage.clicarCheckoutBtn();

        checkoutPage.preencherFirstName();
        checkoutPage.preencherLastName();
        checkoutPage.preencherZipCodeVazio(); // Preenche com um CEP inválido
        checkoutPage.clicarContinueBtn();

        // Validação:
        Assert.assertEquals(checkoutPage.validarCheckoutSemSucesso(), "Error: Postal Code is required");
    }
    
    //==================================================================================================================

    // CADASTRO CHECKOUT SEM SUCESSO
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

        // Validação:
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

    @Test
    public void efetuarCheckoutSemSucessoDadosInvalidos() {
        loginSteps.efetuarLoginComSucesso1();

        inventoryPage.clicarAddBackpack();
        inventoryPage.clicarCart();
        cartPage.clicarCheckoutBtn();

        checkoutPage.preencherFirstName();
        checkoutPage.preencherLastName();
        checkoutPage.preencherZipCode();
        checkoutPage.clicarContinueBtn();

        Assert.assertEquals(checkoutPage.validarCheckoutSemSucesso(), "Error: Invalid data");
    }

    @Test
    public void efetuarCheckoutSemSucessoUsuarioBloqueado() {
        loginSteps.efetuarLoginSemSucessoUsuarioBloqueado();

        inventoryPage.clicarAddBackpack();
        inventoryPage.clicarCart();
        cartPage.clicarCheckoutBtn();

        checkoutPage.preencherFirstName();
        checkoutPage.preencherLastName();
        checkoutPage.preencherZipCode();
        checkoutPage.clicarContinueBtn();

        Assert.assertEquals(checkoutPage.validarCheckoutSemSucesso(), "Error: User is blocked");
    }
}
