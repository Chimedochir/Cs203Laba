
//B200910005
import java.util.*;


import dataStructures.Chain;

public class MyChain extends Chain {

	public MyChain() {
		super();
	}
	
	public MyChain(int initialCapacity) {
		super(initialCapacity);
	}
	public Object[] toArray() {
		Object[] x = new Object[this.size()];
		for(int i=0; i<this.size();i++)
			x[i] = get(i);
				return x;
	}

	//addRange хийх үйлдэлүүд
	public void addRange(Object[] unio, int size) {
		int s = size();
			for(int i=0; i<size; i++) {
				add(i+s, new Integer((int)unio[i]));
			}
	}
	
	//Union хийх үйлдэлүүд
	public MyChain union(MyChain chain) {
		MyChain result = new MyChain();
		for(int i=0;i<this.size;i++) {
			if(result.indexOf(this.get(i)) ==-1) {
				result.add(i, this.get(i));
			}
		}
		for(int i=0;i<chain.size;i++) {
			if(result.indexOf(chain.get(i)) == -1) {
				result.add(i, chain.get(i));
			}
		}
		return result;
				}
	public MyChain intersection(MyChain chain) {
		MyChain inter = new MyChain();
		MyChain intersection = new MyChain();
		for(int i=0;i<this.size;i++) {
			if(inter.indexOf(this.get(i)) == -1) {
				inter.add(inter.size, this.get(i));
				
			}
		}
		for(int i=0;i<inter.size;i++) {
			for(int j=0;j<chain.size;j++) {
				if(inter.get(i).equals(chain.get(j))) {
					if(intersection.indexOf(inter.get(i)) == -1) {
						intersection.add(intersection.size, inter.get(i));
				}
				}
			}
			}
		return intersection;
		}
		
	public static void main(String [] args){
		int i;
		MyChain x = new MyChain();
		MyChain newChain = new MyChain();
		MyChain newCh = new MyChain();
		  x.add(0, new Integer(2));
	      x.add(1, new Integer(6));
	      x.add(2, new Integer(1));
	      x.add(3, new Integer(4));
	     
		System.out.println("1. main chain\n 2. toArray\n 3. addRange\n 4. Union\n 5. intersection\n 9. songoltuud");  
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		try {
			
			while(input != 0) {
					int index;
					switch(input) {
					case 1:
						System.out.println("main chain" + x);
						break;
					case 2:
						Object array[] = x.toArray();
						for(i=0; i<x.size(); i++) 
							System.out.print(array[i] + " ");
						break;
					case 3:	
						System.out.println("toonuudaa oruulaad 0-iin toog ogch duusgana uu??");
						Integer uni[] = new Integer[20];
						int j = 0;
						uni[j] = sc.nextInt();
						while(uni[j] != 0) {
							j++;
							uni[j] = sc.nextInt();
						}
						x.addRange(uni,j);
						System.out.println("union toonuud" + x);
						break;
					case 4:
						System.out.println("ta heden too oruulah ve");
						index = sc.nextInt();
						if(index>0) {
							System.out.println("ta toogoo oruulna uu");
							for(i=0;i<index;i++) {
								newChain.add(i,  sc.nextInt());
							}
							System.out.println(x.union(newChain)+ "union successful");
						}
						break;
					case 5:
						System.out.println("ta heden too oruulah ve");
						index = sc.nextInt();
						if(index>0) {
							System.out.println("ta toogoo oruulna uu");
							for(i=0;i<index;i++) {
								newCh.add(i,  sc.nextInt());
							}
							System.out.println(x.intersection(newCh)+ "intersection successful");
						}
						break;
					case 9:
						System.out.println("songoltuud:\n" + "1.Main Chain\n2.toArray()\n3addRange()\n4Union()\n5intersection()\n");
					default:
						System.out.println("ta songoltoo zov oruulne uu\n" + "songoltoo harah bol 9-iig darna uu?");
					}
					System.out.println("\n tanii songolt: ");
					input = sc.nextInt();
				}
				System.out.println("System ends:");
				sc.close();
		}catch(Exception e) {
			System.out.println("input aldaa garlaa"+e);
			main(args);
		}
		
	   }
	
	
}