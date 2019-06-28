import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank("Nordea");
        while(!exit) {
            System.out.println("(1) - Add Branch");
            System.out.println("(2) - Add customer to branch");
            System.out.println("(3) - Add customer transaction");
            System.out.println("(4) - Exit");
            System.out.print("Choice: ");
            switch (sc.nextInt()){
                case 1:
                    bank.addBranch("oxford");
                    bank.addBranch("glasgow");
                    break;
                case 2:
                    bank.addCustomer("Customer1", "oxford", 10.25d);
                    bank.addCustomer("Customer2", "oxford", 20.14d);
                    bank.addCustomer("Customer3", "glasgow", 25.25d);
                    break;
                case 3:
                    bank.addTransaction("Customer1", "oxford", 5.10d);
                    bank.addTransaction("Customer2", "oxford", 23.01d);
                    bank.addTransaction("Customer3", "glasgow", 5.05d);
                    break;
                case 4:
                    exit = true;
                    break;
                case 5:
                    bank.printAccounts();
                    break;
            }
        }
    }
}
