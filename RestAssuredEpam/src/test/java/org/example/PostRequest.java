package org.example;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostRequest {
    @Test
    void postData(){

        //first step-specification of URL
        RestAssured.baseURI = "https://reqres.in/api";


        //creating an object of request
        RequestSpecification httpReq = RestAssured.given();

        //sending data with rquest
        JSONObject parameters = new JSONObject();
        parameters.put("name","Harash");
        parameters.put("job","Developer");

        httpReq.header("content-Type","application/json");

        httpReq.body(parameters.toJSONString());//attaching the data with the body

        //creating response object
        Response res = httpReq.request(Method.POST,"/users");

        //printing response body
        String resBody = res.getBody().asString();
        System.out.println("Response Body is: "+ resBody);

        //validating status code
        int statuscode = res.getStatusCode();
        System.out.println("status code is "+ statuscode);
        org.testng.Assert.assertEquals(statuscode,201);

        //validating the content type
        String contType = res.header("content-Type");
        System.out.println(contType);
        Assert.assertEquals(contType,"application/json; charset=utf-8");

        String contLength = res.header("content-Length");
        System.out.println(contLength);
        Assert.assertEquals(contLength,"84");

        Headers headers = res.getHeaders();

        for(Header header: headers){
            System.out.println(header.getName() + "----->" + header.getValue());
        }

        //validating of response Body
        Assert.assertEquals(resBody.contains("Harsh"),true);

        JsonPath jpath = res.jsonPath();
        System.out.println((String) jpath.get("name"));
        System.out.println((String) jpath.get("job"));
        System.out.println((String) jpath.get("id"));




    }
}
