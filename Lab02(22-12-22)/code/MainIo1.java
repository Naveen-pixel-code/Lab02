/*write an inner class which is private for baking application only when the person is authorized he can create 
instance for inner class and add interest to the person.*/

import java.util.Scanner;
class BankingApplication{
	double bal = 54000.0;
	public void calInterest(double roi){
		String pswd;
		System.out.println("Input the password : ");
		Scanner sc = new Scanner(System.in);
		pswd = sc.nextLine();
		if(pswd.equals("anudip")){
			Inner1 in = new Inner1();
			in.updateInterest(roi);
		}else{
			System.out.println("UnAuthorized entry");
		}
	}
	private class Inner1{
		public void updateInterest(double roi){
			bal+=bal*(roi/100);
			System.out.println("Balance after adding "+roi+" is "+bal);
		}
	}
}
class MainIO1{
	public static void main(String... args){
		BankingApplication out = new BankingApplication();
		out.calInterest(25);
	}
}