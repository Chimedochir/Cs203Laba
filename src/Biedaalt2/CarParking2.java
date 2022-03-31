package Biedaalt2;

import java.io.BufferedReader;
import java.io.FileReader;

public class CarParking2 {
	public static Car park[]=new Car[30];
	public static Car park2[]=new Car[10];
	public static int rSize=0;
	public static int size=1;
	public static String message;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	     input();
	     process();
	     output();
	     
		}

		private static void process() {
			// TODO Auto-generated method stub
			
		}

		private static void output() {
			// TODO Auto-generated method stub
			System.out.println(park2[9].getStatus()+" "+park2[9].getNumber());
		}
		private static void input() {
			// TODO Auto-generated method stub
			 try {
				  BufferedReader input = new BufferedReader (new FileReader("C:\\Users\\97688\\eclipse-workspace\\Cs203Laba\\src\\Biedaalt2\\cars.txt"));
				  //String line = input.readLine(); 
				  String line;
				 
				  while((line = input.readLine()) !=null) {
					  String values[] = line.split(" ");
					  //Massive indexes: 0 � subject code, 1 � subject name, 2 � subject credit
					 System.out.println("Cars read:"+ values[0] +" "+values[1]);
					  Car c= new Car(values[0],values[1]);
					  addToRead(c);
					  //subjectList.add(subjectList.size(), (Object)s);
					 
				  }
				 
				 
			  
			  input.close();
		  }
			 
				  catch (java.io.FileNotFoundException e) {
				  System.out.println("File not found: " + "C:\\Users\\97688\\eclipse-workspace\\Cs203Laba\\src\\Biedaalt2\\cars.txt");
				  System.exit(1);
				  }
			  catch(java.io.IOException e) {
				  System.out.println("IOException");
			  }
		}

		private static void addToRead(Car c) {
			// TODO Auto-generated method stub
			park[rSize]=c;
			rSize++;
		}	
}
