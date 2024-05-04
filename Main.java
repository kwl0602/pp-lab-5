import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Lord Voldemort", 71);
            System.out.println("Imie i nazwisko: " + person.getName() + ", Wiek: " + person.getAge());

            int sum = MathUtils.add(50, 21);
            System.out.println("Sumą 50 i 21 jest: " + sum);

            Messenger messenger = new EmailMessenger();
            messenger.sendMessage("Witamy w śmierciożercach " + person.getName() + "! Sumą 50 i 21 jest: " + sum);
        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
    }
}
