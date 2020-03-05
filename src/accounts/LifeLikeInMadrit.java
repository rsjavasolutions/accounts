package accounts;

public class LifeLikeInMadrit implements Account {

    private double amount;

    public LifeLikeInMadrit() {
        amount = 10_000;
    }

    @Override
    public void putMoney(double payment) {
        amount += payment;
    }

    @Override
    public void spendMoney(double payment) {
        if (amount >= payment) {
            amount -= payment;
        } else {
            System.out.println("Nie masz tyle kasy");
        }
    }

    @Override
    public String checkStatus() {
        return "Status Life like in Madrit accout: " + amount + " PLN";
    }
}
