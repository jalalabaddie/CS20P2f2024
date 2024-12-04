package SkillBuilders;

public class RectanglePart3 {

	
	private double length, width;
	
	public RectanglePart3(){
		
		length = 1;
		
		width = 1;
	}
	
	public RectanglePart3(double l, double w){
		
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
	
	public boolean equals(Object b) {
		
		RectanglePart3 rectangle = (RectanglePart3)b;
		
		if ((rectangle.getLength() == length) && (rectangle.getWidth() == width)) {
		
			return(true);
		
		} else {
			
			return(false);
		}
	}
	
	public String toString() {
		
		
		String rectangleString = "Rectangle has length of " + length + " and width is" + width;
		
		return(rectangleString);
	}
}

