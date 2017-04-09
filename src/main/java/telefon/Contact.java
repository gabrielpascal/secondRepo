package telefon;

/**
 * Created by gpascal on 4/7/2017.
 */
public abstract class Contact {

    private String lastName;
    private String firstName;
    private String homeAddress;
    private String phoneNumber;

    public Contact(String lastName, String firstName, String homeAddress, String phoneNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.homeAddress = homeAddress;
        this.phoneNumber = phoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString()
    {
        return this.getFirstName() + this.getLastName() + "\n" + this.getPhoneNumber() + "\n" + this.getHomeAddress();
    }
}
