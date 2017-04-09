import telefon.Contact;
import telefon.PhoneBook;

import java.util.ArrayList;

/**
 * Created by gpascal on 4/7/2017.
 */
public class PhoneApp {
    public static void main(String[] args) {

        Contact firstContact = new Contact("Pascal","Gabi","Strada Mugurilor","0740500109");
        Contact secondContact = new Contact("Pascal","Ancuta-Elena","Strada mugurilor","0742687478");

        ArrayList<Contact> agenda = new ArrayList<Contact>(2);
        agenda.add(firstContact);
        agenda.add(secondContact);

        PhoneBook t = new PhoneBook(agenda);
        //t.printContact();

        t.addContact(firstContact);

        t.printContact();

        t.searchAndDisplay("pascal",t);

    }
}
