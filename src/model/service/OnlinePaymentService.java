package model.service;

public interface OnlinePaymentService {
	
	Double payment(Double amount);
	Double interest(Double amount , Integer months);

}
