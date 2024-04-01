import java.util.Scanner;

public class Assignment2 {
    public static String countVote(String[] votes, int start, int end) {
        if (start == end) {
            return votes[start];
        } else {
            int mid = start + (end - start) / 2;
            String leftCandidates = countVote(votes, start, mid);
            String rightCandidates = countVote(votes, mid + 1, end);

            if (leftCandidates.equals(rightCandidates)) {
                return leftCandidates;
            } else {
                int leftCount = countVotesHelper(votes, leftCandidates, start, end);
                int rightCount = countVotesHelper(votes, rightCandidates, start, end);

                if (leftCount > rightCount) {
                    return leftCandidates;
                } else if (rightCount > leftCount) {
                    return rightCandidates;
                } else {
                    return "n";
                }
            }
        }
    }

    public static int countVotesHelper(String[] vote, String candidate, int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (vote[i].equals(candidate)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of votes:");
        int numVotes = sc.nextInt();
        String[] votes = new String[numVotes];

        for (int i = 0; i < votes.length; i++) {
            System.out.println("Vote " + (i + 1) + ": ");
            votes[i] = sc.next();
        }

        String highestCandidate = countVote(votes, 0, votes.length - 1);
        if (highestCandidate.equals("n")) {
            System.out.println("Candidates have same votes");
        } else {
            System.out.println("The candidate with highest vote is " + highestCandidate);
        }

        // Calculate average
        int totalVotes = votes.length;
        int countHighestCandidate = countVotesHelper(votes, highestCandidate, 0, votes.length - 1);
        double average = (double) countHighestCandidate / totalVotes;
        System.out.println("Average number of votes for the highest candidate: " + average);
    }
}
