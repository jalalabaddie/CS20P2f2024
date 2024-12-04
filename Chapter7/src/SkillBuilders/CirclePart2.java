package SkillBuilders;

public class CirclePart2 {

	
	
	private double radius;
	
	private static final double PI = 3.14;
	
		public CirclePart2() {
			radius = 1;
		
		}
		public CirclePart2(double r) {
		
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

}
	
	

