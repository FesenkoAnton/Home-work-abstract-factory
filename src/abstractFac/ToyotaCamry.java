package abstractFac;

public class ToyotaCamry implements CleanCar {

	@Override
	public void carWash() {
		System.out.println("Wash Toyota Camry cost 5 dollars");
	}

	@Override
	public void cleanSalon() {
		System.out.println("Clean salon Toyota Camry cost 5 dollars");
	}

	@Override
	public void sliceWax() {
		System.out.println("Slice wax Toyota Camry cost 3 dollars");
	}

	@Override
	public void cleanLeather() {
		System.out.println("Clean leather Toyota Camry cost 4 dollars");
	}

	@Override
	public void pumpWheels() {
		System.out.println("Pump wheels Toyota Camry cost 1 dollars");
	}
}
