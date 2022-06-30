package com.nttdata.freetogame;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ObtenerUsuarioStepsDefs {

    @Steps
    ObtenerUsuario obtenerUsuario;

    @When("cuando consultamos la pagina freetogame con la platform {string}, category {string}")
    public void obtenerUsuario(String platform, String category){
        obtenerUsuario.obtenerUsuario(platform,platform);
    }
    @Then("el codigo de respuesta es {int}")
    public void elCodigoDeRespuestaEs(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }
}
