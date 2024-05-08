import java.util.Arrays;
import java.util.Comparator;

public class Main {
    static <T> void printArray(String s, T[] t){
        System.out.println("       *** " + s + " ***         ");
            for (T x : t)
                System.out.println(x);

    }
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Max",  Sex.M, Size.XL, Country.NL),
                new Person("Jan",  Sex.M, Size.S,  Country.PL),
                new Person("Eva",  Sex.F, Size.XS, Country.NL),
                new Person("Lina", Sex.F, Size.L,  Country.DE),
                new Person("Mila", Sex.F, Size.S,  Country.DE),
                new Person("Ola",  Sex.F, Size.M,  Country.PL),
        };
        Comparator<Person> sexThenSize = (person1, person2) ->{
            if (person1.sex == person2.sex){
                return person1.size.compareTo(person2.size);
            }
            return person1.sex.compareTo(person2.sex);
        };
        Arrays.sort(persons, sexThenSize);
        printArray("Persons by sex and then size", persons);

        Arrays.sort(persons, (Person person1, Person person2) -> {
            if (person1.size == person2.size){
                return person1.name.compareTo(person2.name);
            }
            return person1.size.compareTo(person2.size);
        });
        printArray("Persons by size and then name", persons);

        Country[] countries = Country.values();
        Arrays.sort(countries, (country, country2) -> {
            return country2.compareTo(country);
        });
        printArray("Countries by name", countries);

    }
}