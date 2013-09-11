public class CreditCard {
	private String cardNumber;
	private double expenses;
	public void charge(double amount) {
		expenses = expenses + amount;
	}
	public String getCardNumber(String password) {
		if (password.equals("SECRET!3*!")) {
			return cardNumber;
		}
		return "jerkface";
	}
	
	public static void main(String[] args) {
		CreditCard oAMEX = new CreditCard();
		oAMEX.cardNumber = "123456789";
		oAMEX.expenses = 999.99;
		oAMEX.charge(oAMEX.expenses);
		String sTest = oAMEX.getCardNumber("SECRET!3*!");
		System.out.println(sTest);
	}
}