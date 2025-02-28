public class WidthdrawCommand implements Command{
    public bankAccount account;
   private double amount;

    public WidthdrawCommand(bankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute()
    {
        account.widthdraw(amount);
    }



}
