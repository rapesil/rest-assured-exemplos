import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static io.restassured.RestAssured.given;

public class TestandoDiferentesVerbos extends BaseTest {

    @Test
    public void getDeveRetornar200() {
        given()
        .when()
            .get("/get")
        .then()
            .statusCode(200);
    }

    @Test
    public void postDeveRetornar200() {
        given()
        .when()
            .post("/post")
        .then()
            .statusCode(200);
    }

    @Test
    public void putDeveRetornar200() {
        given()
        .when()
            .put("/put")
        .then()
            .statusCode(200);
    }

    @Test
    public void deleteDeveRetornar200() {
        given()
        .when()
            .delete("/delete")
        .then()
            .statusCode(200);
    }

    @Test
    public void patchDeveRetornar200() {
        given()
        .when()
            .patch("/patch")
        .then()
            .statusCode(200);
    }

    @Test
    public void optionsDeveRetornar200() {
        given()
        .when()
            .options("/patch")
        .then()
            .statusCode(200);
    }
}
