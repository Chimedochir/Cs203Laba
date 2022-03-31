



import java.util.*;

import dataStructures.DerivedArrayStack;

public class MyStack extends DerivedArrayStack {
	static Scanner sc = new Scanner(System.in);
	
	public int maxsize;
	public Object [] stackArray;
	public int top;
	
	public MyStack(int size) {
		maxsize = size;
		stackArray = new Object[maxsize];
		top = -1;
	}
	
	public boolean full(){
		return (top == maxsize-1);
	}
	
	public boolean empty() {
		return(top == -1);
	}
	public Object peek() {
		return stackArray[top];
	}
	
	public void push(Object theObject) {
		if(!full()) {
			top++;
			stackArray[top] = theObject;
		}
	} 
	public Object pop() {
		if(!empty()) {
			return stackArray[top--];
		}else {
			return "the stack is empty";
		}
	}
	
	Object [] toArray() {
		int j=0;
		Object[] array = new Object[top+1];
		for(int i=top;i>=0;i--) {
			array[j] = stackArray[i];
			j++;
		}
		return array;
	}
	
	public MyStack rand() {
		int a = top+1;
		Object[] array = new Object[a];
		Object[] array1 = new Object[a];
		for(int i=0;i<a;i++) {
			array[i]=stackArray[i];
		}
		for(int i=0;i<a;i++) {
			int x=(int)(Math.random()*(a-1-i));
			array1[i]=array[x];
			array[x]=array[a-1-i];
		}
		MyStack randStack = new MyStack(a);
		for(int i=0;i<a;i++) {
			randStack.push(array1[i]);
		}
		return randStack;
	}
	
	public MyStack unique() {
		Object uni;
		int c;
		MyStack newStack = new MyStack(10);
		int a = top+1;
		
		for(int i=1; i<=a; i++) {
		uni = pop();
			
			c = 0;
			
			for(int j=0; j<top + 1; j++) {
				if(stackArray[j] == uni) {
					c += 1;
				}
			}
			if(c == 0) {
				newStack.push(uni);
			}
			
		}
		return newStack;
	}
	public MyStack addrang(Object[] num, int ind) {
		Object add;
		
		int a = top+1;
//		Object[] array = new Object[a];
		MyStack Stack = new MyStack(10);
		for(int i=1; i<=a; i++) {
			add = pop();
			Stack.push(add);
		}
		for(int i=0;i<ind;i++) {
			Stack.push(num[i]);
		
		}
		return Stack;
	}
	public Object[] Array() {
		int a = top+1;
		Object[] Array = new Object[a];
		for(int i=0; i<a;i++) {
			Array[i]=stackArray[i];
		}
		
		return Array;
	}
	
	public static void main(String [] args) {
		MyStack s = new MyStack(10);
		
		s.push(9);
		s.push(8);
		s.push(0);
		s.push(8);
		
		System.out.println("ta songoltoo oruulna uu???");
		System.out.println("1. toArray()\n 2. rand()\n 3. unique()\n 4. addrang()\n 9. Songoltuud\n");
		int input = sc.nextInt();
		
		try {
			while(input != 0) {
				switch(input) {
				case 1:
					Object[] array = s.toArray();
					System.out.println("toArray: ");
					for(int i=0;i<array.length;i++) {
						System.out.print(array[i] + " ");
					}
					break;
				case 2:
					MyStack randStack = s.rand();
					System.out.println("rand(): ");
					
					while(!randStack.empty()) {
						System.out.print(randStack.pop() + " ");
					}
					break;
				case 3:
					MyStack uniqueStack = s.unique();
					System.out.println("Unique: ");
					
					while(!uniqueStack.empty()) {
						System.out.print(uniqueStack.pop() + " ");
					}
					break;
				case 4:
					System.out.println("addRang: ");
					System.out.println("ta heden too oruulah ve??");
					int index= sc.nextInt();
					Integer number[] = new Integer[index];
					System.out.println("toogoo oruulna uu???");
					for(int i=0; i<index; i++) {
						number[i] = sc.nextInt();
					}
					MyStack addStack = s.addrang(number, index);
					while(!addStack.empty()) {
						System.out.print(addStack.pop() + " ");
					}
					break;
				
					
					
				case 9:
					System.out.println("Songoltuud:\n" + "1. toArray()\n 2. rand()\n 3. Unique()\n 4. addRang()\n 5. toArray()\n 9. Songoltuud\n");
				default:
					System.out.println("ta songoltoo zov oruulna uu??");
				}
				System.out.println("\n tanii songolt: ");
				input = sc.nextInt();
			}
			System.out.println("System ends:");
			sc.close();
		}catch(Exception e) {
			System.out.println("aldaa" + e);
			main(args);
		}
	}
}