package homework_24.task2;

public class BankAccount extends Account implements PaymentSystem {
    public BankAccount() {
        currency = "EUR";
    }

    @Override
    public void withdrawMoney(double amount) {
        if (money < amount) {
            System.out.println("На вашем счете не доствточно средств!");
        } else {
            money = money - amount;
        }
    }

    @Override
    public void depositTransfer(double amount) {
        money = money + amount;
    }

    @Override
    public void checkBalance() {
        System.out.println("На вашем счету: " + money + " " + currency);
    }
}
