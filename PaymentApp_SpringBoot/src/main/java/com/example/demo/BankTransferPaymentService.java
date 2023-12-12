package com.example.demo;

public class BankTransferPaymentService implements PaymentDetails {

	@Override
	public void paymentProcess(double amount) {
		System.out.println("Processing Bank Transfer of $"+amount);
	}

}
