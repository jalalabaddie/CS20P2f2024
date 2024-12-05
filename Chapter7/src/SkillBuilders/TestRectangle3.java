package SkillBuilders;

public class TestRectangle3 {

	
	
	public static void main(String[] args) {
		
		
	RectanglePart3 box = new RectanglePart3();
	
		RectanglePart3 box2 = new RectanglePart3(5, 7);
		
		
	box.setLength(8);
		
		box.setWidth(9);
	
		
	System.out.println("box length is " + box.getLength());
		
		System.out.println("box width is " + box.getWidth());
	
	System.out.println("box2 length is " + box2.getLength());
	
		System.out.println("box2 width is " + box2.getWidth());

	System.out.println("box area is " + box.area());
		
		System.out.println("box perimeter is " + box.perimeter());
	
	System.out.println("box2 area is " + box2.area());
	
		System.out.println("box2 perimeter is " + box2.perimeter());
		
		RectanglePart3.displayAreaFormula();
		
	if (box.equals(box2)) {
			
			System.out.println("Objects are equal.");
			
		} else {
			
				 System.out.println("Objects are not equal.");
			 }
	
		System.out.println(box);
	
	System.out.println(box2);
	}

}
