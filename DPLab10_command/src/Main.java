//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        bankAccount account = new bankAccount("tuli31",1000);

        BankOperationExecutor executor = new BankOperationExecutor();


        Command createAccount = new CreateAccountCommand(account);
        Command deposit = new DepositCommand(account ,100);
        Command widthdraw = new WidthdrawCommand(account,50);

        executor.setCommand(createAccount);
        executor.executeCommand();

        executor.setCommand(deposit);
        executor.executeCommand();

        executor.setCommand(widthdraw);
        executor.executeCommand();


        account.getBanalce();
        executor.printCommandStack();




    }
}