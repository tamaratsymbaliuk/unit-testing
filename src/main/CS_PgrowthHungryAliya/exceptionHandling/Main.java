package CS_PgrowthHungryAliya.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;

       try {
          int c = divide(a, b);
       } catch (ArithmeticException e) {
           System.out.println(e.getMessage());
       }
    }
    public static int divide( int a, int b) {
        return a / b;
    }

}
