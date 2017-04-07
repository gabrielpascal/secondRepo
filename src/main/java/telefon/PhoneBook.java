package telefon;

import java.util.ArrayList;

/**
 * Created by gpascal on 4/7/2017.
 */
public class PhoneBook extends Contact{
    private ArrayList<Contact> list;

    public PhoneBook(String lastName, String firstName, String homeAddress, String phoneNumber, ArrayList<Contact> list) {
        super(lastName, firstName, homeAddress, phoneNumber);
        this.list = list;
    }

    public ArrayList<Contact> getList() {
        return list;
    }

    public void setList(ArrayList<Contact> list) {
        this.list = list;
    }
}
