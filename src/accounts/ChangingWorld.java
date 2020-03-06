package accounts;

import java.math.BigDecimal;

public class ChangingWorld implements Account {

    private double amount;
    private static int COUNTER = 0;

    public ChangingWorld() {
        amount = 10_000;
    }

    @Override
    public void putMoney(double payment) {
        ++COUNTER;
        double bonus = 50;
        if (COUNTER % 5 == 0){
            amount += payment + bonus;
        } else {
            amount += payment;
        }
    }

    @Override
    public void spendMoney(double payment) {
        payment *= 1.05;
        if (amount > payment) {
            amount -= payment;
        } else {
            System.out.println("Nie masz tyle kasy");
        }
    }

    @Override
    public String checkStatus() {
        return "Status Changing World accout: " + amount + " PLN";
    }
}
