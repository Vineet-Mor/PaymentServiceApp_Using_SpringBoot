package com.example.demo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class PaymentAppSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter payment amount: ");
		double amount=s.nextDouble();
		System.out.println("Enter payment method: CreditCard, BankTransfer, PayPal: ");
		s.nextLine();
		String paymentType=s.nextLine();
		switch(paymentType) {
		case "CreditCard":{
			CreditCardPaymentService cc=context.getBean("creditCardPayment",CreditCardPaymentService.class);
			cc.paymentProcess(amount);
			break;
		}
		case "BankTransfer":{
			BankTransferPaymentService bt=context.getBean("bankTransferPayment",BankTransferPaymentService.class);
			bt.paymentProcess(amount);
			break;
		}
		case "PayPal":{
			PayPalPaymentService pp=context.getBean("payPalPayment",PayPalPaymentService.class);
			pp.paymentProcess(amount);
			break;
		}
		default:{
			System.out.println("Invalid Choice!");
			break;
		}
		}
		s.close();
	}

}
