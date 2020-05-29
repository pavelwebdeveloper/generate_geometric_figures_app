/**
 * 
 */
package generateRandomSet;

/**
 * @author Павел
 *
 */
public class Square extends GeometricObject {
	
	

	// Data fields
		private double side;
		
		// Construct a square with a specific side
		
		public Square() {
			this(2.0, "жёлтый");
		}
		
		// Construct a triangle with specified sides
				public Square(double side, String color) {
					this.side = side;
					this.color = color;
				}
				
		/**Return the side of this square*/
		
		public double getSide() {
			return side;
		}
		
		/** Return parameters for this geometric oblject */
		public double[] getParameters() {
			// Create a list to store parameters
			double[] parameters = {this.side};
			return parameters;
		}
		
		
		/**Return the area of this square*/
		@Override
		public String getArea() {
			double area = side * side;
			String a = String.format("%2.2f", area);
			return a;
		}
		
		/**Return the perimeter of this square*/
		
		public String getPerimeter() {
			double perimeter = side * 4;
			String p = String.format("%2.2f", perimeter);
			return p;
		}
		
		
		/**Return a drawing value for this square*/
		@Override
		public String drawObject() {
			//draw rectangle
			
			return "square";
			
			
		}
		
		/**Return a string description for this square*/
		@Override
		public String toString() {
			return "\nФигура: квадрат, площадь: " + this.getArea() + " кв. ед.,  длина стороны: " + this.getSide() + " ед.,  цвет: " + super.getColor();
		}
	
}
