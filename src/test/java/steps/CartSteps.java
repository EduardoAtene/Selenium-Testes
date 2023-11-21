package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.CartPage;
import pages.InventoryPage;
import util.Browser;
import util.BrowserEdge;

public class CartSteps extends BrowserEdge {

    LoginSteps loginSteps = new LoginSteps();

    CartPage cartPage = new CartPage();

    InventoryPage inventoryPage = new InventoryPage();

    @Test
    public void RemoverProdutosComSucesso() {

        loginSteps.efetuarLoginComSucesso1();
        inventoryPage.clicarAddBackpack();
        inventoryPage.clicarAddTShirt();
        inventoryPage.clicarAddOnesie();
        inventoryPage.clicarAddBikeLight();
        inventoryPage.clicarAddJacket();
        inventoryPage.clicarAddRedTShirt();
        inventoryPage.clicarCart();

        cartPage.clicarRemoveBackpack();
        cartPage.clicarRemoveTShirt();
        cartPage.clicarRemoveOnesie();
        cartPage.clicarRemoveBikeLight();
        cartPage.clicarRemoveJacket();

        cartPage.clicarCart();

        Assert.assertEquals(cartPage.validarQuantidadeRemovidaComSucesso(), "1");
    }

    @Test
    public void adicionarTodosProdutosSemSucesso() {

        loginSteps.efetuarLoginComSucesso1();

        inventoryPage.clicarAddBackpack();
        inventoryPage.clicarAddTShirt();
        inventoryPage.clicarAddOnesie();
        inventoryPage.clicarAddBikeLight();
        inventoryPage.clicarAddJacket();
        inventoryPage.clicarAddRedTShirt();
        inventoryPage.clicarCart();

        cartPage.clicarRemoveBackpack();
        cartPage.clicarRemoveTShirt();
        cartPage.clicarRemoveOnesie();
        cartPage.clicarRemoveBikeLight();
        cartPage.clicarRemoveJacket();

        cartPage.clicarCart();

        Assert.assertEquals(cartPage.validarQuantidadeRemovidaSemSucesso(), "6");
    }

    public void ProcedeCheckoutComSucesso() {

        loginSteps.efetuarLoginComSucesso1();

        inventoryPage.clicarAddBackpack();
        inventoryPage.clicarAddTShirt();
        inventoryPage.clicarAddOnesie();
        inventoryPage.clicarAddBikeLight();
        inventoryPage.clicarAddJacket();
        inventoryPage.clicarAddRedTShirt();
        inventoryPage.clicarCart();

        cartPage.clicarCheckoutBtn();
    }

}
