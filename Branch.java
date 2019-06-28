import java.util.ArrayList;

public class Branch {

    private ArrayList<Customer> customers;
    private String name;

    public Branch(String name) {
        this.customers = new ArrayList<Customer>();
        this.name = name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return name;
    }

    public Customer findCustomer(String customerName){
        for (Customer c:customers) {
            if(c.getName().equals(customerName)){
                return c;
            }
        }
        return null;
    }

    public void addCustomer(String customerName, double amount){
            if(findCustomer(customerName) != null){
                System.out.println("Customer already exists!");
            }

        customers.add(new Customer(customerName, amount));
        System.out.println("Customer added to branch!");
    }

    public void addTransaction(String customerName, double amount) {
        Customer checkedCustomer = findCustomer(customerName);
        if(checkedCustomer != null){
                checkedCustomer.addTransaction(amount);
                System.out.println("Transaction added to customer account!");
            }
            else {
            System.out.println("Customer does not exist!");
        }
    }

    public void printBranchCustomers() {
        for (Customer c:customers) {
                System.out.println(c.toString());
        }
    }
}
