package co.com.sofka.stepdefinition.services;

import io.restassured.RestAssured;
import org.apache.log4j.PropertyConfigurator;

import static co.com.sofka.util.Log4jValues.LOG4J_PROPERTIES_FILE_PATH;

public class WebUI {
    private static final String BASE_URI = "https://reqres.in";
    private static final String BASE_PATH = "/api";
    private static final String LIST_RESOURCES = "/unknown";

    protected void generalSetUp(){
        setUpLog4j2();
        setUpBases();
    }

    private void setUpLog4j2(){
        PropertyConfigurator.configure(System.getProperty("user.dir")  + LOG4J_PROPERTIES_FILE_PATH.getValue());
    }

    private void setUpBases(){
        RestAssured.baseURI = BASE_URI;
        RestAssured.basePath = BASE_PATH;
    }
}


