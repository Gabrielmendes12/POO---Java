package sistema;

public class Manager extends Approver {
    @Override
    public void loanHandler(Loan loan) {
        if (loan.getAmount() < 100000) {
            System.out.println(this.getClass().getSimpleName() + " approved request #" 
        + loan.getNumber());
            System.out.println(loan.toDictionary()+"\n");
        } else if (getSuccessor() != null) {
            getSuccessor().loanHandler(loan);
       
        } else {
        	System.out.println(this.getClass().getSimpleName() + " is not allowed to approve request #"
        			+ loan.getNumber());
            System.out.println("Request #" + loan.getNumber() + " requires an executive meeting!");
            System.out.println(loan.toDictionary());
        }
    }
}
