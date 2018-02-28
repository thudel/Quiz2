
public class Quiz2 {
	public static void main(String[] args) {
		double TotalPrice = 0;
		double DownPay = 0;
		double LoanLen = 0;
		double InterRate = 0;
		
		double r = (InterRate / 100) /12;
		double MPay = (TotalPrice * r) / (1 - Math.pow(1+r, -LoanLen));
		double TotInter = MPay * LoanLen - DownPay;
		
		System.out.println("Monthly Payment: "+MPay);
		System.out.println("Total Interest Paid: "+TotInter);
	}
}
