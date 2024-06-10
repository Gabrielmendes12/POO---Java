package sistema;

public class Clerk extends Approver {
    @Override
    public void loanHandler(Loan loan) {
        if (loan.getAmount() < 20000) {
            System.out.println(this.getClass().getSimpleName() + " approved request# " + loan.getNumber());
            System.out.println(loan.toDictionary()+"\n");
        } else if (getSuccessor() != null) {
        	System.out.println(this.getClass().getSimpleName() + " is not allowed to approve request# " + loan.getNumber());
            getSuccessor().loanHandler(loan);
        }
    }
}