import java.util.ArrayList;

public class Customer {

    private ArrayList<Double> transactions;
    private String name;

    public Customer(String name, double initialAmount) {
        this.transactions = new ArrayList<Double>();
        this.name = name;
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String toString(){
        return "Name: " + name + " Transactions: " + transactions;
    }
}
