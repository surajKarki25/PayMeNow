package com.CodeWithSuraj.PayMeNow;

import com.CodeWithSuraj.PayMeNow.Logic.PaymentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class PayMeNowApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayMeNowApplication.class, args);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter Payment Amount :");
			double amount = sc.nextDouble();

			System.out.println("Please select payment method: \n1.CreditCard \n2.PayPal\n3.BankTransfer \n4.Exit");
			int userChoice = sc.nextInt();

			String choice = "";
			if (userChoice == 1) {
				choice = "creditCard";
			} else if (userChoice == 2) {
				choice = "payPal";
			} else if (userChoice == 3) {
				choice = "bankTransfer";
			} else if (userChoice == 4) {
				System.out.println("Exiting...");
				context.close();
				break;
			} else {
				System.out.println("Invalid choice");
				continue;
			}

			PaymentService contextBean = (PaymentService) context.getBean(choice);
			contextBean.processPayment(amount);
		}
	}


}