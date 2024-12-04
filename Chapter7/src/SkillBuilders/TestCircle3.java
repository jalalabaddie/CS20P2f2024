package SkillBuilders;

public class TestCircle3 {

	public static void main(String[] args) {
		
		CirclePart3 spot = new CirclePart3();
		
		CirclePart3 spot1 = new CirclePart3(3);
		
		spot.setRadius(6);
		
		System.out.println("Circle radius: " + spot.area());
		
		System.out.println("Circle circumference: " + spot.circumference());
		
		System.out.println("Circle radius: " + spot1.area());
		
		System.out.println("Circle circumference: " + spot1.circumference());
		
		CirclePart3.displayAreaFormula();

	}

}

