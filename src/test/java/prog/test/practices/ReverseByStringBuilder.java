package prog.test.practices;

public class ReverseByStringBuilder {

    // hello //  h will go to posistion of o :
    //i is position from front en
    //position of o = 4:   len-1-i;
    //e will go to position of l//
    //position of l = 3;  len-1-i ;
    //https://www.youtube.com/watch?v=ZLDwskEhIFg at time stamp 15:50
    public static void main(String[] args) {
       reverseString("Jadeja");

       String res=revStrWithForLoop("Jadeja");

       System.out.println("Reverse String:"+res);

    }

    public static void reverseString(String input){
        StringBuilder sb = new StringBuilder(input);


       for(int i =0; i<sb.length()/2; i++){
        //Find the index of Front and from Back;
           int front = i;
           int back = sb.length()-i-1;
           System.out.println(i);
           System.out.println(back);
           //FIND the char at Front and Back//
           char frontChar = sb.charAt(front);
           char backChar= sb.charAt(back);
            ///Now set the Front char at Back and vice versa
           sb.setCharAt(front, backChar);
           sb.setCharAt(back, frontChar);

       }

    System.out.println("Reverse is:"+sb);



    }

   public static String  revStrWithForLoop(String str){

        String rev= "";

        if(str!=null& str.length()>=1){

            for(int i =str.length()-1; i>=0; i--){

                rev= rev+str.charAt(i);

                System.out.println(rev);
            }
        }
        else{

            return "";
        }




 return rev;
   }
}
