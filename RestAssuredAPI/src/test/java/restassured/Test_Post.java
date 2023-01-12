package restassured;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Test_Post {

	@Test
	void test_01_post1()
	
	{
		JSONObject request = new JSONObject();
		request.put("name", "sindhu");
		request.put("job", "Reddy");
		
		given().
              body(request.toString()).
              contentType(ContentType.JSON).
              post("https://reqres.in/api/users").
              then().statusCode(201).log().all();
		
	}
	
	
}
