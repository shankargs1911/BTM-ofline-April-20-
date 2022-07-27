package Interface_bank;

public class Taxcalculator implements karnataka_bank,SBI_bank{

	@Override
	public void SBIbanktax() {
		System.out.println("sbi bank tax in india -50Rs per day");
	}

	@Override
	public void karnatakabanktax() {
		System.out.println("karnataka bank tax in india -40Rs per day");
	}

	
}
