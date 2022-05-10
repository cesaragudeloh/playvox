package co.com.playvox.cesar.tasks;

import co.com.playvox.cesar.models.LoginModel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.playvox.cesar.userinterfaces.HomePage.*;

public class Login implements Task
{

    private LoginModel login;

    public Login(LoginModel login) {
        this.login = login;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                OpenBrowser.andLoadSite(),
                Click.on(LOGIN_OPTION),
                Enter.theValue(login.getUsername()).into(USERNAME_INPUT),
                Enter.theValue(login.getPassword()).into(PASSWORD_INPUT),
                Click.on(LOGIN_BUTTON)
        );
    }

    public static Login withTheData(LoginModel login){
        return Instrumented.instanceOf(Login.class).withProperties(login);
    }
}
