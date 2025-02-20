import java.util.*;


public class Voting {
    // HashMap to store the votes (Candidate -> Votes)
    private Map<String, Integer> votesMap = new HashMap<>();


    // LinkedHashMap to maintain the order of votes
    private LinkedHashMap<String, Integer> voteOrderMap = new LinkedHashMap<>();


    // TreeMap to display the results in sorted order
    private TreeMap<String, Integer> sortedVotesMap = new TreeMap<>();


    // Method to cast a vote for a candidate
    public void castVote(String candidate) {
        // Update HashMap for vote count
        votesMap.put(candidate, votesMap.getOrDefault(candidate, 0) + 1);


        // Record the order of votes in LinkedHashMap
        voteOrderMap.put(candidate, votesMap.get(candidate));
    }


    // Method to display votes in the order they were cast
    public void displayVoteOrder() {
        System.out.println("Votes in the order they were cast:");
        for (Map.Entry<String, Integer> entry : voteOrderMap.entrySet()) {
            System.out.println("Candidate: " + entry.getKey() + ", Votes: " + entry.getValue());
        }
    }


    // Method to display the sorted voting results
    public void displaySortedResults() {
        // Populate the TreeMap with the current vote counts
        sortedVotesMap.putAll(votesMap);


        System.out.println("Voting results in sorted order:");
        for (Map.Entry<String, Integer> entry : sortedVotesMap.entrySet()) {
            System.out.println("Candidate: " + entry.getKey() + ", Votes: " + entry.getValue());
        }
    }
   
    // Method to display the current vote count for all candidates
    public void displayVoteCounts() {
        System.out.println("Current vote counts:");
        for (Map.Entry<String, Integer> entry : votesMap.entrySet()) {
            System.out.println("Candidate: " + entry.getKey() + ", Votes: " + entry.getValue());
        }
    }


    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();


        // Casting votes
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");


        // Display votes in the order they were cast
        votingSystem.displayVoteOrder();


        // Display the current vote count
        votingSystem.displayVoteCounts();


        // Display the sorted voting results
        votingSystem.displaySortedResults();
    }
}
