
public class SimpleCircle {
	
	double radius;// member variable - defines the state of the object
	
	
	
	public SimpleCircle(double radius){
		this.radius = radius;
		// this.radis refers to the member variable(above)- the state
		// radius refers to the parameter of this method, which got passed in
		
	}
	
	
	
	
	
	
	
	
	
	public double getArea(){
		return this.radius*radius*Math.PI;
		// radius refers to the member variable(above) - the state
	}

}
