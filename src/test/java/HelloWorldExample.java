import org.junit.Test;
import utils.ReadPropertiesFile;

import static com.jayway.restassured.RestAssured.given;

public class HelloWorldExample {

    @Test
    public void makeSureThatGoogleIsUp() {
       System.out.println(given().when().get(ReadPropertiesFile.getPropertyValue("endpoint")).then().statusCode(200));
    }

}