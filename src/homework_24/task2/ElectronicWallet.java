package homework_24.task2;

public class ElectronicWallet extends Account implements PaymentSystem {
    public ElectronicWallet() {
        currency = "USD";
    }

    @Override
    public void withdrawMoney(double amount) {
        if (money >= amount) {
            money = money - amount;
        } else {
            System.out.println("На вашем электронном кошельке не достаточно средств!");
        }
    }

    @Override
    public void depositTransfer(double amount) {
        money = money + amount;
    }

    @Override
    public void checkBalance() {
        System.out.println("На вашем электронном кошельке: " + money + " " + currency);

    }
}
