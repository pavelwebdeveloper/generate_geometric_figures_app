/**
 * 
 */
package generateRandomSet;


/**
 * @author Павел
 *
 */
public class Circle extends GeometricObject {
	
	// data fields
			private double radius;
			
			// Construct a circle with default radius
				public Circle() {
					this(1.0, "синий");
				}
			
			// Construct a circle with specified radius
			public Circle(double radius, String color) {
				this.radius = radius;
				this.color = color;
			}
			
				
			/**Return the value of radius */
				public double getRadius() {
					return radius;
				}
				
				/** Return parameters for this geometric oblject */
				public double[] getParameters() {
					// Create a list to store parameters
					double[] parameters = {this.radius};
					return parameters;
				}
				
				/**Return a drawing value for this circle*/
				@Override
				public String drawObject() {
					//draw circle
					return "circle";
				}
				
			/**Return the area of this circle*/
				@Override
			public String getArea() {
					double area = Math.PI * radius * radius;
					String a = String.format("%2.2f", area);
					return a;
				}
				
				/**Return the diameter of this circle*/
				public String getDiameter() {
						double diameter = radius * 2;
						String p = String.format("%2.2f", diameter);
						return p;
					}
				
			/**Return the circumference of this circle*/
			public String getCircumference() {
					double circumference = 2 * Math.PI * radius;
					String p = String.format("%2.2f", circumference);
					return p;
				}
			
			/**Return a string description for this triangle*/
				@Override
				public String toString() {
					return "\nФигура: круг, площадь: " + this.getArea() + " кв. ед.,  диаметр: " + this.getDiameter() + " ед.,  цвет: " + super.getColor();
				}

}
