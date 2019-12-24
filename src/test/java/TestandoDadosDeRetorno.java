import static org.hamcrest.Matchers.is;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestandoDadosDeRetorno extends BaseTest {
    @Test
    public void deveRetornarOIpDeQuemFezORequest() {
        String expectedIp = getIp();

        given()
        .when()
            .get("/ip")
        .then()
            .statusCode(200)
            .body("origin", is(expectedIp));
    }

    @Test
    public void deveRetornarOUserAgentDeQuemFezORequest() {
        String expectedUserAgent = "Apache-HttpClient/4.5.3 (Java/13.0.1)";

        given()
                .when()
                .get("/user-agent")
                .then()
                .statusCode(200)
                .body("user-agent", is(expectedUserAgent));
    }

}
