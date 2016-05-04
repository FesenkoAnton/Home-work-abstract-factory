package abstractFac;

public class ToyotaFac implements Factory {

	@Override
	public CleanCar getCleanCar() {
		return new ToyotaCamry();
	}

}
