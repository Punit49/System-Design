package MyPackage2;

import MyPackage.PackageMy;

public class MyPackage2 extends PackageMy {
    MyPackage2(){
        super();
    }

    void show(){
        System.out.println(this.age);
    }
}
