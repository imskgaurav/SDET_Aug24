package org.java.collectionBasics;

import java.util.ArrayList;
import java.util.List;

/*remove(int index)Removes the element at the specified position in this list (optional operation).
*/

/*remove(Object o) : return boolean
Removes the first occurrence of the specified element from this list,
 if it is present (optional operation).
 */
public class List_RemoveFunction {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(0);
        list.add(89);
        System.out.println(list);
        list.remove(Integer.valueOf(89));
        System.out.println(list);


    }
}
