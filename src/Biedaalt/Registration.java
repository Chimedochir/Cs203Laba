package Biedaalt;
import java.io.BufferedReader;
import dataStructures.ArrayLinearList;
import java.io.FileReader;
public class Registration  {
	ArrayLinearList studentList;
	ArrayLinearList subjectList;
	ArrayLinearList majorList;
	Student study;
  public Registration() {
	  subjectList= new ArrayLinearList();
	  majorList=new ArrayLinearList();
	 studentList=new ArrayLinearList();
  }
  public void readSubjects() {
	  try {
		  BufferedReader input = new BufferedReader (new FileReader("C:\\Users\\97688\\eclipse-workspace\\Cs203Laba\\src\\Biedaalt\\subject.txt"));
		  //String line = input.readLine(); 
		  String line;
		  Float i=(float) 0;
		  Double k=(double) 0;
		  while((line = input.readLine()) !=null) {
			  String values[] = line.split("/");
			  //Massive indexes: 0 � subject code, 1 � subject name, 2 � subject credit
			  System.out.println("Хичээл:"+ values[0] +" "+values[1]+" "+values[2]+" credit");
			  Subject s= new Subject(values[0],values[1],Double.parseDouble(values[2]));
			  subjectList.add(subjectList.size(), (Object)s);
			  i=i+Float.parseFloat(values[2]);
			  k++;
		  }
		 
		 
	  
	  input.close();
  }
		  catch (java.io.FileNotFoundException e) {
		  System.out.println("File not found: " + "C:\\Users\\97688\\eclipse-workspace\\Cs203Laba\\src\\Biedaalt\\subject.txt");
		  System.exit(1);
		  }
	  catch(java.io.IOException e) {
		  System.out.println("IOException");
	  }
 }
  public void readProfession() {
	  try {
		  BufferedReader input = new BufferedReader (new FileReader("C:\\Users\\97688\\eclipse-workspace\\Cs203Laba\\src\\Biedaalt\\Professions.txt"));
		  //String line = input.readLine(); 
		  String line;
		  while((line = input.readLine()) !=null) {
			  String values[] = line.split("/");
			  //Massive indexes: 0 � subject code, 1 � subject name
			  System.out.println("Мэргэжил:"+ values[0] +" "+values[1]);
			  Major m= new Major(values[0],values[1]);
			  majorList.add(majorList.size(), (Object)m);
	 
			  
		  }
		 
		 
	  
	  input.close();
  }
		  catch (java.io.FileNotFoundException e) {
		  System.out.println("File not found: " + "C:\\Users\\97688\\eclipse-workspace\\Cs203Laba\\src\\Biedaalt\\Professions.txt");
		  System.exit(1);
		  }
	  catch(java.io.IOException e) {
		  System.out.println("IOException");
	  }
 } 
  public void readExams() {
	  try {
		  BufferedReader input = new BufferedReader (new FileReader("C:\\Users\\97688\\eclipse-workspace\\Cs203Laba\\src\\Biedaalt\\Exams.txt"));
		  //String line = input.readLine(); 
		  String line;
		  double t=0;
		  double l=0;
		  String p="F.CS209";
		  
		  while((line = input.readLine()) !=null) {
			  String values[] = line.split("/");
			  //Massive indexes: 0 � subject code, 1 subject GPA, 2 � subject name
			  System.out.println("Шалгалтын Дүн:"+ values[0] +" "+values[1]+" "+values[2]);
			  Student k= new Student(values[0], values[1], Double.parseDouble(values[2]));
			  studentList.add(studentList.size(), (Object)k);
			  System.out.println(k);
			  if(values[1].equals(p)){
				   if(Double.parseDouble(values[2])>95) {
				  System.out.println(4);
				  t=t+4*3;
				  l++;
			  }else if(Double.parseDouble(values[2])>90) {
				  System.out.println(3.7);
				  t=t+3.7*3;l++;
			   }else if(Double.parseDouble(values[2])>85) {
					  System.out.println(3.4);
					  t=t+3.4*3;l++;
				   }else if(Double.parseDouble(values[2])>79) {
						  System.out.println(3.0);
						  t=t+3.0*3;l++;
				   }
			
				  
			  }
		  }
		  
			  System.out.println(p+" хичээлийн дундаж голч дүн:"+t/(l*3));
		  
		  input.close();
  }
		  catch (java.io.FileNotFoundException e) {
		  System.out.println("File not found: " + "C:\\Users\\97688\\eclipse-workspace\\Cs203Laba\\src\\Biedaalt\\Exams.txt");
		  System.exit(1);
		  }
	  catch(java.io.IOException e) {
		  System.out.println("IOException");
	  }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Registration reg = new Registration();
reg.readProfession();
reg.readExams();
reg.readSubjects();
	}

}
