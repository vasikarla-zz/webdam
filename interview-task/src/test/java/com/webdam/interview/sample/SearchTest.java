package com.webdam.interview.sample;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.hasItem;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import com.webdam.base.TestBase;

public class SearchTest extends TestBase {

    @Test
    public void getSearch() {
        System.out.println(baseURL + version + "search");
        given().queryParam("query", "aut").queryParam("sort", "aut").queryParam("limit", "1110").auth()
                .oauth2(accessToken).when().get(baseURL + version + "search").then().statusCode(200);
    }

    @Test
    public void getSearchWithQuery() {
        // query=app&sort=aut&limit=0
        System.out.println(baseURL + version + "search");
        given().queryParam("query", "z").queryParam("limit", "5").auth().oauth2(accessToken).when()
                .get(baseURL + version + "search").then().body("keywords", everyItem(hasItem("apple")));
    }

    
    //This is supposed to fail
    @Test
    public void verifySearchwithOneCharForSorting() {
        // query=app&sort=aut&limit=0
        System.out.println(baseURL + version + "search");
        given().queryParam("query", "z").queryParam("sort", "a").auth().oauth2(accessToken).when()
                .get(baseURL + version + "search").then().body("isEmpty()", Matchers.is(true));
    }
    
    //This is supposed to fail
    @Test
    public void verifySearchwithAnOperator() {
        // query=app&sort=aut&limit=0
        System.out.println(baseURL + version + "search");
        given().queryParam("query", "&").queryParam("sort", "a").auth().oauth2(accessToken).when()
                .get(baseURL + version + "search").then().body("isEmpty()", Matchers.is(true));
    }
    
    //This is supposed to fail
    @Test
    public void verifySearchwithInvalidLimit() {
        // query=app&sort=aut&limit=0
        System.out.println(baseURL + version + "search");
        given().queryParam("query", "z").queryParam("limit", "-11").auth().oauth2(accessToken).when()
                .get(baseURL + version + "search").then().body("isEmpty()", Matchers.is(true));
    }

}