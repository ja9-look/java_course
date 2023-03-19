public class BankAccount {

    private String owner;
    private int balance;

    public BankAccount(String owner){
        this.owner = owner;
        this.balance = 0;
    }// end BankAccount ctor with owner params

    public BankAccount(String owner, int balance){
        if(balance > 0) {
            this.owner = owner;
            this.balance = balance;
        } else {
            System.out.println("The balance needs to be greater than 0.");
        }
    }// end BankAccount ctor with owner and balance params

    public void deposit(int amount){
        if(amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("The deposit amount needs to be greater than 0.");
        }
    }// end deposit

    public void withdraw(int amount){
        if (amount < 0){
            System.out.println("Please provide an amount greater than 0.");
        }
        else if (balance - amount >= 0){
            this.balance -= amount;
        } else {
            System.out.println("You don't have enough funds. Please try again with a lower amount.");
        }
    }// end withdraw

    public void getOwner(){
        System.out.println(owner);
    }// end getOwner

    public void getBalance(){
        System.out.println(balance);
    }// end getBalance

}// end BankAccount
