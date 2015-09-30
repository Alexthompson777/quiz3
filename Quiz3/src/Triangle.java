
public class Triangle extends GeometricObject {
	
	//Data fields
	private double side1;
	private double side2 ;
	private double side3;
	
	//no args-constructor
	public Triangle(){
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
				
	}
	
	//Constructor with argument
	public Triangle(double newSide1, double newSide2, double newSide3){
		
		side1 = newSide1;
		side2 = newSide2;
		side3 = newSide3;
		
	}
	
	//Access methods for sides
	public double getSide1(){
		return side1;
	}
	
	public double getSide2(){
		return side2;
	}

	public double getSide3(){
		return side3;
	}
	
	//Calculates perimeter
	public double getPerimeter(){
		
		return side1+side2+side3;
		
	}
	
		
	//Calculates area using heron method
	public double getArea(){
		double p = (side1+side2+side3)/2;
		return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
	}
	
	//Returns string describing triangle
	public String toString(){
		return "This triangle has sides of length: "+side1+", "+side2+" and "+side3;
		
	}
	


	

}
