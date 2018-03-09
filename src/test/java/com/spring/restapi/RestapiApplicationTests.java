package com.spring.restapi;

import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.jayway.restassured.RestAssured;
import static com.jayway.restassured.RestAssured.given;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RestapiApplication.class)
@WebAppConfiguration
@IntegrationTest("server.port:0")
@PropertySource("classpath:application.properties")
public class RestapiApplicationTests {
	
	@Value("${local.server.port}")   
    int port;
	
	@Before
    public void setUp() {
    
        RestAssured.port = port;
    }

	@Test
	public void runningAppWithRandomPortTest() {
		given().when().get("/").then().statusCode(HttpStatus.SC_OK).body(Matchers.is("Hello World!"));
	

	}
	

	@Test
	public void runningAppWithEmbeddeedMongoDb() {
		given().when().get("/api/times").then().statusCode(HttpStatus.SC_OK);
	

	}

}
