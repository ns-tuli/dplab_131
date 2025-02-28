public class CreateAccountCommand implements Command{
    public bankAccount account;

    public CreateAccountCommand(bankAccount account){
        this.account=account;
    }

    @Override
    public void execute(){
        System.out.println("account creation executed");
    }




}
