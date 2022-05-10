package co.com.playvox.cesar.models;

public class ReservationModel {

    private String name;
    private String emailAddress;
    private String socialSecurityNumber;
    private String phoneNumber;

    public ReservationModel(String name, String emailAddress, String socialSecurityNumber, String phoneNumber) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.socialSecurityNumber = socialSecurityNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "ReservationModel{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
