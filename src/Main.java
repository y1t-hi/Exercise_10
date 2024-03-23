/*\
Wyatt Compton
Exercise 10
wow we are half way there cant wait for the end!
 */


import java.util.*;

public class Main {

    public static void main(String[] args) {
        collectionOfContacts myContacts = new collectionOfContacts();

        for(Contact a : myContacts){
            System.out.println(a);
        }
    }
}
class Contact{
    private String name;
    private String emailAddress;

    public Contact(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Contact" +
                "name:" + name +
                ", emailAddress:" + emailAddress ;
    }
}

class collectionOfContacts implements Iterable<Contact>{
    private ArrayList<Contact> listOfContacts = new ArrayList<>();

    @Override
    public String toString() {
        return "collectionOfContacts{" +
                "listOfContacts=" + listOfContacts +
                '}';
    }

    public collectionOfContacts() {
        listOfContacts.add(new Contact("bob", "bob@gmail.com"));
        listOfContacts.add(new Contact("bibby", "bibby@gmail.com"));
        listOfContacts.add(new Contact("bid", "bid@gmail.com"));
        listOfContacts.add(new Contact("boom", "boom@gmail.com"));
        listOfContacts.add(new Contact("bobby", "bobby@gmail.com"));
    }

    @Override
    public Iterator<Contact> iterator() {
        return listOfContacts.iterator();
    }
}