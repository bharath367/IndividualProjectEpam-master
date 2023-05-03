package org.example;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenReq {
    @Test(dataProvider = "providedata")
    void postData(String uname, String ujob) {

        //first step-specification of URL
        RestAssured.baseURI = "https://reqres.in/api";


        //creating an object of request
        RequestSpecification httpReq = RestAssured.given();

        //sending data with rquest
        JSONObject parameters = new JSONObject();

        parameters.put("name", uname);
        parameters.put("job", ujob);

        httpReq.header("content-Type", "application/json");

        httpReq.body(parameters.toJSONString());//attaching the data with the body

        //creating response object
        Response res = httpReq.request(Method.POST, "/users");

        //printing response body
        String resBody = res.getBody().asString();
        System.out.println("Response Body is: " + resBody);

        //validating status code
        int statuscode = res.getStatusCode();
        System.out.println("status code is " + statuscode);
        org.testng.Assert.assertEquals(statuscode, 201);

        Assert.assertEquals(resBody.contains(uname),true);
        Assert.assertEquals(resBody.contains(ujob),true);
    }

    @DataProvider(name="providedata")
    String[][] getUserData(){
        String[][] UserData = {{"Bharath","Accountant"},{"Sai","Designer",}};
                return UserData;
    }
}
