package SkillBuilders;

public class CirclePart1 {

	private double radius;
	
	private static final double PI = 3.14;
	
		public CirclePart1() { 
			radius = 1;
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
			return radius; 
		}
		
}

