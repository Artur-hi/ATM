public class Main {
    public static void main(String[] args) {
        Atm atm = new Atm(10000);

        atm.addMoney(100);
        atm.getMoney(1000);
        atm.getMoney(100000);
    }
}
