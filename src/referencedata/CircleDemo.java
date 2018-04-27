package referencedata;

public class CircleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleDemo circleDemo = new CircleDemo();
		Circle myCircle = new Circle(1,2);
		System.out.println(myCircle.toString());
		circleDemo.moveCircle(myCircle, 2, 3);
		System.out.println(myCircle.toString());
	}
	
	public void moveCircle(Circle circle, int deltaX, int deltaY) {
		System.out.println(circle.toString());
	    // code to move origin of circle to x+deltaX, y+deltaY
	    circle.setX(circle.getX() + deltaX);
	    circle.setY(circle.getY() + deltaY);
	    System.out.println(circle.toString());    
	    // code to assign a new reference to circle
	    circle = new Circle(0, 0);
	    System.out.println(circle.toString());
	}

}
