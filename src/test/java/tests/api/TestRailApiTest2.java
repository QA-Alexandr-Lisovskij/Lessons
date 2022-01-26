package tests.api;

import baseEntities.BaseApiTest;
import models.User;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.EndPoints;

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
       User actualUser;
        actualUser = given()
                 .pathParam("id",userID)
                 .get(EndPoints.GET_USER)
                 .then()
                 .log().body()
                 .assertThat()
                 .statusCode(HttpStatus.SC_OK)
                 .extract()
                 .as(User.class);
        Assert.assertEquals(actualUser,expectedUser);
    }
}
