package accounts;

public class SuperCash implements Account {

    private double amount;

    public SuperCash() {
        amount = 10_000;
    }

    @Override
    public void putMoney(double payment) {
        amount += (payment * 0.98);
    }

    @Override
    public void spendMoney(double payment) {
        payment += 1;
       if (amount >= payment){
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
