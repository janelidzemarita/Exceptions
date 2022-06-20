package Figure;

public abstract class Figure implements IFigure, IFigureAnother{
	public static int count = 0;
	public Figure(String helloText) {
		System.out.println(helloText);
		count ++;
		CheckForLimit(count);

		
	}
	
	
	public static void CheckForLimit(int count) {  //Runtime and Limit Exceptions

		try {
			if(Figure.count > 10) {
				throw new LimitException();
			}
			
		}catch(LimitException e1) {
			System.out.println("Too many figures catch in constructor ");
			throw new RuntimeException(e1);
			}
	}
	
	
	public static final void sayHello() {
		System.out.println("Hello there User");
	}
	
	abstract double getPerimeter ();
	
	abstract double getArea() ;
	
	public void printFigureAreaAndLength() {
		System.out.println("Perimeter: "+ getPerimeter () + " Area: " + getArea());
	}
	
	abstract public void printFigureData(); 
	
	abstract public void sayHelloToFigure() ;
	abstract public boolean validateFigure();
	abstract public void validete() throws ValidateException;
	
}