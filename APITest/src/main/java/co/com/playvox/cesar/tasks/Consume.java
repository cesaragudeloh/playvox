package co.com.playvox.cesar.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static co.com.playvox.cesar.utils.Constants.X_API_KEY;
import static co.com.playvox.cesar.utils.Constants.KEY_VALUE;

public class Consume implements Task {

    private String resource;

    public Consume(String resource) {
        this.resource = resource;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(resource).with(
                        requestSpecification -> requestSpecification
                                .header(X_API_KEY, KEY_VALUE)

                )
        );
    }

    public static Consume theServiceWith(String resource){
        return Instrumented.instanceOf(Consume.class).withProperties(resource);
    }
}
