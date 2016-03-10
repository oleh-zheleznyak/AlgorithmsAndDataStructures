package Algorithms.Search;

/**
 * Created by oz on 23.02.2016.
 */
public class BinarySearch<T extends Comparable<T>>{

    public Integer Find(T value, T[] array)
        {
            if (array == null) throw new IllegalArgumentException();
            //TODO: check that T is sorted

            Integer I=0;
            int  i=0;

            int hi = array.length -1;
            int low = 0;

            while (hi>low) {
                int mid = (hi-low) / 2 + low;

                if (array[mid].compareTo(value)==0) return mid;
                else  if (array[mid].compareTo(value)>0) hi = mid-1;
               else if (array[mid].compareTo(value)<0) low = mid+1;
            }

            return null;
        }

}
