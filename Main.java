import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        final int b = 10;

        Messenger messenger = new EmailMessenger();

        try {
            people[0] = new Person("Peter Pettigrew", 38);
            people[1] = new Person("Lord Voldemort", 71);
            people[2] = new Person("Regulus Black", 18);
            people[3] = new Person("Bellatriks Lestrange", 47);
            people[4] = new Person("Severus Snape", 38);

            for (Person person : people) {
                int agePlusB = MathUtils.add(person.getAge(), b);
                String message = "Witaj śmierciożerco " + person.getName() + "! Twój wiek + 10 to: " + agePlusB;
                messenger.sendMessage(message);
            }
        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Błąd: " + e.getMessage());
        }
    }
}
