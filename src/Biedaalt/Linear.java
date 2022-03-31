package Biedaalt;

import java.util.Scanner;

import dataStructures.Queue;

public class Linear{
	
    public static void main(String args[]) {
    
    	Scanner sc = new Scanner(System.in);
    	Queue<Integer> list = new Queue<>();
		 
		 list.enqueue(7);
		 list.enqueue(6);
		 list.enqueue(5);
		 System.out.println("1. size\n 2. empty\n3. add\n4. remove\n5. peek\n6. view\n7. poll\n8. head\n");
		 int output = sc.nextInt();
		 
		try {
			while(output != 0) {
				int index;
				 
				 switch(output) {
				 case 1:
					 System.out.println(list.size());
					 break;
				 case 2:
					 System.out.println(list.empty());
					 break;
				 case 3:
					 System.out.println("та хэдийн тоо оруулах вэ?");
					 int a = sc.nextInt();
					 list.enqueue(a);
					 break;
				 case 4:
					 list.dequeue();
					 break;
				 case 5:
					 System.out.println(list.peek()); 
					 break;
				 case 6:
					 System.out.println(list.toString()); 
					 break;
				 case 7:
					 System.out.println(list.poll());
					 break;
				 case 8:
					 System.out.println(list.head());
					 break;
				 case 9: 
					 System.out.println("сонголтууд:\n" + "1. size\\n 2. empty\\n3. add\\n4. remove\\n5. peek\\n6. view\\n7. poll\\n8. head\\n");
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
		  
    }}