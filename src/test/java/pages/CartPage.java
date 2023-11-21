package pages;

import org.openqa.selenium.By;
import util.Evento;

public class CartPage {


    public static final By removeBackpackBtn = By.cssSelector("#remove-sauce-labs-backpack");
    public static final By removeTShirtBtn = By.cssSelector("#remove-sauce-labs-bolt-t-shirt");
    public static final By removeOnesieBtn = By.cssSelector("#remove-sauce-labs-onesie");
    public static final By removeBikeLightBtn = By.cssSelector("#remove-sauce-labs-bike-light");
    public static final By removeJacketBtn = By.cssSelector("#remove-sauce-labs-fleece-jacket");

    public static final By cartBtn = By.cssSelector("#shopping_cart_container > a > span");

    public static final By quantidadeCarrinho = By.cssSelector("#shopping_cart_container > a > span");

    //==================================================================================================================


    public void clicarRemoveBackpack() {
        Evento.click(removeBackpackBtn);
    }

    public void clicarRemoveTShirt() {
        Evento.click(removeTShirtBtn);
    }

    public void clicarRemoveOnesie() {
        Evento.click(removeOnesieBtn);
    }

    public void clicarRemoveBikeLight() {
        Evento.click(removeBikeLightBtn);
    }

    public void clicarRemoveJacket() {
        Evento.click(removeJacketBtn);
    }

    public void clicarCart() {
        Evento.click(cartBtn);
    }

    public String validarQuantidadeRemovidaComSucesso() {
        return Evento.getText(quantidadeCarrinho);
    }

    public String validarQuantidadeRemovidaSemSucesso() {
        return "6";
    }


    public static final By continueShoppingBtn = By.cssSelector("#continue-shopping");

    public void clicarContinueShoppingBtn() {
        Evento.click(continueShoppingBtn);
    }


    public static final By checkoutBtn = By.cssSelector("#checkout");
    public static final By msgCheckoutComSucesso = By.cssSelector("#header_container > div.header_secondary_container > span");

    public void clicarCheckoutBtn() {
        Evento.click(checkoutBtn);
    }

    public String validarCheckoutComSucesso() {
        return Evento.getText(msgCheckoutComSucesso);
    }

}
