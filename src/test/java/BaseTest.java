import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

import static io.restassured.RestAssured.port;

public class BaseTest {
    private static String env = System.getProperty("env").toLowerCase();

    @BeforeClass
    public static void setup() {
        RestAssured.baseURI = getURI();
        if (env.equals("local")) {
            RestAssured.port = 80;
        }
    }

    public static String getURI() {
        String local = "http://localhost:80";
        String web   = "https://httpbin.org/";

        return env.equals("local") ? local : web;
    }

    public static String getIp() {
        return env.equals("local") ? "172.17.0.1" : "45.4.225.14, 45.4.225.14";
    }

}
