public class Main {
    public static void main(String[] args) {
        PolicyOperations policyOps = new PolicyOperations();

        // Adding some sample policies
        Policy policy1 = new Policy(101, "John Doe", "Health", 10);
        Policy policy2 = new Policy(102, "Jane Smith", "Auto", 20);
        Policy policy3 = new Policy(103, "Alice Johnson", "Home", 5);
        Policy policy4 = new Policy(104, "Bob Brown", "Travel", 50);

        // Add policies to the system
        policyOps.add(policy1);
        policyOps.add(policy2);
        policyOps.add(policy3);
        policyOps.add(policy4);

        // Retrieve policy by number
        System.out.println("Retrieve policy by number 101:");
        policyOps.retrieveByNumber(101);

        // Show all expiring policies (expiry date <= 30)
        System.out.println("\nPolicies expiring in 30 days or less:");
        policyOps.Expiring();

        // Show policies for a specific policyholder
        System.out.println("\nPolicies for policyholder 'Jane Smith':");
        policyOps.showPolicyHolderName("Jane Smith");

        // Remove expiring policies with expiry date of 0
        System.out.println("\nRemoving policies with expiry date 0 (none in this case):");
        policyOps.removeExpiringPolicies();

        // Show all expiring policies again after removal
        System.out.println("\nPolicies expiring in 30 days or less after removal:");
        policyOps.Expiring();
    }
}
