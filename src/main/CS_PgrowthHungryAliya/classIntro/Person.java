package CS_PgrowthHungryAliya.classIntro;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // Polymorphism, the same method exist in child Class
    public void printParent() {
        System.out.println("Oh no, no parent found");
    }


}
