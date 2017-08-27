package com.webdam.interview.sample;

import static com.jayway.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.webdam.base.TestBase;

public class AssetsTest extends TestBase {

    @Test
    public void getSearch() {
        System.out.println(baseURL + version + "search");
        given().queryParam("query", "aut").queryParam("sort", "aut").queryParam("limit", "1110").auth().oauth2(accessToken)
                .when().get(baseURL + version + "search").then().statusCode(200);
    }

    @Test
    public void headSearch() {
        given().queryParam("query", "aut").queryParam("sort", "aut").queryParam("limit", "0").auth().oauth2(accessToken)
                .when().head(baseURL + version + "search").then().statusCode(200);
    }

    @Test
    public void getAssets() {
        given().auth().oauth2(accessToken).when().get(baseURL + version + "asset").then().statusCode(200);
    }

    @Test
    public void headAssets() {
        given().auth().oauth2(accessToken).when().head(baseURL + version + "asset").then().statusCode(200);
    }

    @Test
    public void getAssetsById() {
        given().auth().oauth2(accessToken).when().head(baseURL + version + "asset" + "/12341").then().statusCode(200);
    }

    @Test
    public void headAssetsById() {
        given().auth().oauth2(accessToken).when().head(baseURL + version + "asset" + "/12341").then().statusCode(200);
    }
}