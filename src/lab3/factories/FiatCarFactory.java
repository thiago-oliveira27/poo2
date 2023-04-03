package lab3.factories;

import lab3.car.Car;
import lab3.car.FiatCar;

public class FiatCarFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new FiatCar();
	}


}