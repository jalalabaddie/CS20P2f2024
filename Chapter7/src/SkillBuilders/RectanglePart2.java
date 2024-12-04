package SkillBuilders;

public class RectanglePart2 {
	
	private double length, width;
	
	
	public RectanglePart2(){
	
		length = 1;
	
		width = 1;
	}
	

	public RectanglePart2(double l, double w){

		
		length = l;
	
		width = w;
	}
	
	
	public double getLength() {
	
		return(length);
	}
	
	
	public double getWidth() {
	
		return(width);
	}
	
	
	public void setLength(double l) {
		
		length = l;
	}
	
	
	public void setWidth(double w) {
		
		width = w;
	}
	
	
	public double area() {
		
		return(length * width);
	}
	
	
	public double perimeter() {
		
		return(2 * (length + width));
	}
		
	public static void displayAreaFormula(){
		
			
			System.out.println("The formula for a rectangle is a = L * W");
	}
	

}

