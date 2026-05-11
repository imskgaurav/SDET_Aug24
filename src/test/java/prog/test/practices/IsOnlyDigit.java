package prog.test.practices;

public class IsOnlyDigit {
    public static void main(String[] args) {


        String s = "0123456789";
        IsOnlyDigit isOnlyDigit = new IsOnlyDigit();
        boolean result = isOnlyDigit.isOnlyDigit(s);
        System.out.println(result);
    }

    public boolean IsContainsOnlyDigit(String str) {
        for(char c:str.toCharArray()){
            if(!Character.isDigit(c)){
                return false;
            }
        }
       return true;
    }

    public boolean isOnlyDigit(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;

            }
        }
        return true;
    }
}



