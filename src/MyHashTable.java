import dataStructures.HashTable;

public class MyHashTable extends HashTable{

	public MyHashTable(int theDivisor) {
		super(theDivisor);
		// TODO Auto-generated constructor stub
	}
    public Object updateElement(Object theKey, Object theElement) {
    	Object elementToUpdate=null;
    	elementToUpdate = this.put(theKey, theElement);
    	
    	return elementToUpdate;
    }
    public Object updateKey(Object theKey, Object theNewKey)
    {
    	Object oldKey = theKey;
    	int i=search(theKey);
    	Object oldElement=get(theKey);
    	table[i]=null;
    	this.put(theNewKey, oldElement);
		return oldKey;
    	
    }
    public void delete(Object theKey) {
    int i=search(theKey);
 divisor--;
   
    	
    		
    }	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MyHashTable ht= new MyHashTable(11);
   
    ht.put(new Integer(80), new Integer(90));
    ht.put(new Integer(40), new Integer(40));
    ht.put(new Integer(65), new Integer(65));
   ht.output();
    System.out.println();
    ht.updateElement(80, 50);
    ht.output();
    
   
  System.out.println("Delete hiih");
     ht.delete(40);
     ht.output();
     System.out.println("updateKey");
     ht.updateKey(80,81);
    ht.output();
	}

}
