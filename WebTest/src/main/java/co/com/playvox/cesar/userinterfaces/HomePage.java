package co.com.playvox.cesar.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demo.testim.io/")
public class HomePage extends PageObject {

    public static final Target LOGIN_OPTION = Target.the("Login option").locatedBy("(//button[text()='Log in'])[1]");
    public static final Target USERNAME_INPUT = Target.the("Username input").locatedBy("//input[@tabindex='1']");
    public static final Target PASSWORD_INPUT = Target.the("password input").locatedBy("//input[@tabindex='2']");
    public static final Target LOGIN_BUTTON = Target.the("Login Button").locatedBy("(//button[text()='Log in'])[2]");
}
