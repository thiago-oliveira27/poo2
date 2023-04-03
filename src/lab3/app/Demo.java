package lab3.app;

import lab3.car.ChevCar;
import lab3.car.FiatCar;
import lab3.factories.CarFactory;
import lab3.factories.ChevCarFactory;
import lab3.factories.FiatCarFactory;

public class Demo{
	
    static Application FiatApplication() {
    	
        Application app;
        CarFactory fiatfactory = new FiatCarFactory();
         
        app = new Application(fiatfactory);
        return app;
    }
    
	static Application ChevApplication() {
	    	
	        Application app;
	        CarFactory chevFactory = new ChevCarFactory();
	         
	        app = new Application(chevFactory);
	        return app;
	    }
   
}