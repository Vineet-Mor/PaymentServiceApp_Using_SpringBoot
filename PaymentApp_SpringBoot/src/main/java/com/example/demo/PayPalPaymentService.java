package com.example.demo;

public class PayPalPaymentService implements PaymentDetails {

	@Override
	public void paymentProcess(double amount) {
		// TODO Auto-generated method stub

		System.out.println("Processing PayPal payment of $"+amount);
	}

}
