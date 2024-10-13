package prog.test.practices;

public class TriangularNumber {


    //1, 3, 6, 10, 15, 21==> first add 2,3, 4, 5, 6
  //https://www.instagram.com/p/CBcr1EPA3KK/?img_index=1

    public static void main(String[] args) {

        int n =0;
        for (int i =1;i<=8; i++ ){
             int m = (n+i);
            System.out.print(" "+m+",");
            n=m;
        }

     

    }



}
