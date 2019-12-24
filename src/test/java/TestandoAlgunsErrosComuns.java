import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestandoAlgunsErrosComuns extends BaseTest {

    /*
     * /post só pode receber post
     */
    @Test
    public void deveRetornarErro405QuandoChamarUmVerboInvalido(){
        given()
        .when()
            .get("/post")
        .then()
            .statusCode(405);
    }

    @Test
    public void deveRetornar404QuandoApontarParaUmCaminhoInexistente(){
        given()
        .when()
            .get("/inexistente")
        .then()
            .statusCode(404);
    }

}
