package model.service;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {		
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processamentoContrato(Contract contract , Integer months) {
		double cotaBasica = contract.getTotalValue() / months;
		
		for (int i = 1; i <= months; i++) {
			Date date = addMonths(contract.getDate(), i);
			double cotaAtualizada = cotaBasica + onlinePaymentService.interest(cotaBasica,i);
			double fullquota = cotaAtualizada + onlinePaymentService.payment(cotaAtualizada);
			contract.addInstallament(new Installment(date, fullquota));
		}		
	}
	
	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
	
	

}
