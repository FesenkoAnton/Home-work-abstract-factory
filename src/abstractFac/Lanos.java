package abstractFac;

public class Lanos implements CleanCar{
	
	@Override
	public void carWash() {
		System.out.println("Wash Lanos cost 2 dollars");
	}

	@Override
	public void cleanSalon() {
		System.out.println("Clean salon Lanos cost 2 dollars");
	}

	@Override
	public void sliceWax() {
		System.out.println("Slice wax Lanos cost 2 dollars");
	}

	@Override
	public void cleanLeather() {
		System.out.println("Clean leather Lanos cost 0 dollars");
	}

	@Override
	public void pumpWheels() {
		System.out.println("Pump wheels Lanos cost 1 dollars");
	}
}
