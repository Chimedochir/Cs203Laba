package Biedaalt2;
import java.util.*;
import utilities.*;

public  class MyList<G> implements LinearList<G> {
	protected int [] element;  
    protected int size; 
    public MyList(int initialCapacity)
    {
       if (initialCapacity < 1)
          throw new IllegalArgumentException
                ("initialCapacity must be >= 1");
       // size has the default initial value of 0
       element = new int [initialCapacity];
    }
    public MyList()
    {// use default capacity of 10
       this(10);
    }
    public boolean isEmpty()
    {return size == 0;}
    public int size()
    {return size;}

    void checkIndex(int index)
    {
       if (index < 0 || index >= size)
          throw new IndexOutOfBoundsException
                ("index = " + index + "  size = " + size);
    }
    public int get(int index)
    {
       checkIndex(index);
       return element[index];
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
    public String toString()
    {
       StringBuffer s = new StringBuffer("["); 
    
       // put elements into the buffer
       for (int i = 0; i < size; i++)
          if (element[i] == 0)
             s.append("null, ");
          else
             s.append(element[i] + ", ");
    
       if (size > 0)
          s.delete(s.length() - 2, s.length());  // remove last ", "
    
       s.append("]");
    
       // create equivalent String
       return new String(s);
    }
    public static void main(String [] args)
    {
     
       LinearList x = new MyList();
    
       // test size
       System.out.println("Initial size is " + x.size());
    
       // test isEmpty
       if (x.isEmpty())
          System.out.println("The list is empty");
       else System.out.println("The list is not empty");
    
       // test put
       x.add(0, new Integer(2));
       x.add(1, new Integer(6));
       x.add(0, new Integer(1));
       x.add(2, new Integer(4));
       System.out.println("List size is " + x.size());
       System.out.println("The list is " + x);
       
       // test indexOf
       int index = x.indexOf(new Integer(4));
       if (index < 0)
          System.out.println("4 not found");
       else System.out.println("The index of 4 is " + index);
    
       index = x.indexOf(new Integer(3));
       if (index < 0)
          System.out.println("3 not found");
       else System.out.println("The index of 3 is " + index);
    
       // test get
       System.out.println("Element at 0 is " + x.get(0));
       System.out.println("Element at 3 is " + x.get(3));
    
       // test remove
       System.out.println(x.remove(1) + " removed");
       System.out.println("The list is " + x);
       System.out.println(x.remove(2) + " removed");
       System.out.println("The list is " + x);
    
       if (x.isEmpty())
          System.out.println("The list is empty");
       else System.out.println("The list is not empty");
    
       System.out.println("List size is " + x.size());
    }
	
	
	public void add(int nextInt) {
		// TODO Auto-generated method stub
		
	}
	
	public void removeOdd() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public G get(G index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public G indexOf(G theElement) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public G remove(G index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void add(G index, G theElement) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
