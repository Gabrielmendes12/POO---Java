package sistema;

public abstract class Approver {
	
	private Approver successor;  // O próximo aprovador na cadeia

    // Método abstrato que deve ser implementado pelas subclasses
    public abstract void loanHandler(Loan loan);

    // Processa a solicitação de empréstimo
    public void processRequest(Loan loan) {
        loanHandler(loan);
    }

    // Define ou obtém o próximo aprovador
    public Approver getSuccessor() {
        return successor;
    }

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }
}
