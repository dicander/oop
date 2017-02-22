import java.util.*;

public class KiloLista {

  private Object[] elements;
  private int pushBackIndex;
  public static final int MAX_SIZE = 1000;

  public static class ListElement implements Comparable<ListElement>{
    public String sortValue;
    public Object value;

    public ListElement(Object element) {
      this.value = element;
      this.sortValue = ""+element;
    }

    public int compareTo(ListElement other) {
      return this.sortValue.compareTo(other.sortValue);
    }


  }

  public KiloLista() {
    elements = new ListElement[MAX_SIZE];
    pushBackIndex = 0;
  }

  /**
    * adds toAdd to the array, unless it it larger than
    * MAX_SIZE. If the array is too large, nothing happens
    */
  public void add(Object toAdd) {
    if(pushBackIndex >= MAX_SIZE) {
      return;
    }
    elements[pushBackIndex++] = new ListElement(toAdd);
  }

  public void sort() {
    Arrays.sort(elements, 0, pushBackIndex);
  }

  public Object[] sortedSequence() {
    Object[] sorted = (Object[])Arrays.copyOfRange(elements, 0, pushBackIndex);
    Arrays.sort(sorted, 0, pushBackIndex);
    Object[] toReturn = new Object[sorted.length];
    for(int i=0; i < sorted.length; ++i){
      toReturn[i]=((ListElement)sorted[i]).value;
    }


    return toReturn;
  }

  public static void main(String[] args) {
    Object name = "StringInObject";
    KiloLista namn = new KiloLista();
    namn.add("Tonima");
    namn.add("Fernando");
    namn.add("Sophia");
    namn.add("Ann");
    //namn.add(1);
    Object[] whatever = namn.sortedSequence();
    for(Object current: whatever) {
      System.out.println(current);
    }

  }

}
