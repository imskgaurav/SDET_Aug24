package prog.test.Collections;
import java.util.ArrayList;
public class ArrayListDemo {


    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(10); al.add('A'); al.add("MUMBAI");
        al.add('A');

        System.out.println(al);

        al.remove(0);

        al.add(3, true);

        System.out.println(al);
        al.add("JAVA");

        System.out.println(al);
    }
}
