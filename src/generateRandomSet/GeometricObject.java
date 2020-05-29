/**
 * 
 */
package generateRandomSet;

/**
 * @author Павел
 * 
 *
 */
public class GeometricObject<P> {
	
	// data fields
		protected String color = "white";
		protected String area = "";
		
		
		
		/** Construct a default geometric object */
		public GeometricObject() {
			this.color = color;
			this.area = area;
		}
		
		
		/** Return color */
		public String getColor() {
			return color;
		}
		
		public String drawObject() {
			//draw rectangle
			return "geometric object";			
		}
		
		/** Return parameters for this geometric oblject */
		public double[] getParameters() {
			// Create a list to store parameters
			double[] parameters = {};
			return parameters;
		}
		
		/**Return the area of this triangle*/
		public String getArea() {
				return area;
			}
		
		/** Return a string representation of this object */
		public String toString() {
			return "\ncolor: " + color + "\narea: " + area;
			}

}
