public class BankMain {
    public static void main(String[] args) {
        BankImpl ob=new BankImpl();
        ob.withdraw(2000);
        ob.deposit(2000);
        if(ob instanceof BankImpl) {
            ob.deposit(4000);
        }
    }
    
}
