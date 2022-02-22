package com.agile.thought.interview.projects.jsandbox.part1;

public class MyPublicClass {
    public static void main(String[] args) {
        System.out.println("My Public class instance.");

        MyNonPublicClass.MyInnerClass2 var1 = MyNonPublicClass.getMyInnerClass2Instance();
        MyNonPublicClass.MyInnerClass2 var2 = new MyNonPublicClass().new MyInnerClass2();

        System.out.println(var1.getMethod3());
        System.out.println(var2.getMethod3());

        System.out.println(new MyNonPublicClass().new MyInnerClass2().getMethod1());
        System.out.println(new MyNonPublicClass().new MyInnerClass2().getMethod3());
        System.out.println(new MyNonPublicClass.MyStaticInnerClass1().getMethod1());

        System.out.println(new MyNonPublicClass().new MyInnerClass2().getMethod3());
        System.out.println(new MyNonPublicClass("var1 Initialized with method parameter").new MyInnerClass2().getMethod3());

        System.out.println(new MyNonPublicClass().new MyInnerClass2().getMethod4());
        System.out.println(new MyNonPublicClass().new MyInnerClass3().getInterfaceMethod1());
        System.out.println(new MyNonPublicClass().new MyInnerClass3().getInterfaceMethod2());

        System.out.println(new MyNonPublicClass3().getMethod1());
        System.out.println(new MyNonPublicClass3().getMethod2());

    }
}
