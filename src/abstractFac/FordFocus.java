package abstractFac;

public class FordFocus implements CleanCar {

	@Override
	public void carWash() {
		System.out.println("Wash Ford Focus cost 3 dollars");
	}

	@Override
	public void cleanSalon() {
		System.out.println("Clean salon Ford Focus cost 3 dollars");
	}

	@Override
	public void sliceWax() {
		System.out.println("Slice wax Ford Focus cost 2 dollars");
	}

	@Override
	public void cleanLeather() {
		System.out.println("Clean leather Ford Focus cost 3 dollars");
	}

	@Override
	public void pumpWheels() {
		System.out.println("Pump wheels Ford Focus cost 1 dollars");
	}

}
