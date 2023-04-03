package lab3.car;

import lab3.factories.CarFactory;

public class FiatCar implements Car{

	private Engine eng;

	@Override
	public void criar() {
		System.out.println("Carro Fiat criado");
	}


}