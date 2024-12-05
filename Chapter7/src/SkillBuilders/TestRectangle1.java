package SkillBuilders;

public class TestRectangle1 {

	

		public static void main(String[] args) {
			
			RectanglePart1 box = new RectanglePart1();
			
			RectanglePart1 box2 = new RectanglePart1(5, 7);
			
			box.setLength(8);
			
			box.setWidth(9);
			
			System.out.println("box length is " + box.getLength());
		
				System.out.println("box width is " + box.getWidth());
				
			System.out.println("box2 length is " + box2.getLength());
		
				System.out.println("box2 width is " + box2.getWidth());
			
			System.out.println("box area is " + box.area());
			
					System.out.println("box perimeter is " + box.perimeter());
			
			System.out.println("Box2 area is " + box2.area());
			
				System.out.println("Box2 perimeter is " + box2.perimeter());
		}

	}





