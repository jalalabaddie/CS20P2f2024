package SkillBuilders;

public class TestCircle1 {

	

		public static void main(String[] args) {
			
			CirclePart1 spot = new CirclePart1();
			
			spot.setRadius(6);
			
			System.out.println("Circle radius: " + spot.area());
			
			System.out.println("Circle circumference: " + spot.circumference());
		}

	}

