package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.FinishPage;
import pages.InventoryPage;
import util.Browser;
import util.BrowserEdge;

public class FinishSteps extends BrowserEdge {

    LoginSteps loginSteps = new LoginSteps();

    InventoryPage inventoryPage = new InventoryPage();

    CartPage cartPage = new CartPage();

    CheckoutPage checkoutPage = new CheckoutPage();

    FinishPage finishPage = new FinishPage();
    @Test
    public void finalizarCompraComSucesso() {

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

        finishPage.clicarFinishBtn();
        Assert.assertEquals(finishPage.validarFinishComSucesso(), "Thank you for your order!");
    }

}

