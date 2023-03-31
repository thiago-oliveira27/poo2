package lab3.builder.buildObj;

import lab3.builder.interfac.Builder;
import lab3.builder.objProduct.ObjProduct;

public class ObjToBeBuilded implements Builder{
	private String atb1;
	private String atb2;
	private String atb3;
	
	@Override
	public void setAtb1(String atb1) {
		this.atb1 = atb1;	
	}
	@Override
	public void setAtb2(String atb2) {
		this.atb2 = atb2;	
	}
	@Override
	public void setAtb3(String atb3) {
		this.atb3 = atb3;	
	}
	
	public ObjProduct getResult() {
        return new ObjProduct(atb1, atb2, atb3);
    }
				 
}
