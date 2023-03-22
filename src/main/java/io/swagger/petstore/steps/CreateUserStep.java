package io.swagger.petstore.steps;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class CreateUserStep {

    @Step
    public void createUser(String userJson) {
        SerenityRest.given().baseUri("https://petstore.swagger.io/v2/user").header("Content-Type", "application/json").body(userJson).post();
    }


}
