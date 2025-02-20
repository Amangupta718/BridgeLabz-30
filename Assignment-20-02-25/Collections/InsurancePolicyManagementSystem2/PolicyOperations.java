import java.util.*;

public class PolicyOperations {
    final private Map<Integer, Policy> policies = new HashMap<>();
    Map<Integer, Policy> lm = new LinkedHashMap<>();
    TreeMap<Integer, List<Policy>> tm = new TreeMap<>();

    public void add(Policy p) {
        policies.put(p.policynumber, p);
        lm.put(p.policynumber, p);
        tm.computeIfAbsent(p.expirydate, k -> new ArrayList<>()).add(p);
    }

    public void retrieveByNumber(int policynumber) {
        Policy p = policies.get(policynumber);
        if (p != null) {
            p.display();
        } else {
            System.out.println("Policy with number " + policynumber + " not found.");
        }
    }

    public void Expiring(){
        System.out.println("Policies expiring within 30 days:");
        for (Map.Entry<Integer, List<Policy>> entry : tm.headMap(30, true).entrySet()) {
            for (Policy p : entry.getValue()) {
                p.display();
            }
        }
    }

    public void showPolicyHolderName(String policyholdername){
        System.out.println("Policies for policyholder: " + policyholdername);
        for (Policy p : policies.values()) {
            if (p.getPolicyholdername().equalsIgnoreCase(policyholdername)) {
                p.display();
            }
        }
    }

    public void removeExpiringPolicies(){
        System.out.println("Removing expired policies...");
        List<Integer> policiesToRemove = new ArrayList<>();

        for (Map.Entry<Integer, List<Policy>> entry : tm.headMap(1, true).entrySet()) {
            for (Policy p : entry.getValue()) {
                policiesToRemove.add(p.policynumber);
            }
        }

        for (int policyNumber : policiesToRemove) {
            Policy p = policies.remove(policyNumber);
            lm.remove(policyNumber);
            tm.get(p.expirydate).remove(p);
            if (tm.get(p.expirydate).isEmpty()) {
                tm.remove(p.expirydate);
            }
        }
    }
}
