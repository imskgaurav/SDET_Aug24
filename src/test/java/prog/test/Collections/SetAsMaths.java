package prog.test.Collections;

import java.util.*;

public class SetAsMaths {

    public static void main(String[] args) {
        //Intersection of Two SET :
        ///Let set1 = [1, 3, 2, 4, 8, 9, 0] and set2 = [1, 3, 7, 5, 4, 0, 7, 5].
       // Intersection = [0, 1, 3, 4], Union = [0, 1, 2, 3, 4, 5, 7, 8, 9]
        Set<Integer> s1 = new HashSet<Integer>();
        s1.addAll(Arrays.asList(1, 3, 2, 4, 8, 9, 0));
        Set<Integer> s2 = new HashSet<Integer>();

        s2.addAll(Arrays.asList(1, 3, 7, 5, 4, 0, 7, 5));
        // To find union//
        Set<Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        System.out.println("union 0f two Sets"+union);
        //Intersectiob of Two set
        Set<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);
        //Retains only the elements in this set that are contained in the specified collection (optional operation). In other words, removes from this set all of its elements that are not contained in the specified collection. If the specified collection is also a set, this operation effectively modifies
        // this set so that its value is the intersection of the two sets.
        System.out.println("Intersection of s1 & s2 :"+intersection);
        // Remove ALL for DIFFRERENCE between 2 set
        Set<Integer> diff = new HashSet<>(s1);
        diff.removeAll(s2);

        System.out.println("Difference of Two Set:"+diff);

    }
}
