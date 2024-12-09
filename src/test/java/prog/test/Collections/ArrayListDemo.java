package prog.test.Collections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;

public class ArrayListDemo {


    public static void main(String[] args) {
        //Check all inbuild function of    ArrayList
        ArrayList al = new ArrayList();
        al.add(10); al.add('A'); al.add("MUMBAI");
        al.add('A');
        System.out.println(al);
        al.remove(0);
        al.add(3, true);
        System.out.println(al);
        al.add("JAVA");
        System.out.println(al);

        //ALL Collection classes implement : Serializable  and Clonable inteface
        //Arraylist implement RandomAccess as well as

        ArrayList l1 = new ArrayList();

        System.out.println(l1 instanceof Serializable);
        System.out.println(l1 instanceof Cloneable);
        System.out.println(l1 instanceof RandomAccess);

    }
}
