package SkillBuilders;

public class TestCircle4 {

	public static void main(String[] args) {
		
		CirclePart4 spot = new CirclePart4();
		
		CirclePart4 spot1 = new CirclePart4(3);
		
		spot.setRadius(6);
				
		System.out.println("Circle radius: " + spot.area());
		
		System.out.println("Circle circumference: " + spot.circumference());
		
		System.out.println("Circle radius: " + spot1.area());
		
		System.out.println("Circle circumference: " + spot1.circumference());
		
		CirclePart4.displayAreaFormula();
		
		if (spot.equals(spot1)) {
			
			System.out.println("Objects are equal.");
			
		} else {
			
				 System.out.println("Objects are not equal.");
			 }
		
		System.out.println(spot);
		
		System.out.println(spot1);
	}

}
	
	
	
	

