package io.swagger.petstore.definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.swagger.petstore.models.PetRequestModels;
import io.swagger.petstore.models.UserModels;
import io.swagger.petstore.steps.CreateUserStep;
import io.swagger.petstore.steps.PetRequestStep;
import io.swagger.petstore.utils.TransformJsonUtils;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CreateUserDefinitions {

    // Se llaman los pasos desde los diferentes Steps
    @Steps
    private CreateUserStep createUserStep;

    @Steps
    private PetRequestStep petRequestStep;

    // Accesiones a realizar en el caso de prueba uno
    @When("creation of a user")
    public void creationOfAUser(List<List<String>> listCreate) {
        UserModels userModel = new UserModels(listCreate);
        String userJson = TransformJsonUtils.transform(userModel);
        createUserStep.createUser(userJson);
    }

    @Then("verify user creation with status {int}")
    public void verifyUserCreationWithStatus(int status) {
        assertThat(SerenityRest.lastResponse().then().statusCode(status));
    }


    // Accesiones a realizar en el caso de prueba dos
    @When("creation of a pet request")
    public void creationOfAPetRequest(List<List<String>> listPetRequest) {
        PetRequestModels petRequestModels = new PetRequestModels(listPetRequest);
        String userPetJson = TransformJsonUtils.transform(petRequestModels);
        petRequestStep.createPet(userPetJson);
    }

    @Then("check in the body of the Json contains {string} and the status is {int}")
    public void checkInTheBodyOfTheJsonContainsAndTheStatusIs(String status, Integer statusCode) {
        assertThat(SerenityRest.lastResponse().then().statusCode(statusCode));
        assertThat(SerenityRest.lastResponse().getBody().asString()).contains(status);
    }

}


