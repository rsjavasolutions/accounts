package accounts;

//Dodać konto, które przy wypłacaniu pobiera 5% wpłacanych pieniędzy,
// a za każdą piątą wpłatę dodaje nam 50PLN (proszę zapronować nazwę dla nowego konta).

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
        return amount + " PLN";
    }
}
