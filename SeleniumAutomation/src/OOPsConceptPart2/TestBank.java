package OOPsConceptPart2;

import org.testng.annotations.Test;

public class TestBank {
	@Test
	public static void main(String[] args) {
		ValleyBank vb=new ValleyBank();
		vb.acctBal();
		vb.acctDetails();
		vb.custDetails();
		System.out.println(USBank.minBal);
		System.out.println(USBank.fdicLimit);
		vb.creditCard();
		vb.debitCard();
		vb.onlineTransaction();
	}

}
