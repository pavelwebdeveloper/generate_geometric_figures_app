/**
 * 
 */
package generateRandomSet;

/**
 * @author Павел
 *
 */
public class Trapezoid extends GeometricObject {
	
	// data fields
			private double topSide;
			private double bottomSide;
			private double height;
			
			// Construct a trapezoid with default sides
				public Trapezoid() {
					this(6.0,8.0,3.0,"красный");
				}
			
			// Construct a trapezoid with specified sides
			public Trapezoid(double topSide, double bottomSide, double height, String color) {
				this.topSide = topSide;
				this.bottomSide = bottomSide;
				this.height = height;
				this.color = color;
			}
			
				
			/**Return the value of topSide */
				public double getTopSide() {
					return topSide;
				}
				
			/**Return the value of bottomSide */
				public double getBottomSide() {
					return bottomSide;
				}
			
			/**Return the value of side3 */
				public double getHeight() {
					return height;
				}
				
				/** Return parameters for this geometric oblject */
				public double[] getParameters() {
					// Create a list to store parameters
					double[] parameters = {this.topSide, this.bottomSide, this.height};
					return parameters;
				}
				
				/**Return a drawing value for this trapezoid*/
				@Override
				public String drawObject() {
					//draw trapezoid
					return "trapezoid";
				}
				
				
			/**Return the area of this trapezoid*/
				@Override
			public String getArea() {
					double area = (topSide + bottomSide)/2*height;
					String a = String.format("%2.2f", area);
					return a;
				}
				
			
			/**Return a string description for this trapezoid*/
				@Override
				public String toString() {
					return "\nФигура: трапеция, площадь: " + this.getArea() + " кв. ед.,  высота: " + this.getHeight() + " ед.,  цвет: " + super.getColor();
				}


}
