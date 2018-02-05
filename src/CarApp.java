import java.util.ArrayList;
import java.util.Scanner;

/*
 * Author Jordan Zwart
 * 1. Ask the user how many cars they want to enter
 * 2. For each car entered, take input for the details
 * 3. Print out a table of the cars at the end
 * 
 * 
 * Lab 10
 */
public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Car> carLot = new ArrayList<Car>();
		String answer = "n";
		int number = 0;
		carLot.add(new Car("Ford", "Focus", 2018, 20000.00));
		carLot.add(new Car("Chevy", "Camero", 2018, 40000.00));
		carLot.add(new Car("Audi", "RS5", 2018, 55000.00));
		carLot.add(new UsedCar("Ford", "F-150", 2012, 25000.00, 25000.25));
		carLot.add(new UsedCar("Chevy", "Tahoe", 2010, 15000.00, 80000.00));
		carLot.add(new UsedCar("Audi", "A4", 2012, 10000.00, 75000.00));
		while (!answer.equalsIgnoreCase("y")) {


			// print out a table of the cars at the end
			System.out.println("Current Inventory: ");
			// format the array with the .toString Method
			int i = printCarList(carLot);
			System.out.println(i + 1 + ". Quit");
			// System.out.println("What car would you like?");

			number = Validator.getInt(scan, "What car would you like?", 1,
					carLot.size() + 1);
			if (number == carLot.size() + 1) {
				//System.out.println("Are you sure you want to quit? y/n");
				answer = Validator.getString(scan, "Are you sure you want to quit? y/n");
			} else {
				System.out.println(carLot.get(number - 1));

				answer = Validator.getString(scan, "Would you like to buy this car? (Enter Y/N)");

				if (!answer.equalsIgnoreCase("y")) {
					continue;
				} else {
					Car chosen = carLot.remove(number - 1);
					System.out.println(chosen);
					System.out.println();
					System.out.println("Excellent! Our finance deparment will be in touch shortly.");

					printCarList(carLot);
				}

			}// end of while

		}
		System.out.println("Goodbye");
		scan.close();
	}// end of main

	public static int printCarList(ArrayList<Car> carLot) {
		int i = 0;
		for (i = 0; i < carLot.size(); i++) {
			System.out.println(i + 1 + ". " + carLot.get(i));
		}
		return i;
	}
}// end
