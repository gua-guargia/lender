public class Loan {
    private String borrower;
    private int amount;
    private boolean isPaid;
    private double interestRate;

    //right click, generate constructor, select the variables
    public Loan(String borrower, int amount, double interestRate) {
        this.borrower = borrower;
        this.amount = amount;
        this.interestRate = interestRate;
        this.isPaid = false;
    }

    public String getBorrower() {
        return borrower;
    }

    public void setAsPaid() {
        this.isPaid = true;
    }
}
