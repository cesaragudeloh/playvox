package co.com.playvox.cesar.questions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class GetText implements Question<String> {

    private Target element;

    public GetText(Target element) {
        this.element = element;
    }

    @Override
    public String answeredBy(Actor actor) {
        String alert = Text.of(element).answeredBy(actor).toString();
        System.out.println("La alerta es: "+alert);
        return alert;
    }

    public static GetText ofTarget(Target element){
        return Instrumented.instanceOf(GetText.class).withProperties(element);
    }
}
