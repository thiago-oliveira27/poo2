package lab3.factories;

import lab3.car.Car;
import lab3.car.ChevCar;

public class ChevCarFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new ChevCar();
	}


}
