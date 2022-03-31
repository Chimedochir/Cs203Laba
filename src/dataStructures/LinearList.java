
/** interface for linear lists */

package dataStructures;

public interface LinearList<G>
{
   public boolean isEmpty();
   public int size();
   public G get(int index);
   public int indexOf(Object theElement);
   public G remove(int index);
   public void add(int index, Object theElement);
   public String toString();
}
