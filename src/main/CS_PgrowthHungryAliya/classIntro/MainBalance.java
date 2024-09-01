package CS_PgrowthHungryAliya.classIntro;

public class MainBalance {
    public static void main(String[] args) {
        BalanceImpl balance = new BalanceImpl(25);
        System.out.println(balance.getCurrentBalance());

        balance.setCurrentBalance(50);
        System.out.println(balance.getCurrentBalance());
    }
}
