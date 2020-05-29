/**
 * 
 */
package generateRandomSet;


/**
 * @author Павел
 *
 */
public class Triangle extends GeometricObject {
	
	// data fields
		private double side1;
		private double side2;
		private double side3;
		
		// Construct a triangle with default sides
			public Triangle() {
				this(2.0,2.0,2.828, "зелёный");
			}
		
		// Construct a triangle with specified sides
		public Triangle(double side1, double side2, double side3, String color) {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
			this.color = color;
		}
		
			
		/**Return the value of side1 */
			public double getSide1() {
				return side1;
			}
			
		/**Return the value of side2 */
			public double getSide2() {
				return side2;
			}
		
		/**Return the value of side3 */
			public double getSide3() {
				return side3;
			}
			
			/**Return the value of side3 */
			public double getHypotenuse() {
				double hypotenuse = 0;
				if(side1>side2 && side1>side3) {
					hypotenuse = side1;
				} else if (side2>side1 && side2>side3) {
					hypotenuse = side2;
				} else {
					hypotenuse = side3;
				}
				return hypotenuse;
			}
			
			/** Return parameters for this geometric oblject */
			public double[] getParameters() {
				// Create a list to store parameters
				double[] parameters = {this.side1, this.side2, this.side3};
				return parameters;
			}
			
			/**Return a drawing value for this triangle*/
			@Override
			public String drawObject() {
				//draw triangle
				return "triangle";
			}
			
		/**Return the area of this triangle*/
			@Override
		public String getArea() {
				double s = (side1 + side2 + side3) / 2;
				double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
				String a = String.format("%2.2f", area);
				return a;
			}
			
		/**Return the perimeter of this triangle*/
		public String getPerimeter() {
				double perimeter = side1 + side2 + side3;
				String p = String.format("%2.2f", perimeter);
				return p;
			}
		
		/**Return a string description for this triangle*/
			@Override
			public String toString() {
				return "\nФигура: треугольник, площадь: " + this.getArea() + " кв. ед.,  гипотенуза: " + this.getHypotenuse() + " ед.,  цвет: " + super.getColor();
			}

}
