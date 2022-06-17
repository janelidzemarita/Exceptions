package Figure;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws ValidateException {

		Figure a = new Rectangle(4,5);
		Figure b = new Rectangle(3,5);
		Figure c = new Rectangle(4,10);
		Figure d = new Rectangle(4,4);
		Figure e = new Rectangle(0,0);
//		Figure f = new Rectangle(4,5); // uncomment to see the LimitException 
		
		Figure tri = new Triangle(3, 5, 1);
//		tri.validete();  uncomment to see the ValidateException
		e.validete(); //throws ValidateException for rectangle

	}

}
