package CS_PgrowthHungryAliya.classIntro;

public class Child extends Person{
    Person parent;

    public Child(String name, int age) {
        super(name, age);
    }

    public Child(Person anotherPerson) {
        super(anotherPerson);
    }
    public void printParent() {
        System.out.println(parent.getName());
    }
}
