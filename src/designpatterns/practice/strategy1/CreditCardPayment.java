package designpatterns.practice.strategy1;

import designpatterns.practice.singleton2.LogManager;

public class CreditCardPayment implements PaymentStrategy {

	private LogManager log = LogManager.getLoggerInstance();
	@Override
	public void pay(String userId, double amount) {
		log.info("credit card payment successful for amount : {}, userId: {} ", amount, userId);
	}

}
