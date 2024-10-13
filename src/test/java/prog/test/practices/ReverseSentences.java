package prog.test.practices;

public class ReverseSentences {

    public static void main(String[] args) {


        String sen= "Test Automation Central";
         String rev= "";
        String [] words = sen.split(" ");

        for (int i =words.length-1; i>=0; i--){
          rev = rev+words[i]+" ";

        }
        System.out.println(rev);
    }
}
