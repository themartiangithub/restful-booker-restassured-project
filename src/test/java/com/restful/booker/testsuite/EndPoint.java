package com.restful.booker.testsuite;

import com.restful.booker.testbase.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class EndPoint extends TestBase {
    static ValidatableResponse response;

    @BeforeClass
    public static void inIt() {

        /*RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        response = given()
                .when()
                .get("/booking")
                .then().statusCode(200);
        response.log().all();*/
    }

    @Test
    public void test001() {

        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        Response response = given()
                .queryParam("firstname","{{firstname}}")
                .when()
                .get("/booking");
        response.then().statusCode(200);
        response.prettyPrint();

    }

    @Test
    public void test002() {

        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        Response response = given()
                .when()
                .get("/booking");
        response.then().statusCode(200);
        response.prettyPrint();

    }

    @Test
    public void test003() {

        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        Response response = given()
                .when()
                .get("/booking");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
