package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class InventoryPage {

    //==================================================================================================================
    //                                            Inventory Page
    //==================================================================================================================

    // FUNCIONALIDADE MENU

    // Declaração de campos de interação:

    public static final By mnuPageOpen = By.cssSelector("#react-burger-menu-btn");
    public static final By mnuPageClose = By.cssSelector("#react-burger-cross-btn");
    public static final By mnuOptionAllItems = By.cssSelector("#inventory_sidebar_link");
    public static final By mnuOptionAbout = By.cssSelector("#about_sidebar_link");
    public static final By mnuOptionLogout = By.cssSelector("#logout_sidebar_link");
    public static final By mnuOptionResetAppState = By.cssSelector("#reset_sidebar_link");

    // Declaração de campos de validações:

    // Validar: Opções disponíveis nos campos
    // Validar: Header com a palavra "Products"
    // Validar: Header da página Sauce Labs.
    // Validar: Banner com a mensagem "Swag Labs"
    // Validar: Ícone do carrinho vazio

    // Métodos:

    // Validações:

    //==================================================================================================================

    // FUNCIONALIDADE FILTRO

    // Declaração de campos de interação:

    public static final By ddlFilter = By.cssSelector("#header_container > div.header_secondary_container > div.right_component > span > select");
    public static final By ddlFilterNameAToZ = By.cssSelector("#header_container > div.header_secondary_container > div.right_component > span > select > option:nth-child(1)");
    public static final By ddlFilterNameZToA = By.cssSelector("#header_container > div.header_secondary_container > div.right_component > span > select > option:nth-child(2)");
    public static final By ddlFilterPriceLowToHigh = By.cssSelector("#header_container > div.header_secondary_container > div.right_component > span > select > option:nth-child(3)");
    public static final By ddlFilterPriceHighToLow = By.cssSelector("#header_container > div.header_secondary_container > div.right_component > span > select > option:nth-child(4)");

    // Declaração de campos de validações:

    // Validar: Presença das 4 opções
    // Validar: Primeiro produto da lista Sauce Labs Backpack ou testar entre primeiro e segundo a ordem alfabética
    // Validar: Primeiro produto da lista Test.allTheThings() T-Shirt (Red) ou testar entre primeiro e segundo a ordem alfabética
    // Validar: Primeiro produto da lista valor $7.99 ou testar entre primeiro e segundo o menor valor
    // Validar: Primeiro produto da lista valor $49.99 ou testar entre primeiro e segundo o maior valor

    // Métodos:

    public void clicarDdlFilter() {
        BaseTest.click(ddlFilter);
    }
    public void selecionarFilterNameAToZ() {
        BaseTest.click(ddlFilterNameAToZ);
    }
    public void selecionarFilterNameZToA() {
        BaseTest.click(ddlFilterNameZToA);
    }
    public void selecionarFilterPriceLowToHigh() {
        BaseTest.click(ddlFilterPriceLowToHigh);
    }
    public void selecionarFilterPriceHighToLow() {
        BaseTest.click(ddlFilterPriceHighToLow);
    }

    // Validações:

    // public String validarBuscaComSucesso() {
        // return BaseTest.getText(produtoBusca);
    // }

    //==================================================================================================================

    // FUNCIONALIDADE CARRINHO - ADICIONAR PRODUTO AO CARRINHO ATRAVÉS DA PÁGINA INVENTORY

    // Declaração de campos de interação:

    public static final By addBackpackBtn = By.cssSelector("#add-to-cart-sauce-labs-backpack");
    public static final By addTShirtBtn = By.cssSelector("#add-to-cart-sauce-labs-bolt-t-shirt");
    public static final By addOnesieBtn = By.cssSelector("#add-to-cart-sauce-labs-onesie");
    public static final By addBikeLightBtn = By.cssSelector("#add-to-cart-sauce-labs-bike-light");
    public static final By addJacketBtn = By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket");
    public static final By addRedTShirtBtn = By.cssSelector("#add-to-cart-test\\.allthethings\\(\\)-t-shirt-\\(red\\)");
    public static final By cartBtn = By.cssSelector("#shopping_cart_container > a > span");

    // Declaração de campos de validações:

    public static final By quantidadeCarrinho = By.cssSelector("#shopping_cart_container > a > span");

    // Métodos:

    public void clicarAddBackpack() {
        BaseTest.click(addBackpackBtn);
    }
    public void clicarAddTShirt() {
        BaseTest.click(addTShirtBtn);
    }
    public void clicarAddOnesie() {
        BaseTest.click(addOnesieBtn);
    }
    public void clicarAddBikeLight() {
        BaseTest.click(addBikeLightBtn);
    }
    public void clicarAddJacket() {
        BaseTest.click(addJacketBtn);
    }
    public void clicarAddRedTShirt() {
        BaseTest.click(addRedTShirtBtn);
    }
    public void clicarCart() {
        BaseTest.click(cartBtn);
    }

    // Validação:
    public String validarQuantidadeComSucesso() {
        return BaseTest.getText(quantidadeCarrinho);
    }

    //==================================================================================================================

    // FUNCIONALIDADE CARRINHO - REMOVER PRODUTO DO CARRINHO ATRAVÉS DA PÁGINA INVENTORY

    //==================================================================================================================

    // VER DETALHE DE PRODUTO (Ver preço / Ver nome / Ver descrição / Navegar Back to Products / Add to cart / Remove)

    //==================================================================================================================
}
