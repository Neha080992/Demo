package StepDefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;


public class RatesAPITest {

	Response response;
	int statuscode;
	String StatusLine;
	
	@Given("^Hit the URL for exchange rates$")
	public void hit_the_URL_for_exchange_rates() throws Throwable {
	 
		RestAssured.baseURI = "https://api.ratesapi.io/api/latest";
		
	}
	
	@When("^Check API is available$")
	public void Check_API_is_available()
	{
		RequestSpecification httpRequest=RestAssured.given();
		response  = httpRequest.get();
		statuscode= response.getStatusCode();

	
	}
	

@Then("^Validate the response status code$")
public void validate_the_response_status_code() throws Throwable 
{
	Assert.assertEquals(statuscode, 200);
}

@Then("^Validate the response status line$")
public void validate_the_response_status_line() throws Throwable {
	
	StatusLine = response.getStatusLine();
	Assert.assertEquals(StatusLine, "HTTP/1.1 200 OK");}

@Given("^Hit the incorrect URL for exchange rates$")
public void hit_the_incorrect_URL_for_exchange_rates() throws Throwable {

	RestAssured.baseURI = "https://api.ratesapi.io/api/";
}

@Then("^Validate the error response code$")
public void Validate_the_error_response_code() throws Throwable {

	Assert.assertEquals(statuscode, 400);
}

@Given("^Hit the URL for exchange rates with date$")
public void hit_the_URL_for_exchange_rates_with_date() throws Throwable {
	
	RestAssured.baseURI = "https://api.ratesapi.io/api/2019-06-12";
	
}




}
