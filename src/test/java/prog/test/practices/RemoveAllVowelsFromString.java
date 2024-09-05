package prog.test.practices;

public class RemoveAllVowelsFromString {
    public static void main(String[] args) {
        String s = "prepinsta";
        String withOutVowels = s.replaceAll("[aeiou]", "");
        System.out.print(withOutVowels);
    }
}