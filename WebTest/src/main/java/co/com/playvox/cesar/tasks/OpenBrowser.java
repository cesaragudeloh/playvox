package co.com.playvox.cesar.tasks;

import co.com.playvox.cesar.userinterfaces.HomePage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenBrowser implements Task {

    HomePage page;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(page)
        );
    }

    public static OpenBrowser andLoadSite(){
        return Instrumented.instanceOf(OpenBrowser.class).withProperties();
    }
}
