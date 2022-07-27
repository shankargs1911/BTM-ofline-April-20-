package Interface_Test;

public class TextCalculator implements Centraltaxt,StateTaxt {

	@Override
	public void state() {
		System.out.println("state tax is 100 RS");
	}

	@Override
	public void central() {
		System.out.println("central tax is 500 RS");
	}

}
