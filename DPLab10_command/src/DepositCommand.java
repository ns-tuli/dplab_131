public class DepositCommand implements Command{
    public bankAccount account;
    private double amount;

    public DepositCommand(bankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute()
    {
        account.deposit(amount);
    }



}
