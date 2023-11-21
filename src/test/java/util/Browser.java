package util;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Browser {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @Before
    public void iniciarBrowser() {
        String url = "https://www.saucedemo.com/";

        // Configurar as opções do Microsoft Edge
        EdgeOptions options = new EdgeOptions();
        System.setProperty("webdriver.edge.whitelistedIps", "");

        // Definir o caminho do driver e iniciar o EdgeDriver com as opções configuradas
        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
        driver = new EdgeDriver(options);

        // Configurar timeouts e maximizar a janela
        driver.manage().timeouts().implicitlyWait(9000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();

        // Navegar para a URL
        driver.get(url);
    }

    @After
    public void finalizarBrowser() {
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
        //driver.quit();
    }
}