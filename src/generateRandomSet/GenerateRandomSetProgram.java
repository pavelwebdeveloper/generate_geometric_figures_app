/**
 * 
 */
package generateRandomSet;

/** Import ArrayList class from the java.util package */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


/**
 * @author Павел программа для генерации случайного набора геометрических фигур из 4 разных геометрических фигур
 *
 */
public class GenerateRandomSetProgram extends JPanel {

	/**
	 * @param args
	 */
	public void paint(Graphics g) {
	
	Object[] objects = {new Square(), new Triangle(), new Circle(), new Trapezoid()};
	
	// Create a list to store geometric objects
		ArrayList<GeometricObject> geometricObjectsForRandomList = new ArrayList<GeometricObject>();
		
		
		geometricObjectsForRandomList.add(new Square());
		geometricObjectsForRandomList.add(new Triangle());
		geometricObjectsForRandomList.add(new Circle());
		geometricObjectsForRandomList.add(new Trapezoid());
		
		Collections.shuffle(geometricObjectsForRandomList);
	
	Graphics2D g2 = (Graphics2D) g;
	super.paintComponent( g ); // call superclass's paintComponent
	   //custom color
	//custom color
	   Color c1 = new Color(0, 0, 0);
	   Color c2 = new Color(255, 255, 0);
	   Color c3 = new Color(0, 0, 139);
	   Color c4 = new Color(255, 0, 0);
	   Color c5 = new Color(0, 128, 0);
	
	   /*
	List<Object> objList = Arrays.asList(objects);

	Collections.shuffle(objList);

	objList.toArray(objects);
	*/
	
	// Create a list to store geometric objects
	ArrayList<GeometricObject> geometricObjects = new ArrayList<GeometricObject>();
	
	
	geometricObjects.add(new Square());
	geometricObjects.add(new Triangle());
	geometricObjects.add(new Circle());
	geometricObjects.add(new Trapezoid());
	
	
	// generating random number
			int randomNum = (int)(Math.random() * 4 + 1);  // 1 to 4
			
			String random = String.valueOf(randomNum);
			
			
			if (randomNum == 1) {
				g.drawString("Сгенерирован случайный набор из " + random + " фигуры: ", 10, 30);
			} else {
		    g.drawString("Сгенерирован случайный набор из " + random + " фигур: ", 10, 30);
			}
		    String object = "";
		    
		    int y = 40;
		    String objectToDraw = "";
	for (int i = 0; i < randomNum; i++) {
		g.drawString(" ", 10, y);
		y = y + 30;
		object = String.valueOf(geometricObjectsForRandomList.get(i));
		g.drawString(object, 10, y);
		y = y + 20;
		
		
		objectToDraw = geometricObjectsForRandomList.get(i).drawObject();
		
		switch (objectToDraw) {
		  case "square":
			//draw rectangle
			  	int side = (int)geometricObjectsForRandomList.get(i).getParameters()[0] * 10;
			  	g2.setColor(c2);
			   g2.fillRect(10, y, side, side);
			   g2.setColor(c1);
		    break;
		  case "trapezoid":
			  g2.setColor(c4);
			// draw polygon with Polygon object 
			  int topSide = (int)geometricObjectsForRandomList.get(i).getParameters()[0] * 10;
			  int bottomSide = (int)geometricObjectsForRandomList.get(i).getParameters()[1] * 10;
			  int height = (int)geometricObjectsForRandomList.get(i).getParameters()[2] * 10;
			  int xValues[] = { 20, topSide, bottomSide, 10 }; 
			  int yValues[] = { y, y, y+height, y+height }; 
			  Polygon polygon1 = new Polygon( xValues, yValues, 4 );
			  g2.fillPolygon( polygon1 ); 
			  g2.setColor(c1);
		    break;
		  case "circle":
			// draw circle
			  int diameter = (int)geometricObjectsForRandomList.get(i).getParameters()[0] * 10 * 2;
			  g2.setColor(c3);
			   g2.fillOval(20, y, diameter, diameter);
			   g2.setColor(c1);
		    break;
		  case "triangle":
			  int side2 = (int)geometricObjectsForRandomList.get(i).getParameters()[1] * 10 + 10;
			  int side3 = (int)geometricObjectsForRandomList.get(i).getParameters()[2] * 10 + 10;
			  g2.setColor(c5);
			  int a[]={10,side2,side3};
			  int b[]={y,y,y-10};
			  g.fillPolygon(a,b,3);
			  g2.setColor(c1);
		    break;
		}
	
		g.drawString(" ", 10, y);
		y = y + 20;
		}
	
	
	
	
    
	String object2 = "";
    int y2 = 400;
    
	g.drawString("Весь список фигур: ", 10, 370);
	for (int i = 0; i < geometricObjects.size(); i++) {
		g.drawString(" ", 10, y2);
		y2 = y2 + 20;
	      object2 = String.valueOf(geometricObjects.get(i));
			g.drawString(object2, 10, y2);
			y2 = y2 + 20;
			objectToDraw = geometricObjects.get(i).drawObject();
			switch (objectToDraw) {
			  case "square":
				//draw rectangle
				  	int side = (int)geometricObjects.get(i).getParameters()[0] * 10;
				  	g2.setColor(c2);
				   g2.fillRect(10, y2, side, side);
				   g2.setColor(c1);
			    break;
			  case "trapezoid":
				  g2.setColor(c4);
				// draw polygon with Polygon object 
				  int topSide = (int)geometricObjects.get(i).getParameters()[0] * 10;
				  int bottomSide = (int)geometricObjects.get(i).getParameters()[1] * 10;
				  int height = (int)geometricObjects.get(i).getParameters()[2] * 10;
				  int xValues[] = { 20, topSide, bottomSide, 10 }; 
				  int yValues[] = { y2, y2, y2+height, y2+height }; 
				  Polygon polygon1 = new Polygon( xValues, yValues, 4 );
				  g2.fillPolygon( polygon1 ); 
				  g2.setColor(c1);
			    break;
			  case "circle":
				// draw circle
				  int diameter = (int)geometricObjects.get(i).getParameters()[0] * 10 * 2;
				  g2.setColor(c3);
				   g2.fillOval(20, y2, diameter, diameter);
				   g2.setColor(c1);
			    break;
			  case "triangle":
				  int side2 = (int)geometricObjects.get(i).getParameters()[1] * 10 + 10;
				  int side3 = (int)geometricObjects.get(i).getParameters()[2] * 10 + 10;
				  g2.setColor(c5);
				  int a[]={10,side2,side3};
				  int b[]={y2,y2,y2-10};
				  g.fillPolygon(a,b,3);
				  g2.setColor(c1);
			    break;
			}
			g.drawString(" ", 10, y2);
			y2 = y2 + 20;
	    }
	
	/**
	 * @param args
	 */	
}
	
	
	
	
	
	





	



	







	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//let's setup the frame so we can keep adding to our program
		   JFrame f = new JFrame("Программа для генерации случайного набора геометрических фигур");
		// add a button
					JButton b = new JButton("Сгенерировать новый набор");
					 
					b.setBounds(600, 150, 250, 30);
					b.addActionListener(new ActionListener(){  
						public void actionPerformed(ActionEvent e){  
							f.setSize(901, 700);
							f.setSize(900, 700);
						        }  
						    });  
						    f.add(b);
		   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   f.getContentPane().add(new GenerateRandomSetProgram());
		   f.setSize(900, 700);
		   f.setLocation(150, 25);
		   f.setVisible(true);
		
		

			
			

	}

}
