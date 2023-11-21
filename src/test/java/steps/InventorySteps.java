package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.InventoryPage;
import util.Browser;
import util.BrowserEdge;

public class InventorySteps extends BrowserEdge {

    LoginSteps loginSteps = new LoginSteps();

    InventoryPage inventoryPage = new InventoryPage();

    //==================================================================================================================
    //
    //                                           INVENTORY PAGE | Menu
    //
    //==================================================================================================================
    // ID:     08
    // TÍTULO: Navegar no Menu da página COM SUCESSO

    //==================================================================================================================
    // ID:     09
    // TÍTULO: Acessar opção "ALL ITEMS" do Menu COM SUCESSO

    //==================================================================================================================
    // ID:     10
    // TÍTULO: Acessar opção "ABOUT" do Menu COM SUCESSO

    //==================================================================================================================
    // ID:     11
    // TÍTULO: Acessar opção "LOGOUT" do Menu COM SUCESSO

    //==================================================================================================================
    // ID:     12
    // TÍTULO: Acessar opção "RESET APP STATE" do Menu COM SUCESSO


/*
    //==================================================================================================================
    //
    //                                         INVENTORY PAGE | Filtro
    //
    //==================================================================================================================
    // ID:     13
    // TÍTULO: Filtrar itens à venda por nome - Ordem alfabética - CRESCENTE COM SUCESSO

    @Test
    public void buscarAToZComSucesso() {

        loginSteps.efetuarLoginComSucesso1();
        inventoryPage.clicarFilter();
        inventoryPage.clicarFilterNameAToZ();

        // Validação:
        Assert.assertEquals(inventoryPage.validarBuscaComSucesso(), "$29.99");
    }


    //==================================================================================================================
    // ID:     14
    // TÍTULO: Filtrar itens à venda por nome - Ordem alfabética - DECRESCENTE COM SUCESSO

    @Test
    public void buscarZToAComSucesso() {

        loginSteps.efetuarLoginComSucesso1();
        inventoryPage.clicarFilter();
        inventoryPage.clicarFilterNameZToA();

        // Validação:
        Assert.assertEquals(inventoryPage.validarBuscaComSucesso(), "$15.99");
    }

    //==================================================================================================================
    // ID:     15
    // TÍTULO: Filtrar itens à venda por nome - Ordem de preço - CRESCENTE COM SUCESSO

    @Test
    public void buscarLowToHighComSucesso() {

        loginSteps.efetuarLoginComSucesso1();
        inventoryPage.clicarFilter();
        inventoryPage.clicarFilterPriceLowToHigh();

        // Validação:
        Assert.assertEquals(inventoryPage.validarBuscaComSucesso(), "$7.99");
    }

    //==================================================================================================================
    // ID:     16
    // TÍTULO: Filtrar itens à venda por nome - Ordem de preço - DECRESCENTE COM SUCESSO

    @Test
    public void buscarHighToLowComSucesso() {

        loginSteps.efetuarLoginComSucesso1();
        inventoryPage.clicarFilter();
        inventoryPage.clicarFilterPriceHighToLow();

        // Validação:
        Assert.assertEquals(inventoryPage.validarBuscaComSucesso(), "$49.99");
    }

    //==================================================================================================================


    //==================================================================================================================
    //                                              ADD TO CART
    //==================================================================================================================

    // ADICONAR TODOS OS PRODUTOS AO CARRINHO COM SUCESSO

    @Test
    public void adicionarTodosProdutosComSucesso() {

        loginSteps.efetuarLoginComSucesso1();
        inventoryPage.clicarAddBackpack();
        inventoryPage.clicarAddTShirt();
        inventoryPage.clicarAddOnesie();
        inventoryPage.clicarAddBikeLight();
        inventoryPage.clicarAddJacket();
        inventoryPage.clicarAddRedTShirt();
        inventoryPage.clicarCart();

        // Validação:
        Assert.assertEquals(inventoryPage.validarQuantidadeComSucesso(), "6");
    }

    // ADICONAR TODOS OS PRODUTOS AO CARRINHO SEM SUCESSO
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

        // Validação:
        Assert.assertEquals(inventoryPage.validarQuantidadeSemSucesso(), "");

    }
*/
}
