


import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import dataStructures.ArrayLinearList;
import dataStructures.LinearList;

public class MyArrayLinearList extends ArrayLinearList{
	
	static ArrayList<Integer> array = new ArrayList<Integer>();
	static Scanner sc = new Scanner(System.in);
	
	public MyArrayLinearList() {
		
	}
	
	public static void max() {
		Object a = new Object();
		a = array.get(0);
		for(int i=1; i<array.size(); i++)
			if((int)a<(int) array.get(i)) {
				a = array.get(i);
			}
		System.out.println("max: " + a);
	}
	
	public static void min() {
		Object a = new Object();
			a = array.get(0);
		for(int i = 1; i < array.size(); i++) {
			if( (int) a > (int) array.get(i)) {
				a = array.get(i);
			}
		}
		System.out.println("min: " + a);	
	}
	
	
	public static void sum() {
		int b = 0;
		for(int  i = 0; i< array.size(); i++)
		b = b + (int)array.get(i);
		System.out.println("sum: " + b);
	}
	
	
	public static double average() {
		double c = 0;
		int b = 0;
		for(int i = 0; i < array.size(); i++)
			b = b + (int)array.get(i);
		c = (double) (1.0 * b / array.size());
		return c;
	}
	
	public static void removeOdd() {
		int k=0;
		for(int i = 0;  i <array.size(); i++) {
			if(array.get(i) % 2 == 1) {
				k=k+array.get(i);
				array.remove(i);
			}
		}
		System.out.println("Sondgoi toonuudiin niilber:"+k);
		System.out.println("sondgoi toonuud: " + array);
	}

	public static void sort() {
		for(int i = 0; i < array.size(); i++) {
		Collections.sort(array);
		}
		System.out.println(array);
	}
	 public static void main(String [] args)
	   {
		 System.out.println("Та хэдэн тоо оруулах вэ?");
		 int input = sc.nextInt();
		
		 if(input!=0) {
				System.out.println("та тоогоо оруулна уу");
				for(int i=0;i<input;i++) {
					 array.add(sc.nextInt());
					 
				}
		 System.out.println("list is: " + array);
		 
		 System.out.println("Та жагсаалтаас ямар тоог устгах вэ устгах тоогоо оруулна уу??");
		 System.out.println("Жагсаалтын мэдээллийг харах бол 0-ийн тоог оруулна уу??");
		 
		 int del = sc.nextInt();
		 if(del != 0) {
			 for(int i=0; i<array.size();i++) {
				 if(array.get(i) == del) {
					 array.remove(i);
					 break;
				 }
			 }
		 }
		 System.out.println("last list: " + array);
		 
		 max();
		 min();
		 sum();
		 System.out.println("average is: " + average());
		 sort();
		 removeOdd();
	   }
	   }
}