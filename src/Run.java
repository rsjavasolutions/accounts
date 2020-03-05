import accounts.*;

public class Run {
    public static void main(String[] args) {

        Account superCash = new SuperCash();
        Account lifeLikeInMadrit = new LifeLikeInMadrit();
        Account saving = new Saving();
        Account changingWorld = new ChangingWorld();

        for (int i = 0; i < 5; i++) {
            changingWorld.putMoney(1);
            System.out.println(changingWorld.checkStatus());
        }


    }
}
