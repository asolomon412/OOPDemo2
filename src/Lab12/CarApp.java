package Lab12;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to my CAR LOT!");
		System.out.println();

		ArrayList<Car> cars = new ArrayList<>();

		int numCars = Validator.getInt(scan, "How many cars would you like to enter?");

		for (int i = 0; i < numCars; i++) {

			String make = Validator.getString(scan, "Make: ");
			String model = Validator.getString(scan, "Model: ");
			int year = Validator.getInt(scan, "Year: ");
			double price = Validator.getDouble(scan, "Price: ");
			Car c = new Car(make, model, year, price);
			cars.add(c);
		}
		
		for(Car car : cars) {
			System.out.println(car);
		}
	}

}
