package com.example.demo;

public class CreditCardPaymentService implements PaymentDetails {

	@Override
	public void paymentProcess(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Processing credit card payment of $"+amount);
	}

}
