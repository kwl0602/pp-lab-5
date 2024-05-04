import company.beans.Person;
import company.exceptions.InvalidAgeException;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Lord Voldemort", 71);
            System.out.println("Imie i naziwsko: " + person.getName() + ", wiek: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
    }
}
