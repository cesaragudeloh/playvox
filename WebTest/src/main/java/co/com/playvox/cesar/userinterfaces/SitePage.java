package co.com.playvox.cesar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SitePage {

    public static final Target BOOK_BUTON = Target.the("Book Button").locatedBy("(//button[text()='Book'])[1]");
    public static final Target NAME_INPUT = Target.the("Name Input").locatedBy("(//form/div/input[@type='text'])[1]");
    public static final Target EMAIL_INPUT = Target.the("Email Address Input").locatedBy("//form/div/input[@type='email']");
    public static final Target SOCIAL_SECURITY_NUMBER_INPUT = Target.the("Social Security Number Input").locatedBy("(//form/div/input[@type='text'])[2]");
    public static final Target PHONE_NUMBER_INPUT = Target.the("Phone Number Input").locatedBy("//form/div/input[@type='tel']");
    public static final Target CHECK_AGREE = Target.the("Check I agree terms").locatedBy("//span[text()='I agree to the terms and conditions']");
    public static final Target PAY_NOW_BUTTON = Target.the("Pay now button").locatedBy("//button[text()='Pay now']");
}
