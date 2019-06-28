import java.util.ArrayList;

public class Bank {

    private ArrayList<Branch> branches;
    private String name;

    //Constructor

    public Bank(String name) {
        this.branches = new ArrayList<Branch>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    //Reused to find branch

    public Branch findBranch(String branchName){
        for (Branch b:branches) {
            if(b.getName().equals(branchName)){
                return b;
            }
        }
        return null;
    }

    public void addBranch(String branchName) {
        if (findBranch(branchName) != null) {
            System.out.println("Branch already exists!");
        } else {
            branches.add(new Branch(branchName));
            System.out.println("Branch added!");
        }
    }

    public void addCustomer(String customerName, String branchName, double amount) {
        Branch checkedBranch = findBranch(branchName);
        if (checkedBranch != null) {
            checkedBranch.addCustomer(customerName, amount);
        } else {
            System.out.println("Branch does not exist!");
        }
    }

    public void addTransaction(String customerName, String branchName, double amount) {
        Branch checkedBranch = findBranch(branchName);
        if (checkedBranch != null) {
            checkedBranch.addTransaction(customerName, amount);
        } else {
            System.out.println("Customer does not exist!");
        }
    }

    public void printAccounts() {
        for (Branch b:branches) {
            System.out.println("Branch: " + b.getName() + ": ");
                b.printBranchCustomers();
            }
    }
}
