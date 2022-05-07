package co.com.playvox.cesar.stepdefinitions;

import co.com.playvox.cesar.tasks.Connect;
import co.com.playvox.cesar.tasks.Consume;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static co.com.playvox.cesar.utils.Constants.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.isEmptyOrNullString;

public class APITestStepDefitions {

    @Given("the user wants to get the votes information")
    public void theUserWantsToGetTheVotesInformation() {
        ACTOR.wasAbleTo(
                Connect.withTheEndpoint(ENDPOINT)
        );
    }


    @When("he executes the query")
    public void heExecutesTheQuery() {
        ACTOR.attemptsTo(
                Consume.theServiceWith(RESOURCE_VOTES)
        );
    }


    @Then("the user gets the votes information")
    public void theUserGetsTheVotesInformation() {
        ACTOR.should(
                seeThatResponse(response -> response
                        .statusCode(STATUS_CODE_200)
                        .body("id", hasItems(31098, 31105, 31400, 31509, 31529))
                        .body("value", hasItems(0, 1))
                        .body("sub_id", hasItem(equalTo(null)))
                        .body("country_code", hasItem(equalTo(null)))
                )
        );
    }


}
