package telefon;

import java.util.ArrayList;

/**
 * Created by gpascal on 4/7/2017.
 */
public class PhoneBook {
    private ArrayList<Contact> list;

//    public PhoneBook(String lastName, String firstName, String homeAddress, String phoneNumber, ArrayList<Contact> list) {
//        super(lastName, firstName, homeAddress, phoneNumber);
//        this.list = list;
//    }
 //   public PhoneBook() {}

    public PhoneBook(ArrayList<Contact> list) {
        this.list = list;
    }

    public ArrayList<Contact> getList() {
        return list;
    }

    public void setList(ArrayList<Contact> list) {
        this.list = list;
    }

    public void addContact(Contact contact)
    {
        this.list.add(contact);
    }

    public void printContact()
    {
        for (Contact t : this.list)
        {
            System.out.println(t.toString());
        }
    }

    public void searchAndDisplay(String t, PhoneBook phoneBook)
    {
        for (Contact contact : phoneBook.list)
        {
            if (contact.getFirstName().toLowerCase().equals(t.toLowerCase()) || contact.getLastName().toLowerCase().equals(t.toLowerCase()))
            {
                System.out.println("\n am gasit contactul cautat");
            }
        }
    }

    public void searchAndDelete(String t)
    {
        //todo
    }

}
