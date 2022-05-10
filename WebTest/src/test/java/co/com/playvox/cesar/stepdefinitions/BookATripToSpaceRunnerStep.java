package co.com.playvox.cesar.stepdefinitions;

import co.com.playvox.cesar.models.LoginModel;
import co.com.playvox.cesar.tasks.Login;
import co.com.playvox.cesar.tasks.Make;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class BookATripToSpaceRunnerStep {

    @Managed(driver = "chrome")
    private WebDriver hisDriver;
    private static Actor user = Actor.named("Cliente");


    @DataTableType
    public LoginModel responseEntry(Map<String, String> entry) {
        return new LoginModel(
                entry.get("username"),
                entry.get("password")
        );
    }

    @Before
    public void setUp(){
       user.can(BrowseTheWeb.with(hisDriver));
    }


    @Given("that Cesar enter the Space and Beyond web site")
    public void thatCesarEnterTheSpaceAndBeyondWebSite(LoginModel login) {
        user.wasAbleTo(
                Login.withTheData(login)
        );
    }


    @When("he enters the data to buy the ticket to travel to space")
    public void heEntersTheDataToBuyTheTicketToTravelToSpace() {
      user.attemptsTo(
              Make.theReservation()
      );
    }


    @Then("ticket purchase is successful")
    public void ticketPurchaseIsSuccessful() {
        System.out.println("Then");
    }


}
