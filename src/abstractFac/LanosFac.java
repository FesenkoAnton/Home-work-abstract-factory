package abstractFac;

public class LanosFac implements Factory{

	@Override
	public CleanCar getCleanCar() {
		return new Lanos();
	}

}
