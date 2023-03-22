package io.swagger.petstore.steps;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class PetRequestStep {

    // // Se realiza el consumo del servicio con el metodo Post
    @Step
    public void createPet(String petCreateJson) {
        SerenityRest.given().baseUri("https://petstore.swagger.io/v2/store/order").header("Content-Type", "application/json").body(petCreateJson).post();

    }

}
