public class Atm {

    int moneyValue;  //500

    public Atm(int money) {
        this.moneyValue = money;
    }

    public void getMoney(int money) {
        if (money > moneyValue) {
            System.out.println("Денег в банкомате недостаточно для выдачи данной суммы.");
            return;
        }

        moneyValue = moneyValue - money;
        System.out.println("возьмите свои деньги в размере: " + money);
        System.out.println("остаток на карте: " + moneyValue);
    }

    public void addMoney(int money) {
        moneyValue = money + moneyValue;
        System.out.println("остаток на карте: " + moneyValue);
    }
}


