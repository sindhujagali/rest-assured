package restassured;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test_Put {

	@Test
	public void Test_1_Put()
	
	{
		JSONObject request = new JSONObject();
		request.put("name", "RRR");
		request.put("job", "Reddy1");
		
		given().
              body(request.toString()).
              contentType(ContentType.JSON).
              put("https://reqres.in/api/users/2").
              then().statusCode(201).log().all();
		
		
	}
	
	
}
