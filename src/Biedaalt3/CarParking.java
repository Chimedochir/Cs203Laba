package Biedaalt3;


import dataStructures.ArrayStack;
import dataStructures.ArrayLinearList;
import java.io.*;
import java.util.*;

public class CarParking {
	
	ArrayStack parking = new ArrayStack(10);
	ArrayStack Move = new ArrayStack();
	int hemjee = parking.top + 1;
	
	// car output
		public void output(Car c) {

			int i = 0;
			boolean isExist = false;
			while(!parking.empty()) {
				
				Move.push((Car)parking.peek());
				String car_dugaar = ((Car)parking.pop()).dugaar;
				
				if(c.dugaar.equals(car_dugaar)) {
					hemjee--;
					parking.remove(c);
					System.out.println("Departure " + c.dugaar + " -> " + i + " cars moved out.\n");
					isExist = true;
					break;
				}
				i++;
			}
			if(!isExist) {
				System.out.println("D " + c.dugaar + " -> This car not in the garage.\n");
			}
			while(!Move.empty()) {
				parking.push(Move.pop());
			}
		}
	// car input
	public void input(Car c) {
		if(hemjee == 10) {
			System.out.println("Garage is full, this car is can not entry");
		} else {
			parking.push(c);
			hemjee++;
			System.out.println("Arrival " + c.dugaar + " -> There is room.");
		}
	}	
	// processing
	public void process(Car car) {
		if(car.Status.equals("D")) {
			output(car);
		} else if(car.Status.equals("A")) {
			input(car);
		}
	}
	
	
	public String toString() {
		String s = "";

		return s;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayLinearList linearList = new ArrayLinearList();
		
		CarParking parking = new CarParking();
		
		try {
			String line = null;
			String values[];
			
			File fileName = new File("C:\\Users\\97688\\eclipse-workspace\\Cs203Laba\\src\\Biedaalt3\\cars.txt");
			Scanner scan = new Scanner(fileName);
			
			while(scan.hasNextLine()) {
				line = scan.nextLine();
				values = line.split(" ");
				linearList.add(linearList.size(), (new Car(values[0], values[1])));
			}
			
			scan.close();
		}
		catch(FileNotFoundException e){
			System.out.println("File oldsongui!");
		}
		
		for(int i = 0; i < linearList.size(); i++) {
			parking.process((Car)linearList.get(i));
			
		}

	}
}

