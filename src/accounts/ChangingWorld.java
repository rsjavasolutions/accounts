package accounts;

public class ChangingWorld implements Account {

    private double amount;

    public ChangingWorld() {
        amount = 10_000;
    }

    @Override
    public void putMoney(double payment) {

    }

    @Override
    public void spendMoney(double payment) {

    }

    @Override
    public String checkStatus() {
        return null;
    }
}
