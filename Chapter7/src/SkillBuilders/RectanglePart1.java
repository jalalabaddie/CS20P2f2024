package SkillBuilders;

public class RectanglePart1 {

	private double length, width;

	public RectanglePart1(){
	
		length = 1;
	
		width = 1;
}

	public RectanglePart1(double l, double w){
	
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
}
