package com.webdam.interview.sample;

import static com.jayway.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.webdam.base.TestBase;

public class LogoutUserTest extends TestBase {

    @Test
    public void getLogout() {
        given().auth().oauth2(accessToken).when().get(baseURL + version + "logout").then().statusCode(200);
    }

    @Test
    public void headLogout() {
        given().auth().oauth2(accessToken).when().head(baseURL + version + "logout").then().statusCode(200);
    }

}