package sistema;

import java.util.HashMap;
import java.util.Map;

public class Loan {
	private double amount;  // Montante do empréstimo
    private String purpose;  // Finalidade do empréstimo
    private int number;  // Número do empréstimo

    // Getters e Setters
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public Map<String, Object> toDictionary() {
        Map<String, Object> loanData = new HashMap<>();
        loanData.put("Number", number);
        loanData.put("Amount", amount);
        loanData.put("Purpose", purpose);
        return loanData;
    }
}
