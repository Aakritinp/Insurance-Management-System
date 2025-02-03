import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Policy> purchasedPolicies = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void purchasePolicy(Policy policy) {
        purchasedPolicies.add(policy);
    }

    public void viewPolicies() {
        if (purchasedPolicies.isEmpty()) {
            System.out.println("No policies purchased.");
        } else {
            for (Policy policy : purchasedPolicies) {
                System.out.println(policy);
            }
        }
    }
}
