package co.com.sofka.stepdefinition;

import co.com.sofka.stepdefinition.services.WebUI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;

import java.util.logging.Logger;

public class UnknownTestStepDefinition extends WebUI {

   public static final Logger LOGER = Logger.getLogger(UnknownTestStepDefinition.class);
   private Response response;
   private RequestSpecification request;
    @Given("necesito cuantos colores desconocidos hay en la lista")
    public void necesito_cuantos_colores_desconocidos_hay_en_la_lista() {
        try{
            generalSetUp();
            request = request.given()
                    .contentType(ContentType.JSON);

        }catch (Exception e){
            LOGER.error(e.getMessage(),e);
            Assertions.fail(e.getMessage());

        }

    }
    @When("para realizar peticion a la solicitud de muestra")
    public void para_realizar_peticion_a_la_solicitud_de_muestra() {
        try{

        }catch (Exception e){
            LOGER.error(e.getMessage(),e);
            Assertions.fail(e.getMessage());

        }

    }
    @Then("nos mostrara el listado de colores desconocidos que se encuentran en la lista")
    public void nos_mostrara_el_listado_de_colores_desconocidos_que_se_encuentran_en_la_lista() {
        try{

        }catch (Exception e){
            LOGER.error(e.getMessage(),e);
            Assertions.fail(e.getMessage());

        }
    }
}
