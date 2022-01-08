package UITests;

import App.App;
import helpers.Driver;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Rule;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.rules.ErrorCollector;

public class A_BaseTest {

    @Rule
    public ErrorCollector collector = new ErrorCollector();

    protected App app;
    protected ErrorCollector errorCollector;
    protected Logger logger;

    @BeforeEach
    public void setUp() {

        Driver.initDriver();

        app = new App();
        logger = LogManager.getLogger("");
        DOMConfigurator.configure("src/main/resources/log4j.xml");
    }

    //Настройки хрома не дают очистить куки
    /*    @AfterEach
    public void clearCookies() {
        Driver.clearCookies();
    }*/

    @AfterAll
    public static void tearDown() {
        Driver.close();
    }

}
