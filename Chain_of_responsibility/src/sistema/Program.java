package sistema;

public class Program {
	
    public static void main(String[] args) {
        Approver diego = new Clerk();
        Approver lucas = new Supervisor();
        Approver cesar = new AssistantManager();
        Approver jones = new Manager();

        // Define a cadeia de sucessão
        diego.setSuccessor(lucas);
        lucas.setSuccessor(cesar);
        cesar.setSuccessor(jones);

        // Gera e processa solicitações de empréstimo
        Loan loan = new Loan();
        loan.setNumber(2034);
        loan.setAmount(15000);
        loan.setPurpose("Car Loan");
        diego.processRequest(loan);

        loan = new Loan();
        loan.setNumber(2035);
        loan.setAmount(43000);
        loan.setPurpose("Motorcycle Loan");
        diego.processRequest(loan);

        loan = new Loan();
        loan.setNumber(2036);
        loan.setAmount(45000);
        loan.setPurpose("Home Renovation Loan");
        diego.processRequest(loan);

        loan = new Loan();
        loan.setNumber(2037);
        loan.setAmount(90000);
        loan.setPurpose("Apartment Loan");
        diego.processRequest(loan);
    }
}

