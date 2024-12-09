package corejava.oops.com;

public class Emp {
    int id;
    String name;
    Emp(int i,String n){
        id = i;
        name = n;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        Emp e1 = new Emp(123,"abc");
        e1.display();
        System.out.print("****");
        //Emp e2 = new Emp(e1);
        Emp e2 = new Emp(567,"xyz");
        e2 =e1;
        e2.display();
    }
}
