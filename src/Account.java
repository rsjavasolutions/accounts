public interface Account {

    void putMoney(double payment);

    void spendMoney(double payment);

    String checkStatus();
}
