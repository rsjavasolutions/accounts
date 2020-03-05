import accounts.Account;
import accounts.LifeLikeInMadrit;
import accounts.Saving;
import accounts.SuperCash;

public class Run {
    public static void main(String[] args) {

        Account superCash = new SuperCash();
        Account lifeLikeInMadrit = new LifeLikeInMadrit();
        Account saving = new Saving();


        saving.putMoney(100);
        saving.putMoney(100);
        saving.putMoney(100);
        System.out.println(saving.checkStatus());

    }
}
