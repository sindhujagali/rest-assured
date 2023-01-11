package restassured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class Test_GET {

	@Test
	void test_01_Get()
	
	{
		
		given().
                get("https://reqres.in/api/users?page=2").
         then().statusCode(200).log().all();
		
		
	}
	
}
