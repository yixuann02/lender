public class Main {
    // trying out to branch hehe
    // new try
    public static void main(String[] args) {
        LoanManager m1 = new LoanManager();
        m1.addLoan("Alice Betsy", 10, 0.1);
        m1.addLoan("Ben Chee", 20, 0.2);
        m1.addLoan("Chris Davis", 30, 0.3);
        m1.setAsPaid("Ben Chee");
        m1.listLoans();
        System.out.println("profit from m1: " + m1.calculateProfitEarned());

        LoanManager m2 = new LoanManager();
        m2.addLoan("Alice Betsy", 500, 0.05);
        m2.addLoan("Emily Hee", 25, 0.15);
        m2.setAsPaid("Alice Betsy");
        m2.listLoans();
        System.out.println("profit from m2: " + m2.calculateProfitEarned());
        // add a commit to the main branch
        // add another new try branch commit
        // trying the final branching before doing ip
        // imagine you are editing some more
        // last check on master branch
    }
}
