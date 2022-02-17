package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import utility.RestUtil;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;

public class Test_AddCustomer extends TestBase{
	String custid;
	String name;
	@Test
	void Create_Customer() {
		
		custid=RestUtil.Custemailid();
		name=RestUtil.CustName();
		RestAssured.baseURI = "https://api.stripe.com";
		// Basic Authentication
		PreemptiveBasicAuthScheme authscheme = new PreemptiveBasicAuthScheme();
		authscheme.setUserName("sk_test_QbRiu7Hnvf9JMlTO1TmLtcoT");
		authscheme.setPassword("");
		RestAssured.authentication = authscheme;

		// Request Object
		httpRequest = RestAssured.given();
			
		// httpRequest.pathParam();
		 httpRequest.formParam("email",custid );
		
		httpRequest.formParam("name", name);
		 httpRequest.request(Method.POST, "/v1/customers");
		//Thread.sleep(3);
	}
	@Test
	void checkStatusCode()
	{
		logger.info("**************Checking Status Code************");
		//Status code Validation
		int statusCode=response.statusCode();
		
		Assert.assertEquals(statusCode, 200);
	}
	@Test
	void checkResponseTime()
	{
		logger.info("**************Checking Response Time************");
		long responseTime=response.getTime();
		
		Assert.assertTrue(responseTime<2000);
	}
}