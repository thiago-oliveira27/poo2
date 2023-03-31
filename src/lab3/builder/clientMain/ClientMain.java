package lab3.builder.clientMain;

import lab3.builder.buildObj.ObjToBeBuilded;
import lab3.builder.director.Director;
import lab3.builder.objProduct.ObjProduct;

public class ClientMain {

	public static void main(String[] args) {
		
		Director director = new Director(); // The one who knows how to build
		ObjToBeBuilded builder = new ObjToBeBuilded(); // The one who knows what to build
		
		director.constructObjOne(builder);
		
		ObjProduct objprod = builder.getResult();
		
		System.out.println("Product built: " + objprod.getAtb1());
		
	}
	
}
