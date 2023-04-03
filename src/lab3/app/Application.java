package lab3.app;

import lab3.car.Car;
import lab3.factories.CarFactory;

public class Application {
	
    private Car car;
    
    public Application(CarFactory factory) {
    	car = factory.createCar();
    }

    public void criar() {
    	car.criar();
    }
}