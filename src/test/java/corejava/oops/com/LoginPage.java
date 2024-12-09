package corejava.oops.com;

public class LoginPage extends Page{
    @Override
    void title() {
        System.out.println("Login Page :Title");
    }

    @Override
    void url() {
        System.out.println("Login Page Url");
    }

    public void doLogin(String uname, String pwd){
        System.out.println("Indivual method of Lohgin Class");

    }

}
