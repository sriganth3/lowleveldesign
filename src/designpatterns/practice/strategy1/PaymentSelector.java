package designpatterns.practice.strategy1;

public class PaymentSelector {
	private PaymentStrategy strategy;
	
	public PaymentSelector(PaymentStrategy strategy) {
		this.strategy = strategy;
	}
	
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
	
	public void pay(String userId, double amount) {
		System.out.println("Payment Processing Begins");
		this.strategy.pay(userId, amount);
		System.out.println("Payment Processing End");
	}
	
	

}
