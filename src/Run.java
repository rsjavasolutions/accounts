import accounts.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Run {
    public static void main(String[] args) {

        Account superCash = new SuperCash();
        Account lifeLikeInMadrit = new LifeLikeInMadrit();
        Account saving = new Saving();
        Account changingWorld = new ChangingWorld();

        List<Account> accounts = new ArrayList<>(Arrays.asList(superCash,
                lifeLikeInMadrit, saving, changingWorld));

        for (int i = 0; i < 10; i++) {
            for (Account account : accounts) {
                account.putMoney(100);
                account.spendMoney(50);
            }
        }

        for (Account account : accounts) {
            System.out.println(account.checkStatus());
        }
    }
}
