package corejava.oops.com;

public class staticTest {
  /*staticConcept*/
    // bb, ccc, aaa, 100
    static
    {
        System.out.println("bb");
    }

    public static void main(String[] args) {

        {
            System.out.println("ccc");  //  c
            System.out.println(staticConcept.i); //  a , i=100;
        }


    }
}
