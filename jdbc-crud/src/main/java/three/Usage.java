package three;

public class Usage {

    public static void main(String[] args) {
        CommandOperation commandOperation = new CommandOperation();

        commandOperation.insertOperation(2,"Tatari",2,"Tallinn","10105");

        commandOperation.updateOperation(1,"test",7,"Tartu","DB67");

        commandOperation.deleteOperation(1);
    }
}
