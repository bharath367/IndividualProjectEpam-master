package org.example;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class GetRequest
{
    @Test
    public void getData(){

        //first step-specification of URL
        RestAssured.baseURI = "https://reqres.in/api/users";

        //Send Request to URL
        //creating an object of request
        RequestSpecification httpReq = RestAssured.given();

        //creating response object
        Response res = httpReq.request(Method.GET,"?page=2");

        String resBody = res.getBody().asString();
        System.out.println("Response Body is: "+ resBody);

        //Validating status code
        int Statuscode = res.getStatusCode();
        System.out.println("status code is: "+ Statuscode);
        org.testng.Assert.assertEquals(Statuscode,200);



    }
}