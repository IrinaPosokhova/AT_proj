package APITests;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class PantryTest {
    @Test
    public void getPageTest(){
        given().get(EndPoints.basePath + EndPoints.YOUR_PANTRY_ID)
                .then().statusCode(200);
    }

}
