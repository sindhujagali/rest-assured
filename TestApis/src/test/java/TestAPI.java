import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class TestAPI {

	@Test
	void test_api()
	
	{

		given().
        get("https://reqres.in/api/users?page=2").
 then().statusCode(200).log().all();
	}
	
	
}
