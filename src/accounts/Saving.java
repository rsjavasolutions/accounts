package accounts;

public class Saving implements Account {

    private double amount;

    public Saving() {
        amount = 10_000;
    }

    @Override
    public void putMoney(double payment) {
        payment *= 1.05;
        amount += payment;
    }

    @Override
    public void spendMoney(double payment) {
        payment *= 1.1;
        if (amount > payment){
            amount -= payment;
        } else {
            System.out.println("Nie masz tyle kasy");
        }
    }

    @Override
    public String checkStatus() {
        return "Status Saving accout: " + amount + " PLN";
    }
}
