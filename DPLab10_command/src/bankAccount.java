public class bankAccount {
    public String accountNumber;
    private double balance;

    public bankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println("account "+accountNumber+ "created with tk" + balance);
    }

    public void deposit(double amount){
        balance+=amount;
        System.out.println("deposited " + amount + " into " + accountNumber);
    }

    public void widthdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("widthdrew "+amount +" from "+accountNumber);
        }
        else{
            System.out.println("insufficent balance");
        }
    }

    public void getBanalce()
    {
      System.out.println("Account " + accountNumber + " balance: " + balance);
    }

}
