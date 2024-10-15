package homework_24.task2;

public class BankTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.checkBalance();
        bankAccount.depositTransfer(100);
        bankAccount.checkBalance();
        bankAccount.withdrawMoney(20);
        bankAccount.checkBalance();
        bankAccount.withdrawMoney(120);
        bankAccount.checkBalance();

        ElectronicWallet electronicWallet=new ElectronicWallet();
        electronicWallet.checkBalance();
        electronicWallet.depositTransfer(1000);
        electronicWallet.checkBalance();
        electronicWallet.withdrawMoney(255);
        electronicWallet.checkBalance();
        electronicWallet.withdrawMoney(1200);
        electronicWallet.checkBalance();

    }
}
