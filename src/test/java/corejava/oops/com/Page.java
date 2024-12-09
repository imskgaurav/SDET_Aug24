package corejava.oops.com;

public abstract class Page {

    abstract  void title();
    abstract  void url();

    public void displayLogo(){

        System.out.println("Page -Display Logo");
    }

    public void displayUserInfo(){

        System.out.println("-- User info");
    }
}
