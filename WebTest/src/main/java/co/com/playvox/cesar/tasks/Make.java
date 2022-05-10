package co.com.playvox.cesar.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.playvox.cesar.userinterfaces.SitePage.*;


public class Make implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOOK_BUTON),
                Enter.theValue("Cesar Agudelo").into(NAME_INPUT),
                Enter.theValue("cesar@gmail.com").into(EMAIL_INPUT),
                Enter.theValue("443-87-0636").into(SOCIAL_SECURITY_NUMBER_INPUT),
                Enter.theValue("18009359935").into(PHONE_NUMBER_INPUT),
                Click.on(CHECK_AGREE),
                Click.on(PAY_NOW_BUTTON)
        );
    }

    public static Make theReservation(){
        return Instrumented.instanceOf(Make.class).withProperties();
    }
}
