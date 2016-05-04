package abstractFac;

public class Main {
	
	static void cleanCarM(Factory f){
		CleanCar car = f.getCleanCar();
		car.carWash();
		car.cleanSalon();
		car.sliceWax();
		car.cleanLeather();
		car.pumpWheels();
	}
	
	public static void main(String[] args) {
			cleanCarM(new LanosFac());
			cleanCarM(new ToyotaFac());
			cleanCarM(new FordFac());
	}

}
