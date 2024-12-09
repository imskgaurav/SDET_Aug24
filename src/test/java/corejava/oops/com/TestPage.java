package corejava.oops.com;

public class TestPage {
    public static void main(String[] args) {
        String uname= "shashi";
        LoginPage lp = new LoginPage();
        lp.url();
        lp.title();
        lp.doLogin(uname, "pass");

        lp.displayLogo();
        lp.displayUserInfo();
    }
}
