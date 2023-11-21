package util;

import org.openqa.selenium.By;

public class Evento extends ElementoTela {

    public static void click(By by) {
        waitElement(by);
        element(by).click();
    }

    public static String getText(By by) {
        waitElement(by);
        return  element(by).getText();
    }

    public static void sendKeys(By by, String texto) {
        waitElement(by);
        element(by).sendKeys(texto);
    }
}
