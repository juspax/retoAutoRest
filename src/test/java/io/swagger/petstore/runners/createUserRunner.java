package io.swagger.petstore.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/create_user.feature",
        tags = "@CaseTwo",
        glue = "io.swagger.petstore",
        snippets = CucumberOptions.SnippetType.CAMELCASE)


public class createUserRunner {
}
