package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date vencimentoDate;
	private Double amount;
	
	public Installment() {
		
	}

	public Installment(Date vencimentoDate, Double amount) {
		this.vencimentoDate = vencimentoDate;
		this.amount = amount;
	}

	public Date getvencimentoDate() {
		return vencimentoDate;
	}

	public void setDueDate(Date dueDate) {
		this.vencimentoDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public String toString() {
		return sdf.format(vencimentoDate) + " - " + String.format("%.2f", amount);
	}
	
	

}
