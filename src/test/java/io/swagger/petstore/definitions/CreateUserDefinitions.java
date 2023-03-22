package io.swagger.petstore.definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.swagger.petstore.models.UserModels;
import io.swagger.petstore.steps.CreateUserStep;
import io.swagger.petstore.utils.TransformJsonUtils;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class CreateUserDefinitions {
    @Steps
    private CreateUserStep createUserStep;

    @When("creation of a user")
    public void creationOfAUser(List<List<String>> listCreate) {
        UserModels userModel = new UserModels(listCreate);
        String userJson = TransformJsonUtils.transform(userModel);
        createUserStep.createUser(userJson);
    }

    @Then("verify user creation with status {int}")
    public void verifyUserCreationWithStatus(int status) {
        SerenityRest.lastResponse().then().statusCode(status);
    }


}
