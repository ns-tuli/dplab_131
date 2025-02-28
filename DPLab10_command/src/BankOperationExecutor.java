import java.util.Stack;

public class BankOperationExecutor {
    public Command command;
    public Stack<Command> commandStack = new Stack<>();



    public void setCommand(Command command){
        this.command = command;
        commandStack.push(command);


    }

    public void executeCommand()
    {
        command.execute();
    }

    public void printCommandStack(){
        System.out.println("executed commands stack: ");
        for(Command cmd : commandStack){
            System.out.println(cmd.getClass().getSimpleName());
        }
    }


}
