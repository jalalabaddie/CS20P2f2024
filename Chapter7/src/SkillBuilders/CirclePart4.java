package SkillBuilders;

public class CirclePart4 {
	
	private double radius;
	
	private static final double PI = 3.14;
	
		public CirclePart4() {
			
			radius = 1;
		}
		public CirclePart4(double r) {
			radius = r;
		}
		public void setRadius(double newRadius) { 
			
			radius = newRadius;
		}
		
		public double area(){ 
			
			
			return(radius * radius * PI);
		}
		
		public double getRadius() { 
			 
			return(radius);
		}
		
		public double circumference(){ 
			
			return(radius * 2 * PI);
		}
		
		public static void displayAreaFormula() {
			
			System.out.println("The formula for the area of a circle is a = Pi*r*r");
		}
		
	
		public boolean equals(Object c) {
			
			CirclePart4 circle = (CirclePart4)c;
			
			if (circle.getRadius() == radius) {
				return(true);
			
			} else {
				
				return(false);
			
			}
		}
		
		public String toString() {
			String circleString = "Circle has radius " + radius;
			
			return(circleString);
		}
}

