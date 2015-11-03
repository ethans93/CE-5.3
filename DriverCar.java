import java.util.Scanner;

public class DriverCar {
	
		public static void main (String [] args){
			
			Scanner keyboard = new Scanner (System.in);
			String color,make;
			int horsePower;
			double engineSize;
			
			
			
			Car car1 = new Car();
			System.out.println("Car 1");
			System.out.print("Color:");
			color = keyboard.next();
			car1.setColor(color);
			
			System.out.print("Horse power: ");
			horsePower = keyboard.nextInt();
			car1.setHorsePower(horsePower);
			
			System.out.print("Engine size (in L):");
			engineSize = keyboard.nextDouble();
			car1.setEngineSize(engineSize);
			
			System.out.print("Make:");
			make = keyboard.next();
			car1.setMake(make);
			
			
			Car car2 = new Car();
			System.out.println("\nCar 2");
			System.out.print("Color:");
			color = keyboard.next();
			car2.setColor(color);
			
			System.out.print("Horse power: ");
			horsePower = keyboard.nextInt();
			car2.setHorsePower(horsePower);
			
			System.out.print("Engine size (in L):");
			engineSize = keyboard.nextDouble();
			car2.setEngineSize(engineSize);
			
			System.out.print("Make:");
			make = keyboard.next();
			car2.setMake(make);
			
			
			Car car3 = new Car();
			System.out.println("\nCar 3");
			System.out.print("Color:");
			color = keyboard.next();
			car3.setColor(color);
			
			System.out.print("Horse power: ");
			horsePower = keyboard.nextInt();
			car3.setHorsePower(horsePower);
			
			System.out.print("Engine size (in L):");
			engineSize = keyboard.nextDouble();
			car3.setEngineSize(engineSize);
			
			System.out.print("Make:");
			make = keyboard.next();
			car3.setMake(make);
			
			System.out.println("\n"+car1+"\n"+car2+"\n"+car3);
			
			
			
}
}

