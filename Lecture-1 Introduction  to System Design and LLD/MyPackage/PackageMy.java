package MyPackage;

public class PackageMy {
    public String name;
    protected int age;
    private boolean isAdmin;

    public PackageMy(){
        this.name = "Demo";
        this.age = 18;
    }

    public PackageMy(String name, int age){
        this.name = name;
        this.age = age;
    }
}