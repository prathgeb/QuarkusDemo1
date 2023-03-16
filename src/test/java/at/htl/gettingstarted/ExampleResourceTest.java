package at.htl.gettingstarted;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest // -> injects all dependencies
public class ExampleResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/api/hello")
                .then()
                .statusCode(200)
                .body(is("Hello test"));
    }

}