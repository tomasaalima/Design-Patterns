package main;

import classes.MPayModel;
import classes.PPay;
import classes.PPayModel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MPayModel oldPayment = new MPayModel("32145879", "Andromeda da Silva", "07", "24", (short) 798, 2000.58);
		
		PPayModel payment = new PPayModel(oldPayment);
		testPPay(payment);
	}
	
	public static void testPPay(PPay pp){
		System.out.println(pp.getCardOwnerName());
		System.out.println(pp.getCustCardNo());
		System.out.println(pp.getCardExpMonthDate());
		System.out.println(pp.getCVVNo());
		System.out.println(pp.getTotalAmount());
	}

}
