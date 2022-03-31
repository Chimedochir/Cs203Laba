import java.util.*;

import dataStructures.HashTable;


public class MyHash extends HashTable {
	public MyHash(int theDivisor) {
		super(theDivisor);
		// TODO Auto-generated constructor stub
	}
	public Object add(int cd, String strName) {
		Object elementToAdd = null;
		elementToAdd = this.put(cd, strName);
		return elementToAdd;
	}
	public void remove(int strCode) {
		Object oldKey = get((Object)strCode);
		if(oldKey != null) {
			put(strCode, null);
		}
	}
	public Object search_code(int strCode) {
		Object key;
		int i = search(strCode);
		return i;
	}
	
	public Object updateCode(String oldCode, String newCode) {
		Object elementToUpdate = null;
		int oldKey = Integer.parseInt(oldCode.substring(8, 10));
		int newKey = Integer.parseInt(newCode.substring(8, 10));
		int m = search(oldKey);
		String old = get(m).toString();
		put(oldKey, null);
		String newCo = old.replace(oldCode, newCode);
		elementToUpdate = this.put(newKey, newCo);
		return elementToUpdate;
	}
	public Object updateName(String oldCode, String newName) {
		Object elementToUpdate = null;
		int oldKey = Integer.parseInt(oldCode.substring(8, 10));
		int m = search(oldKey);
		String old = get(m).toString();
		String[] a = get(m).toString().split(" ");
		put(oldKey, null);
		String newCo = old.replace(a[1], newName);
		elementToUpdate = this.put(oldKey, newCo);
		return elementToUpdate;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHash ht = new MyHash(26);
		Scanner input = new Scanner(System.in);
		
		System.out.println("хэдэн сурагчийн мэдээлэл оруулах вэ?");
		int num = input.nextInt();
		System.out.println("оруулна уу?");
		for(int i=0;i<num;i++){
			String code = input.next();
			
			String stu_name = input.next();
			String a = code + " " + stu_name;
			int k = Integer.parseInt(code.substring(8, 10));
			ht.put(k, a);
		}

		System.out.println("1.add\n2.remove\n3.view\n4.search\n5.updateCode\n6.updateName");
		int dugaar = input.nextInt();
		while(dugaar != 0) {
			switch(dugaar) {
			case 1:
				System.out.println("----------------------------------------------");
				System.out.println("1.оюутаны код нэрийг хийнэ үү?");
				String code = input.next();
				
				String stu_name = input.next();
				String a = code + " " + stu_name;
				int cd = Integer.parseInt(code.substring(8, 10));
				ht.add(cd, a);
				ht.output();
				break;
			case 2:
				System.out.println("----------------------------------------------");
				System.out.println("2.оюутаны код нэрийг хийнэ үү?");
				String code1 = input.next();
				
				String stu_name1 = input.next();
				String a1 = code1 + " " + stu_name1;
				int cd1 = Integer.parseInt(code1.substring(8, 10));
				ht.remove(cd1);
				ht.output();
				break;
			case 3:
				System.out.println("----------------------------------------------");
				ht.output();
				break;
			case 4:
				System.out.println("----------------------------------------------");
				System.out.println("4.оюутаны кодийг хийнэ үү?");
				String code2 = input.next();
				int cd3 = Integer.parseInt(code2.substring(8, 10));
				System.out.println(ht.search_code(cd3) + "дах " + "element дээр байна");
				break;
			case 5:
				System.out.println("----------------------------------------------");
				System.out.println("5.оюутаны хуучин код болон шинэ код нэрийг оруулна уу?");
				String oldCode = input.next();
				String newCode  = input.next();
				ht.updateCode(oldCode, newCode);
				ht.output();
				break;
			case 6:
				System.out.println("----------------------------------------------");
				System.out.println("6.оюутаны кодыг болон шинэ оюутаны нэрийг оруулна уу?");
				String oldCode1 = input.next();
				String newName = input.next();
				
				ht.updateName(oldCode1, newName);
				ht.output();
				break;
			default:
				System.out.println("та зөв сонголтоо хийнэ үү?\n" + "сонголтоо хархаар бол 9-ийг өгнө үү?");
			}
			System.out.println("1.add\n2.remove\n3.view\n4.search\n5.updateCode\n6.updateName");
			System.out.println("\n таны сонголт: ");
			dugaar = input.nextInt();
		}
		
	}

}