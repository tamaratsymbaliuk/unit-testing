package CS_PgrowthHungryAliya;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            printLine("one line");
            System.out.println("i = " + i);
            System.out.println("more");
        }
    }
    public static void printLine(String line) {
        System.out.println(line);
    }

}
