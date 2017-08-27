package com.webdam.interview.sample;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.apache.commons.lang3.RandomStringUtils;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import com.webdam.base.TestBase;

public class LoginUserTest extends TestBase {

    //GET + Valid Access Token + Response Code
    @Test
    public void verifyGetLoginResponseCodeWithValidAccessToken() {
        given().auth().oauth2(accessToken).when().get(baseURL + version + "login").then()
                .assertThat().statusCode(202);
    }
    
    //HEAD + Valid Access Token + Response Code    
    @Test
    public void verifyHeadLoginResponseCodeWithValidAccessToken() {
        given().auth().oauth2(accessToken).when().head(baseURL + version + "login").then()
                .assertThat().statusCode(202);
    }
    
    //GET + InValid Access Token + Response Code    
    @Test
    public void verifyGetLoginResponseCodeWithInValidAccessToken() {
        String invalidAccessToken = RandomStringUtils.random(10);
        given().auth().oauth2(invalidAccessToken).when().get(baseURL + version + "login").then()
        .assertThat().statusCode(500);
    }  
    
    //HEAD + InValid Access Token + Response Code    
    @Test
    public void verifyHeadLoginResponseCodeWithInValidAccessToken() {
        String invalidAccessToken = RandomStringUtils.random(10);
        given().auth().oauth2(invalidAccessToken).when().head(baseURL + version + "login").then()
        .assertThat().statusCode(500);
    }  
    
    //GET + Valid Access Token + Response Body    
    @Test
    public void verifyGetLoginResponseBodyWithInValidAccessToken() {
        given().auth().oauth2(accessToken).when().get(baseURL + version + "login").then().
        body("logged_in", equalTo(true));
    }    

//    //HEAD + Valid Access Token + Response Body    
//    @Test
//    public void verifyHeadLoginResponseBodyWithInValidAccessToken() {
//        given().auth().oauth2(accessToken).when().head(baseURL + version + "login").then()
//        .body("isEmpty()", Matchers.is(true));
//    } 
    
    @Test
    public void headLogin() {
        given().auth().oauth2(accessToken).when().head(baseURL + version + "login").then().statusCode(202);
    }

}