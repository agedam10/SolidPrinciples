package example;

import java.util.Objects;

public class MeanSquaredValues {
	String dataType;
	Data data=new Data(); //tight coupling
	public MeanSquaredValues(String dataType) {
		this.dataType=dataType;
	}
	
	public void calculateValues(){
		System.out.println("these are mean squared values");
		//we are adding methods below to differentiate between dimension of the data
		//this violates open close
		if(Objects.equals(dataType, "2D")) {
			
			
			data.twoDimensionalData();
			System.out.println("These are 2D mean squared values");
		}
		else if(Objects.equals(dataType, "3D")) {
			data.threeDimensionalData();
			System.out.println("These are 3D mean squared values");
		}
	}
}
