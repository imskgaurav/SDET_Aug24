package prog.test.practices;

public class NullEx{
public static void main(String[] args) {
    String s1 = null;
    String s2 = null;
    System.out.print(s1==s2);
    //System.out.print("Compare Null :"+s1.equals(s2));
    String str = "b'Zoot!'";
    for (char c : str.toCharArray()) {
        System.out.println("Char val is :"+c);
        System.out.println("Int value is: " +(int)c);
    }


}

}