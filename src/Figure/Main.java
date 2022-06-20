package Figure;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args){

		Figure a = new Rectangle(4,5);
		Figure b = new Rectangle(3,5);
		Figure c = new Rectangle(100,300);  //throws Figure.RectangleValidateException (check code Rectangle line 51-56 and getArea() method)
		Figure e = new Rectangle(0,0);
		Figure g = new Rectangle(0,0);
		
		Figure tri = new Triangle(3, 5, 1);
		Figure tri2 = new Triangle(4, 5, 6);
		Figure tri3 = new Triangle(3, 5, 1);
		Figure tri4 = new Triangle(4, 5, 6);
		Figure tri5 = new Triangle(3, 5, 1);
//		Figure tri6 = new Triangle(4, 5, 6);
		
//For task 5-6 see Figure class
		try {
			if (!e.validateFigure() || !b .validateFigure()) {
				try {
					throw new RectangleValidateException();
				}
				catch(ValidateException e4) {
					System.out.println("catch you! " + e4);
				}
				
			}
			if(!tri.validateFigure() || !tri2.validateFigure()) {
				System.out.println("Validation Finished Unsuccessfully.");
				throw new TriagleValidateException();
			}
			if(!g.validateFigure()) {
				throw new ValidateException();
			}
		}catch(RectangleValidateException e1){
			System.out.println("Wrong Figure parameters man");
		}catch(TriagleValidateException e2) {
			System.out.println("Wrong triangle parameters my friend!");
		}catch(ValidateException e3) {
			System.out.println("Parent catch!");
		}
		finally{
			System.out.println("Good Bye Figures");
		}
	}

}
