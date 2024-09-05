package prog.test.practices;


/*
  1
  2 3
  4 5 6
  7 8 9 10
  11 12 13 14 15
   row = 1> 4

   column : 1 : 1
            2 : 2


 */
public class PrintNumberWithRightAngleTriangle {

    public static void main(String[] args) {


        int rows = 5;
        int count = 1;
        //rows

        for (int i = 0; i < rows; i++) {

            //column
            for(int j =0;j<=i; j++){

                System.out.print(" "+count);
                ++count;

            }
          //New Line

            System.out.println();

        }


    }
}