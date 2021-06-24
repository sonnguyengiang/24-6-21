package linkedlist;

import arraylist.Product;

import java.util.Comparator;

public class SortDown implements Comparator<arraylist.Product> {
    @Override
    public int compare(arraylist.Product o1, Product o2) {
        if (o1.getPice() > o2.getPice()) return -1;
        else if (o1.getPice() == o2.getPice())  return 0;
        else return 1;
    }
}
