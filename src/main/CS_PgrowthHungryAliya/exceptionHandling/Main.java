package CS_PgrowthHungryAliya.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;

       try {
          int c = divide(a, b);
       } catch (MyException e) {
           System.out.println(e.getMessage());
       }
    }
    /*public static int divide( int a, int b) throws ArithmeticException {
        if (b == 0) {throw new ArithmeticException("my message");}
        return a / b;
    }
     */

    public static int divide( int a, int b) throws MyException {
        if (b == 0) {throw new MyException();}
        return a / b;
    }

}
