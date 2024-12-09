package prog.test.practices;

public class CommonCharacterAmong3Words {
    static String s1= "oops";
     static String s2 = "python";
     static  String s3 = "polymorphism";

    public static void main(String[] args) {
     // Iterate  the Longest String //
          String com = "";
          for ( char c :s3.toCharArray()){

          if((s1.indexOf(c)!=-1)&& (s2.indexOf(c)!=-1) && (s3.indexOf(c)!=-1)){
              System.out.println("Common Char is :"+c);
              //If u wish to add unique Char only
                  com = com + c;
          }

          }
        System.out.print("All Common Char:"+com);
    }



}
