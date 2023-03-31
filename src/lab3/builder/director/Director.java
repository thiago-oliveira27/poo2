package lab3.builder.director;

import lab3.builder.interfac.Builder;

public class Director {

	public void constructObjOne(Builder builder) {
		builder.setAtb1("Im the object number ONE\n");
		builder.setAtb2("Im the object number ONE\n");
		builder.setAtb3("Im the object number ONE\n");
		
	}
	public void constructObjTwo(Builder builder) {
		builder.setAtb1("Im the object number TWO\n");
		builder.setAtb2("Im the object number TWO\n");
		builder.setAtb3("Im the object number TWO\n");
		
	}
	public void constructObjThree(Builder builder) {
		builder.setAtb1("Im the object number THREE\n");
		builder.setAtb2("Im the object number THREE\n");
		builder.setAtb3("Im the object number THREE\n");
		
	}
}
