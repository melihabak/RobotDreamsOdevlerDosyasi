
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class PetstoreTests {

    String baseURI = "https://petstore.swagger.io/v2/pet/";

    @Test
    public void testGetPetById() {
        given().
                when().
                get(baseURI + "1").
                then().
                assertThat().
                statusCode(200).
                body("id", equalTo(1));
    }

    @Test
    public void testCreatePet() {
        String requestBody = "{\"id\": 1, \"name\": \"Fido\", \"status\": \"available\"}";
        given().
                contentType("application/json").
                body(requestBody).
                when().
                post(baseURI).
                then().
                assertThat().
                statusCode(200).
                body("name", equalTo("Fido")).
                body("status", equalTo("available"));
    }

    @Test
    public void testUpdatePet() {
        String requestBody = "{\"id\": 1, \"name\": \"Buddy\", \"status\": \"sold\"}";
        given().
                contentType("application/json").
                body(requestBody).
                when().
                put(baseURI).
                then().
                assertThat().
                statusCode(200).
                body("name", equalTo("Buddy")).
                body("status", equalTo("sold"));
    }

    @Test
    public void testDeletePet() {
        given().
                when().
                delete(baseURI + "1").
                then().
                assertThat().
                statusCode(200);
    }

    @Test
    public void testGetNonExistingPet() {
        given().
                when().
                get(baseURI + "9999").
                then().
                assertThat().
                statusCode(404);
    }
}