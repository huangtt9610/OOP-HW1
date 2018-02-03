import java.util.*;
import java.text.DecimalFormat;
/**
 * 
 * @author huangtt
 *
 */
public class CircleArea {
	
	public static double calArea(double r) {
		return Math.PI*Math.pow(r,2);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); 
		double radius;
		DecimalFormat d=new DecimalFormat("#.##"); // I got info from https://docs.oracle.com/javase/7/docs/api/java/text/DecimalFormat.html
		System.out.print("Enter radius: ");
		
		while(s.hasNext()) {
				
			if(s.hasNextDouble()) {
				
				radius = s.nextDouble();
				if(radius >= 0.0) {
					System.out.println("The circle area with radius " + radius+" is "+d.format(calArea(radius)));
					System.out.print("Enter radius: ");
				}
				
				else  {	
					System.out.println(radius+" is a invalid value, enter a new radius: ");	
				}
			}
					
			else {	
				System.out.println('"'+s.next()+'"'+" is a invalid value, enter a new radius: ");	
				
			}	
		}
		s.close();
		System.exit(0);
	}
}
