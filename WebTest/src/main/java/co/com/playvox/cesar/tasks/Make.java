package co.com.playvox.cesar.tasks;

import co.com.playvox.cesar.models.ReservationModel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.playvox.cesar.userinterfaces.SitePage.*;


public class Make implements Task {

    private ReservationModel reservation;

    public Make(ReservationModel reservation) {
        this.reservation = reservation;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOOK_BUTON),
                Enter.theValue(reservation.getName()).into(NAME_INPUT),
                Enter.theValue(reservation.getEmailAddress()).into(EMAIL_INPUT),
                Enter.theValue(reservation.getSocialSecurityNumber()).into(SOCIAL_SECURITY_NUMBER_INPUT),
                Enter.theValue(reservation.getPhoneNumber()).into(PHONE_NUMBER_INPUT),
                Click.on(CHECK_AGREE),
                Click.on(PAY_NOW_BUTTON)
        );
    }

    public static Make theReservation(ReservationModel reservation){
        return Instrumented.instanceOf(Make.class).withProperties(reservation);
    }
}
