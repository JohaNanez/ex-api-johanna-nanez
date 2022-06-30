package com.nttdata.freetogame;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class ObtenerUsuario {

    //private static String GET_USER = "https://www.freetogame.com/api/games?platform={platform}&category={category}";
    private static String GET_USER = "https://www.freetogame.com/api/games?platform=pc&category=shooter";
    @Step("Obtener usuario {0} en freetogame")
     public void obtenerUsuario(String platform, String category){
        SerenityRest.get(GET_USER);

    }
}
