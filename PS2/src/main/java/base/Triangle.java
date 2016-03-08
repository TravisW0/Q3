package base;
public class Triangle extends GeometricObject {

	/*
	 *  Three double data fields with private attributes
	 */
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	/*
	 *  no-arg constructor that creates default triangle
	 */
	public Triangle(){
		this(1.0,1.0,1.0);
	}
	
	/*
	 *  Constructor that creates a triangle with specified sides
	 */
	public Triangle(double sides1, double sides2, double sides3){
		this.side1 = sides1;
		this.side2 = sides2;
		this.side3 = sides3;
	}
	
	/*
	 *  Getting the value of each side and returning them
	 */
	public double getside1(){
		return side1;
	}
	public double getside2(){
		return side2;
	}
	public double getside3(){
		return side3;
	}
	
	/*
	 *  Calculating triangle perimeter and returning the Perimeter
	 */
	/*
	 *  Returns a string description for the triangle
	 */
	public String toString(){
		return(String.format("%d,%d,%d", side1,side2,side3));
	}

	@Override
	public double getPerimeter() {
		return (this.getside1() +
			    this.getside2() +
			    this.getside3());
	}

	@Override
	public double getArea() {
		return (Math.sqrt(.5 * this.getPerimeter() * ((.5 * this.getPerimeter()) - this.getside1()) *
			     (.5 * this.getPerimeter()) - this.getside2()) *
			     (.5 * this.getPerimeter()) - this.getside3());		
	}
}