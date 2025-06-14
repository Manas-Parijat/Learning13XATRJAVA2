package TERNARY_OP;

public class Ex_010__TERNARY_OP {
    public static void main(String[] args) {
        {
            // age = 12
            // Can I vote?
            // if age > 18 → Yes you can vote, else → You cannot vote
            int age = 12;
            String canIVote = age > 18 ? "Yes, you can vote" : "No, you cannot vote";
            System.out.println(canIVote);
        }
    }

}