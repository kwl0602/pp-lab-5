import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Lord Voldemort", 71);
            System.out.println("Imie i nazwisko: " + person.getName() + ", Wiek: " + person.getAge());

            Messenger messenger = new EmailMessenger();
            messenger.sendMessage("Witamy w śmierciożercach " + person.getName() + "!");
        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
    }
}
