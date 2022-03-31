package Biedaalt2;


import java.util.Collections;
import java.util.Scanner;

public class BiList<G> extends MyList<G> {
	 static BiList ray=new BiList();
	public void sum() {
		
		int b = 0;
		for(int  i = 0; i< ray.size(); i++)
		b = b + (int)ray.get(i);
		System.out.println("sum: " + b);
	}
	public int max() {
		int a;
		a = ray.get(0);
		for(int i=1; i<ray.size(); i++)
			if((int)a<(int) ray.get(i)) {
				a = ray.get(i);
			}
		System.out.println("max: " + a);
		return a;
	}
	public  void min() {
		Object a = new Object();
			a = ray.get(0);
		for(int i = 1; i < ray.size(); i++) {
			if( (int) a > (int) ray.get(i)) {
				a = ray.get(i);
			}
		}
		System.out.println("min: " + a);	
	}
	public  double average() {
		double c = 0;
		int b = 0;
		for(int i = 0; i < ray.size(); i++)
			b = b + (int)ray.get(i);
		c = (double) (1.0 * b / ray.size());
		return c;
	}
	public  void removeOdd() {
		int k=0;
		for(int i = 0;  i <ray.size(); i++) {
			if(ray.get(i) % 2 == 1) {
				k=k+ray.get(i);
				ray.remove(i);
			}
		}
		System.out.println("Sondgoi toonuudiin niilber:"+k);
		System.out.println("Tegsh toonuud: " + ray);
	}
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyList my=new MyList();
		
		System.out.println("Та хэдэн тоо оруулах вэ?");
		 int input = sc.nextInt();
		 if(input!=0) {
				System.out.println("та тоогоо оруулна уу");
				for(int i=0;i<input;i++) {
					int l=-1;
					 ray.add(l+1,sc.nextInt());
					 
				}
		 System.out.println("list is: " + ray);
		 
		 System.out.println("Та жагсаалтаас ямар тоог устгах вэ устгах тоогоо оруулна уу??");
		 System.out.println("Жагсаалтын мэдээллийг харах бол 0-ийн тоог оруулна уу??");
		 
		 int del = sc.nextInt();
		 if(del != 0) {
			 for(int i=0; i<ray.size();i++) {
				 if(ray.get(i) == del) {
					 ray.remove(i);
					 break;
				 }
			 }
		 }
		 System.out.println("last list: " + ray);
		ray.min(); 
		ray.max();
		ray.sum();
	    ray.removeOdd();
	System.out.println("Dundaj"+ray.average());
	}

	}}
