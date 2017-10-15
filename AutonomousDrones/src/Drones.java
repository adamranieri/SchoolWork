import java.util.Scanner;

public class Drones {

	public static void main(String[] args){
		// creates scanner named reader
		
		Scanner reader = new Scanner(System.in);
				
		// Initialize Values for drone 1
		double a1;
		double x1;
		double y1;
		// initialize values for drone 2
		double a2;
		double x2;
		double y2;
		
		// Grabbing all the data
		System.out.println("Please insert x coordinate of Drone 1:");
		x1 = reader.nextDouble();
		System.out.println("Please insert y coordinate of Drone 1:");
		y1 = reader.nextDouble();
		System.out.println("Please insert the altitude of Drone 1:");
		a1 = reader.nextDouble();		
		System.out.println("Please insert x coordinate of Drone 2:");
		x2 = reader.nextDouble();
		System.out.println("Please insert y coordinate of Drone 2:");
		y2 = reader.nextDouble();
		System.out.println("Please insert the altitude of Drone 2:");
		a2 = reader.nextDouble();
		
		//Calculates the distance between drones			
		double distance2D = Math.pow (Math.pow(x1-x2,2) + Math.pow(y1-y2,2),0.5);
		double distance3D = Math.pow (Math.pow(x1-x2,2) + Math.pow(y1-y2,2)+ Math.pow(a1-a2,2),0.5);		
						
		// determines if drones are too close, too far apart or appropriately spaced in 3d space		
			if (distance2D>=1 && distance2D<=500){
				System.out.println("The two drones are " +distance2D + " feet apart in the (x,y) coordinates. They do not need to move farther apart or closer in (x,y).");	
			}if (distance2D>500){
				System.out.println("The drones are " +distance2D + " feet apart (x,y) coordinates. They need to move closer together in (x,y).");
			}if (distance2D<1){
				System.out.println("The drones are " +distance2D + " feet apart (x,y) coordinates. They need to move farther apart in (x,y).");
			}
		
		//	determines if drones are too close, too far apart or appropriately spaced in 3d space
			if (distance3D>=1 && distance3D<=500){
				System.out.println("The two drones are " +distance3D + " feet apart in 3D space. They do not need to move farther apart or closer.");	
			}if (distance3D>500){
				System.out.println("The drones are " +distance3D + " feet apart in 3D space. They need to move closer together.");
			}if (distance3D<1){
				System.out.println("The drones are " +distance3D + " feet apart in 3D space. They need to move farther apart.");
			}
			
						
	}
}
