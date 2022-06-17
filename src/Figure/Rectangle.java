package Figure;

import java.util.Comparator;

//Rectangle is the child of Figure

//I left the old methods(form previous assignments) as they were. ( the ones where we didn't have to change anything)
public class Rectangle extends Figure implements Comparable, Comparator{
	private static final double MAX_LENGTH ;
	private static final double MAX_HEIGHT ;
	static double counter = 0;

	static {
		MAX_LENGTH = 200;
		MAX_HEIGHT = 200;
	}
	
	private double length;
	private double height;
	/* I did not delete the setters. If I did then the constructor would look like this:
	 
	 	public Rectangle(double length) {
		if(length < MAX_LENGTH) {
			this.length = length;
		}else this.length = MAX_LENGTH;
	}
	
	public Rectangle(double length, double height) {
		if(length < MAX_LENGTH) {
			this.length = length;
		}else this.length = MAX_LENGTH;
		
		if(height < MAX_HEIGHT) {
			this.height = height;
		}else this.height = MAX_HEIGHT;
	}
	
	Constructor without parameters does not change. 
	Using the setter methods is better because I don't have to copy the same logic to multiple functions 
	(Constructors in this case)
	 */

	
	public Rectangle(double length, double height) throws LimitException{
		super("Hello User From Figure Constructor!");
		setHeight(height);
		setLength(length);
		counter ++;
		if(counter > 5) throw new LimitException("Too many objects created!");
	}
	
	public Rectangle() throws LimitException {
		this(3,4);
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		if(length < MAX_LENGTH) {
			this.length = length;
		}else this.length = MAX_LENGTH;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		if(height < MAX_HEIGHT) {
			this.height = height;
		}else this.height = MAX_HEIGHT;
		
	}
	
	@Override
	protected double getPerimeter () {
		return  this.length *2 + this.height * 2;
	}
	@Override
	protected double getArea() {
		return this.length * this.height;
	}
	
	protected static double getPerimeter (double length, double height) {
		return  length *2 + height * 2;
	}
	
	protected static double getArea(double length, double height) {
		return length * height;
	}
	@Override
	public int compareTo(Object obj) {  //Task 1, version 1.  Arrays.sort() uses it. 
		Rectangle rec = (Rectangle) obj;
		if(this == null || rec == null) { //Null check!!!
			return 404;
		}
		if(this.validateFigure() && rec.validateFigure()) {
			if(this.length == rec.length && this.height == rec.height) {
				return 0;  // Rectangles are the same
			}else if(this.getArea() == rec.getArea()) { //if the areas are the same then larger rectangle is with larger length. 
				if(this.length > rec.length)
					return 1;
				return -1; //Different rectangles but same area
			}else if(this.getArea() < rec.getArea()) {
				return -1; 
			}else
				return 1;
		}else
			return 404;
	}

	@Override  
	public int compare(Object obj1, Object obj2) {  
		Rectangle rec1 = (Rectangle) obj1;
		Rectangle rec2 = (Rectangle) obj2;
		if (rec1 == null || rec2 == null)
			return 404;  //Null check!!!!
		if(rec1.validateFigure() && rec2.validateFigure()) {
			if(rec1.length == rec2.length && rec1.height == rec2.height) {
				return 0;  // Rectangles are the same
			}else if(rec1.getArea() == rec2.getArea()) { //if the areas are the same then larger rectangle is with greater length. 
				if(rec1.length > rec2.length)
					return 1;
				return -1; //Different rectangles but same area
			}else if(rec1.getArea() < rec2.getArea()) {
				return -1;
			}else
				return 1;
		}else
			return -404;
	}


	public int compareAreas(Rectangle rec) {
		if(this == null || rec == null) { //Null check!!!
			return 404; //
		}
		if(this.getArea() == rec.getArea()) {
			return 0;
		}else if(this.getArea() > rec.getArea()) {
			return 1;
		}
		return -1;
	}
	//task 3
	public int comparePerimeter(Rectangle rec) {
		if(this == null || rec == null) { //Null check!!!
			return 404;
		}
		if(this.getPerimeter() == rec.getPerimeter()) {
			return 0;
		}else if(this.getPerimeter() > rec.getPerimeter()) {
			return -1;
		}
		return 1;
	}
	public static Rectangle getMaxAreaRectangle(Rectangle[] array ) { 
		double max = array[0].getArea();
		Rectangle result = array[0];
		for(int i = 0; i < array.length; i++) {
			if(array[i].getArea() > max) {
				max = array[i].getArea();
				result = array[i];
			}
		}
		return result; 
	}

	@Override
	public String toString() {
		return "Rectangle {length=" + length + ", height=" + height + "}";
	}

	public boolean equals(Rectangle obj1, Rectangle obj2) { //We pass two Rectangle type objects
		if (obj1 == null || obj2 == null)
			return false;
		
		//return true if their areas are equal, false otherwise;
				
		return obj1.getArea() == obj2.getArea();

	}
	public double calculateDiagonal() {
		return Math.sqrt(this.height * this.height + this.length * this.length);
	}

	@Override
	public void printFigureData() {
		System.out.println("Rectangle height: " + height + " Length: " + length);
	}

	@Override
	public void sayHelloToFigure() {
		System.out.println("Hello from Rectangle");
		
	}

	@Override
	public boolean validateFigure() {
		if(length > 0.0 && height > 0.0) {
			return true;
		}
		return false;
	}


	@Override
	public void validete() throws RectangleValidateException{
		if(!validateFigure())
			throw new RectangleValidateException("Wrong Parameters for Rectangle!");
		
	}




	
}