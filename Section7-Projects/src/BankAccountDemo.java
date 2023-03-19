public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount myBankAccount = new BankAccount("Janine", 10);

        myBankAccount.getBalance();
        myBankAccount.getOwner();
        myBankAccount.deposit(90);
        myBankAccount.getBalance();
        myBankAccount.withdraw(100);
        myBankAccount.getBalance();
    }// end main
}// end BankAccountDemo
