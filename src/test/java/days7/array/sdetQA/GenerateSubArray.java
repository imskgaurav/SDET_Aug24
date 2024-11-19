package days7.array.sdetQA;

//https://www.youtube.com/watch?v=9kdHxplyl5I&list=PLgUwDviBIf0q7vrFA_HEWcqRqMpCXzYAL
public class GenerateSubArray {


    public static void main(String[] args) {
       int  arr [] = new int[]{3, 5, 7, 9, 11};
       //Iterate Loop from o to length-1 ==>i
        //Inner Loop for j : which start from i to n-1;

        for(int i =0 ; i<arr.length; i++){

            for(int j =i+1; j<arr.length; j++){

                System.out.println("Subarry is:+" +arr[i] + " " +arr[j]);
            }
        }



    }

}
