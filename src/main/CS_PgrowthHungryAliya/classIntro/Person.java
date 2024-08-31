package CS_PgrowthHungryAliya.classIntro;

public class Person {
    private String name;
    private int age;
    // parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // copy constructor
    public Person(Person anotherPerson) {
        this.name = anotherPerson.name;

        this.age = anotherPerson.age;

    }




}
