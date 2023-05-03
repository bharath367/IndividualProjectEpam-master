package org.example;

import io.restassured.RestAssured;
import io.restassured.authentication.OAuthScheme;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class AuthRequest {
    @Test
    public void getData(){

        //first step-specification of URL
        RestAssured.baseURI = "https://postman-echo.com";

        PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
        authScheme.setUserName("postman");
        authScheme.setPassword("password");
        RestAssured.authentication=authScheme;


        //creating an object of request
        RequestSpecification httpReq = RestAssured.given();

        //creating response object
        Response res = httpReq.request(Method.GET,"/basic-auth");

        String resBody = res.getBody().asString();
        System.out.println("Response Body is: "+ resBody);

        //Validating status code
        int Statuscode = res.getStatusCode();
        System.out.println("status code is: "+ Statuscode);
        org.testng.Assert.assertEquals(Statuscode,200);



    }

}
