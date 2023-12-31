package pages;

import org.openqa.selenium.By;
import util.Evento;

public class FinishPage {

    //==================================================================================================================
    //                                        Página Finish | FINALIZAR COMPRA
    //==================================================================================================================

    // DECLARAÇÃO DOS CAMPOS:

    public static final By finishBtn = By.cssSelector("#finish");
    public static final By msgFinishComSucesso = By.cssSelector("#checkout_complete_container > h2");

    //==================================================================================================================

    // MÉTODOS:

    public void clicarFinishBtn() {
        Evento.click(finishBtn);
    }

    // Validação:
    public String validarFinishComSucesso() {
        return Evento.getText(msgFinishComSucesso);
    }

    //==================================================================================================================
    //                                       Página Finish | CANCELAR COMPRA
    //==================================================================================================================

    // DECLARAÇÃO DOS CAMPOS:

    public static final By cancelBtn = By.cssSelector("#cancel");

    //==================================================================================================================

    // MÉTODOS:

    public void clicarCancelBtn() {
        Evento.click(cancelBtn);
    }


}
