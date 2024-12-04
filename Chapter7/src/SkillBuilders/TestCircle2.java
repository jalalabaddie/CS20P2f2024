package SkillBuilders;

public class TestCircle2 {

	public static void main(String[] args) {
		
		CirclePart2 spot = new CirclePart2();
		
		CirclePart2 spot1 = new CirclePart2(3);
		
		spot.setRadius(6);
		
		System.out.println("Circle radius: " + spot.area());
		
		System.out.println("Circle circumference: " + spot.circumference());
		
		System.out.println("Circle radius: " + spot1.area());
		
		System.out.println("Circle circumference: " + spot1.circumference());
	}

}

