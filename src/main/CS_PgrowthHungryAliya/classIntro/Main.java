package CS_PgrowthHungryAliya.classIntro;

public class Main {
    public static void main(String[] args) {
        Person aliya = new Person("Aliya", 28);
        Person copy = new Person(aliya);
        copy.setName("Tom");

        System.out.println("My copy object name is " + copy.getName());
        System.out.println("My copy object age is "+ copy.getAge());
    }
}
