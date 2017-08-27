package com.webdam.base;

import org.testng.TestNG;

import com.jayway.restassured.response.Response;

public class TestBase extends TestNG {

    public final String accessToken = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjI2OTczMTk3MDUxOWZhNTMxOGU2YTc5OTUyNjBmYmJmMDY1YzllN2M5MTU4Yjk1ZTE3Njg1NjBhZTcwOTZiNmIwNzg0NDhiNzNiZjBjYjNjIn0.eyJhdWQiOiI0IiwianRpIjoiMjY5NzMxOTcwNTE5ZmE1MzE4ZTZhNzk5NTI2MGZiYmYwNjVjOWU3YzkxNThiOTVlMTc2ODU2MGFlNzA5NmI2YjA3ODQ0OGI3M2JmMGNiM2MiLCJpYXQiOjE1MDM4NTY2NTUsIm5iZiI6MTUwMzg1NjY1NSwiZXhwIjoxNTAzODYwMjU1LCJzdWIiOiIiLCJzY29wZXMiOltdfQ.M1wDcbKA2KLt2uN-QVvdLsf69o5AGF9Ot7kJDtIo4YYX1xSJ7tZU9SqRDbyZT6b7zOs_jbrWgUus13Siza7HwExfE6SoOt3KXncLSMe1lE9l8ttS1fCkQMflafeDKYUUETwtdD2wlkqvPZC6mPKRs9vDw8jRetD6KJqLhSqJJMdPDyQT62qhmYiC_M1p5rICIfQCgjfdDrj8oAxKscAe9XmdBa61cvbgeEPttWfmOVN270mBCQ2ae1ch7VcCNvDIY76xr30JiNcL8Coy4HUeW5csxQA7LWmnchLAXO6eAZAMs_TDecr5VJlBPuRdtp_mhcfsheHVRVMbdJ3XIenbdcdE2V0i0cJzFKWzs6yWrHF9q31IvraCnE2XbJO60yVICJ_D4K6L6p6uxJyZANjMak7TN7vNBLzkYZAcnYcfVLCU4ygNVz57qRk8-W753zgWKLO_ly0hpV0oUu0Wn-cOjhrK0rz6qeeGehbOBp7UP517V5q9IZu9LVHLprvFe38wFQQXSwRoB9RA6fAte_tvXv0IJMeUzO2m4cHg47E-lm3hf2G2d4bWbgrb7ztlJht1KFCqz4gc1WqM4rwZ5Eym1f8fV4-dHl5t3ojO4bo8eimRBv4D8lS0w_8xuKqTb3Z0AZAqpDg0TtH1myX1e6oBNVUrG9B_B0hMh_3iv4XIfr4";
    public final String baseURL = "http://interview-testing-api.webdamdb.com/api";
    public final String version = "/v1/";
    public Response response;

}
