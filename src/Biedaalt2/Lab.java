package Biedaalt2;

import java.io.*;
import java.util.*;

import utilities.ChangeArrayLength;
public class Lab<T> {

	int[] element;
	int size;
	protected Node<T> first=null;
	protected Node<T> last=null;
    ArrayList<T> A = new ArrayList<>();
    public void ArrayLinearList(int initialCapacity)
    {
       if (initialCapacity < 1)
          throw new IllegalArgumentException
                ("initialCapacity must be >= 1");
       // size has the default initial value of 0
       element = new int [initialCapacity];
    }
    public boolean isEmpty()
    {return size == 0;}
    
    public int size() {
		ArrayList<T> list = A;
		return list.size();
	}
    void checkIndex(int index)
    {
       if (index < 0 || index >= size)
          throw new IndexOutOfBoundsException
                ("index = " + index + "  size = " + size);
    }
    public int indexOf(int theElement)
    {
       
       for (int i = 0; i < size; i++)
          if (element[i]==(theElement))
             return i;
    
       // theElement not found
       return -1;
    }
    public int remove(int index)
    {
       checkIndex(index);
    
       // valid index, shift elements with higher index
       int removedElement = element[index];
       for (int i = index + 1; i < size; i++)
          element[i-1] = element[i];
    
       element[--size] = 0;   
       return removedElement;
    }
    public void add(int index, int theElement)
    {
       if (index < 0 || index > size)
          // invalid list position
          throw new IndexOutOfBoundsException
                ("index = " + index + "  size = " + size);
    
       // valid index, make sure we have space
       if (size == element.length)
          // no space, double capacity
          element = ChangeArrayLength.changeLength1D(element, 2 * size);
    
       // shift elements right one position
       for (int i = size - 1; i >= index; i--)
          element[i + 1] = element[i];
    
       element[index] = theElement;
    
       size++;
    }
    public void sum() {
		int b = 0;
		for(int  i = 0; i< A.size(); i++)
		b = b + (int)A.get(i);
		System.out.println("sum: " + b);
	}
    public int max() {
		int a;
		a = (int) A.get(0);
		for(int i=1; i<A.size(); i++)
			if((int)a<(int) A.get(i)) {
				a = (int) A.get(i);
			}
		System.out.println("max: " + a);
		return a;
	}
	public  void min() {
		Object a = new Object();
			a = A.get(0);
		for(int i = 1; i < A.size(); i++) {
			if( (int) a > (int) A.get(i)) {
				a = A.get(i);
			}
		}
		System.out.println("min: " + a);	
	}
	public  double average() {
		double c = 0;
		int b = 0;
		for(int i = 0; i < A.size(); i++)
			b = b + (int)A.get(i);
		c = (double) (1.0 * b / A.size());
		return c;
	}
	void adder(T X)
    {
        if (this.isEmpty()) {
            
            A.add(X);
        
       
            }else
                A.add(X);
        }
    
	
	public  void removeOdd() {
		int k=0;
		for(int i = 0;  i <A.size(); i++) {
			if((int)A.get(i) % 2 == 1) {
				k=k+(int)A.get(i);
				A.remove(i);
			}
		}
		System.out.println("Sondgoi toonuudiin niilber:"+k);
		System.out.println("Tegsh toonuud: " + A);
	}
	public String toString()
	{
		if (this.isEmpty()) {
			return ""+A;
			
		}
		String Ans = "";
		for (int i = 0; i < size(); i++) {
			Ans += String.valueOf(A.get(i)) + "<-";
			
		}

		Ans += String.valueOf(A.get(size()));
       
		return Ans;
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
	    	Lab<Integer> list = new Lab<>();
			 
	    	        list.adder(3);
					list.adder(9);	 
					list.adder(8);
			System.out.println(list);
			 System.out.println("Ta songono uu");
			 System.out.println("1. size\n 2. max\n3. add\n4. min\n5. average\n6. view\n7. sum\n8. remove\n");
			 int output = sc.nextInt();
			 
			try {
				while(output != 0) {
					int index;
					 
					 switch(output) {
					 case 1:
						 System.out.println("Size"+" "+list.size());
						 break;
					 case 2:
						 list.max();
						 break;
					 case 3:
						 System.out.println("та ямар оруулах вэ?");
						 int a = sc.nextInt();
	
						 list.adder(a);
						 break;
					 case 4:
						 list.min();
						 break;
					 case 5:
						 System.out.println(list.average()); 
						 break;
					 case 6:
						
						 System.out.println(list.toString()); 
						 
						 break;
					 case 7:
						list.sum();
						 break;
					 case 8:
						list.removeOdd();
						 break;
					 case 9: 
						 System.out.println("сонголтууд:\n" + "1. size\\n 2. max\\n3. add\\n4. min\\n5. average\\n6. view\\n7. sum\\n8. remove\\n");
						 System.out.println("\n таны сонголт: !!");
						 System.out.println("\n таны сонголт: !gg");
					 default:
					 }
					 System.out.println("сонголтуудыг хархаар бол 9-ийг өгнө үү?");
					 System.out.println("программыг дуусгах бол 0-ийг өгнө үү?");
	                 output = sc.nextInt();
				}
	            System.out.println("System ends:");
	            sc.close();
			}catch(Exception e) {
	            System.out.println("input aldaa garlaa"+e);
	            main(args);
	        }
			  
	    
		}
		}

	

