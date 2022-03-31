package Biedaalt2;

public interface LinearList<G>
{
   public boolean isEmpty();
   public int size();
   public int get(int index);
   public int indexOf(int theElement);
   public int remove(int index);
   public void add(int index, int theElement);
   public String toString();
}
