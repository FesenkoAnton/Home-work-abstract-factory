package abstractFac;

public class FordFac implements Factory{

	@Override
	public CleanCar getCleanCar() {
		return new FordFocus();
	}

}
