package tests.api;

import baseEntities.BaseApiTest;
import com.google.gson.Gson;
import io.restassured.response.Response;
import models.User;
import org.apache.http.HttpStatus;
import org.openqa.selenium.json.TypeToken;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.EndPoints;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class TestRailApiTest2 extends BaseApiTest {

    @Test
    public void getUser(){
        User user = User.builder()
                .name("Alex Lisov")
                .email("lisovskijsanya0@gmail.com")
                .isActive(true)
                .roleId(1)
                .role("Lead")
                .build();
        given()
                .when()
                .get(EndPoints.GET_ALLUSERS)
                .then().log().body()
                .body("get(0).name",is(user.getName()))
                .body("get(0).email", equalTo(user.getEmail()))
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void getUser2(){
        int userID = 1;
        User expectedUser = User.builder()
                .name("Alex Lisov")
                .email("lisovskijsanya0@gmail.com")
                .isActive(true)
                .roleId(1)
                .role("Lead")
                .build();
       User actualUser = given()
                 .pathParam("id",userID)
                 .get(EndPoints.GET_USER)
                 .then()
                 .log().body()
                 .assertThat()
                 .statusCode(HttpStatus.SC_OK)
                 .extract()
                 .as((Type) User.class);
        Assert.assertEquals(actualUser,expectedUser);
    }

    @Test
    public void getUser1(){
        int userID = 1;
        Gson gson = new Gson();
        User expectedUser = User.builder()
                .name("Alex Lisov")
                .email("lisovskijsanya0@gmail.com")
                .isActive(true)
                .roleId(1)
                .role("Lead")
                .build();
        Response response = given()
                .pathParam("id",userID)
                .get(EndPoints.GET_USER);
        User actualUser = gson.fromJson(response.getBody().asString(),User.class);
        Assert.assertEquals(actualUser,expectedUser);
    }

    @Test
    public void getUsers(){
        int userID = 1;
        Gson gson = new Gson();
        User expectedUser = User.builder()
                .name("Alex Lisov")
                .email("lisovskijsanya0@gmail.com")
                .isActive(true)
                .roleId(1)
                .role("Lead")
                .build();
        Response response = given()
                .get(EndPoints.GET_ALLUSERS);
        User[] actualUser = gson.fromJson(response.getBody().asString(),User[].class);
        Assert.assertEquals(actualUser[0],expectedUser);
    }

    @Test
    public void getUsers1(){
        int userID = 1;
        Gson gson = new Gson();
        User expectedUser = User.builder()
                .name("Alex Lisov")
                .email("lisovskijsanya0@gmail.com")
                .isActive(true)
                .roleId(1)
                .role("Lead")
                .build();
        Response response = given()
                .get(EndPoints.GET_ALLUSERS);

        Type listType = new TypeToken<ArrayList<User>>(){}.getType();
        List<User> actualUserList = gson.fromJson(response.getBody().asString(), listType);
        Assert.assertEquals(actualUserList.get(0),expectedUser);
    }

}
