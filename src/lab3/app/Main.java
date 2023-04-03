package lab3.app;

import lab3.car.Car;

public class Main {
	
	public static void main(String[] args) {
        Application app = Demo.FiatApplication();
        //criando carro fiat
        app.criar();
        
        app = Demo.ChevApplication();
      //criando carro chevrolet
        app.criar();
    }
}
