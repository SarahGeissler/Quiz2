import org.junit.Test;

import static org.junit.Assert.assertSame;

public class carPayment_Tests {
	public enum Variables{;
		double carCost = 35000;
		double downPayment = 0;
		double interestRate = .1;
		double loanLength = 60;
		}
	
public carPayment_Tests() {}
	

@Test
public void monthlypaymentstest(){
	double carPay = new carPayments().monthlyCarPayment();
	assertSame("The monthly payment should be $743.65",743.65, carPay);	
		}

@Test
public void totalInterest_Test() {
	double carPays = new carPayments().interestPayments();
	assertSame("The total interest rate should be $9,619.00",9619, carPays);
}
}
