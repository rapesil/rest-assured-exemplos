import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestandoStatusCode extends BaseTest {

    @Test
    public void deveRetornarStatusCode200 () {
        given()
            .pathParam("statusCode", 200)
        .when()
            .get("/status/{statusCode}")
        .then()
            .statusCode(200);
    }

    @Test
    public void deveRetornarStatusCode300 () {
        given()
            .pathParam("statusCode", 300)
        .when()
            .get("/status/{statusCode}")
        .then()
            .statusCode(300);
    }

    @Test
    public void deveRetornarStatusCode400 () {
        given()
            .pathParam("statusCode", 400)
        .when()
            .get("/status/{statusCode}")
        .then()
            .statusCode(400);
    }

    @Test
    public void deveRetornarStatusCode500 () {
        given()
            .pathParam("statusCode", 500)
        .when()
            .get("/status/{statusCode}")
        .then()
            .statusCode(500);
    }
}
