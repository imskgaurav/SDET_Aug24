package prog.test.practices;

public class StringMethods {

    public static void main(String[] args) {

        String str = " i am a devops Engineer";
        char x=str.charAt(str.length()-1);

        System.out.println(x);
        String ss= String.valueOf(x);
        System.out.println(ss);

        try{

    int a = 7+9;
            System.out.println(a);
        }
        finally {

            System.out.println("Performed OPM");
        }
    }
}
