package prog.test.practices;

public class FibonacciSeries {


    /*0, 1, 1, 2, 3, 5, 8, 13,21

      a1=0, a2=1;

      a1=a2;

      a2=feb;


    */
    public static void main(String[] args) {
        int a1=0;
        int a2=1;
        int  feb= 0;
        for(int i=1; i<6; i++) {
            feb = a1 + a2;
            a1=a2;
            a2=feb;
            System.out.print(a2+" ");
            System.out.print(feb+" ");
        }
    }
}
