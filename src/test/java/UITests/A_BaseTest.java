package UITests;

import App.App;
import helpers.Driver;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Rule;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.rules.ErrorCollector;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;

public class A_BaseTest {
    @Rule
    public ErrorCollector collector= new ErrorCollector();

    protected App app;
    protected ErrorCollector errorCollector;
    protected Logger logger;

    @BeforeAll
    public void setUp() {

        Driver.initDriver();

        app = new App();
        softAssert = new SoftAssert();

        logger = LogManager.getLogger("");
        DOMConfigurator.configure("src/main/resources/log4j.xml");
    }

    @AfterEach
    public void clearCookies() {
        Driver.clearCookies();
    }

    @AfterAll
    public void tearDown() {
        Driver.close();
    }

}
