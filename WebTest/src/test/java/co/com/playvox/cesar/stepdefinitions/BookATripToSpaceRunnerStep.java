package co.com.playvox.cesar.stepdefinitions;

import co.com.playvox.cesar.models.LoginModel;
import co.com.playvox.cesar.models.ReservationModel;
import co.com.playvox.cesar.questions.GetText;
import co.com.playvox.cesar.tasks.Login;
import co.com.playvox.cesar.tasks.Make;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static co.com.playvox.cesar.userinterfaces.SitePage.ALERT_TERMS_AND_CONDITIONS;
import static co.com.playvox.cesar.utils.Constants.ALERT_MESSAGE;
import static co.com.playvox.cesar.utils.Setup.USER;
import static org.hamcrest.Matchers.*;

public class BookATripToSpaceRunnerStep {

    @Given("that Cesar enter the Space and Beyond web site")
    public void thatCesarEnterTheSpaceAndBeyondWebSite(LoginModel login) {
        USER.wasAbleTo(
                Login.withTheData(login)
        );
    }

    @When("he enters the data to buy the ticket to travel to space")
    public void heEntersTheDataToBuyTheTicketToTravelToSpace(ReservationModel reservation) {
        USER.attemptsTo(
                Make.theReservation(reservation)
        );
    }



    @Then("ticket purchase is successful")
    public void ticketPurchaseIsSuccessful() {
        USER.should(
               seeThat(GetText.ofTarget(ALERT_TERMS_AND_CONDITIONS), not(equalTo(ALERT_MESSAGE)))
       );
    }


}
