package model.service;

public class PaypalService implements OnlinePaymentService{
	
	private static final double porcentagemTaxa = 0.02; 
	private static final double jurosMensais = 0.01;
	@Override
	public Double payment(Double amount) {
		// TODO Auto-generated method stub
		return amount * porcentagemTaxa;
	}
	@Override
	public Double interest(Double amount, Integer months) {
		// TODO Auto-generated method stub
		return amount * jurosMensais * months;
	}



	

}
