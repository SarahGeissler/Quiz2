import java.util.Scanner;
public class carPayments {
	
	private double carCost;
	private double downPayment;
	private double loanLength;
	private double interestRate;

	
	public carPayments() {
		
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter Sticker Price of Car:");
		carCost = stdin.nextDouble();
		System.out.println("Enter the Down Payment Amount:");
		downPayment = stdin.nextDouble();
		System.out.println("Enter the Length of the Loan in Months:");
		loanLength = stdin.nextDouble();
		System.out.println("Enter the Interest Rate on the Loan (decimal):");
		interestRate = stdin.nextDouble();
		stdin.close();
	}

	
			
	public double monthlyCarPayment() {
		double loanAmount = (this.carCost - this.downPayment);
		double monthlyInterest = this.interestRate/12;
		double monthlyPayment = (loanAmount*monthlyInterest) / (1-Math.pow(1+monthlyInterest, -this.loanLength));
		return Math.round(monthlyPayment* 100.0) / 100.0;
		}
	public double interestPayments() {
		double loanAmount = (this.carCost - this.downPayment);
		double interestpaid = ((monthlyCarPayment()) * this.loanLength) - loanAmount;
		return Math.round(interestpaid* 100.0) / 100.0;
	}
	
	public static void main(String[] args) {
		carPayments carPayment = new carPayments();
		System.out.println("Monthly Car Payment is: " + carPayment.monthlyCarPayment());
		System.out.println("Total Interest Payments: " + carPayment.interestPayments());

			}

	}

