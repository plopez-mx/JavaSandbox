package com.agile.thought.interview.projects.jsandbox.part1;

class MyNonPublicClass {
    private String var1;

    public MyNonPublicClass() {
        this.var1 = "var1 initializaed from default constructor.";
        System.out.println("MyNonPublicClass instance");
    }

    public MyNonPublicClass(String var1) {
        this.var1 = var1;
        System.out.println("MyNonPublicClass instance");
    }

    static MyNonPublicClass.MyInnerClass2 getMyInnerClass2Instance() {
        return new MyNonPublicClass().new MyInnerClass2();
    }

    static class MyStaticInnerClass1 {

        MyStaticInnerClass1() {
            System.out.println("MyStaticInnerClass1 instance");
        }

        String getMethod1() {
            return "getMethod1";
        }
    }

    abstract class MyAbstractInnerClass1 {
        abstract String getMethod1();
        abstract Integer getMethod2();
        String getMethod3(){
            return "Value from getMethod3";
        }
    }

    class MyInnerClass2 extends MyAbstractInnerClass1{

        String getMethod1() {
            return "Value from getMethod1";
        }

        Integer getMethod2() {
            return new Integer(1);
        }

        String getMethod3() {
            return var1;
        }

        String getMethod4() {
            class MyLocalInnerClass1 {
                String getMethod4() {
                    return var1 + ", getMethod4 from LocalInnerClass1";
                }
            }
            return new MyLocalInnerClass1().getMethod4();
        }
    }

    private interface MyInterface {
        String getInterfaceMethod1();
        String getInterfaceMethod2();
    }

    class MyInnerClass3 implements MyInterface {

        @Override
        public String getInterfaceMethod1() {
            return "Value from getInterfaceMethod1";
        }

        @Override
        public String getInterfaceMethod2() {
            return "Value from getInterfaceMethod2";
        }
    }
}

interface MyPackageInterface {
    void method1();
    void method2();
    static void method3() {
        System.out.println("from MyPackageInterface.method3");
    }
}

class MyNonPublicClass2 implements MyPackageInterface {

    MyNonPublicClass2(){
        MyPackageInterface.method3();
    }

    @Override
    public void method1() {
        System.out.println("from MyNonPublicClass2.method1");
    }

    @Override
    public void method2() {
        System.out.println("from MyNonPublicClass2.method2");
    }

    public static void main(String[] args) {
        System.out.println("from Main method in MyNonPublicClass2");
        System.out.println("Calling static method interface");
    }
}

class MyNonPublicClass3 {

    abstract class MyAbstractClass3 {
        abstract String getMethod1();
    }

    interface MyPackageInterface2 {
        String getMethod1();
    }

    String getMethod1() {
        MyAbstractClass3 var1 = new MyAbstractClass3() {
            String getMethod1() {
                return "Value from Anonymous class MyAbstractClass3.getMethod1";
            }
        };
        return var1.getMethod1();
    }

    String getMethod2() {
        MyPackageInterface2 var1 = new MyPackageInterface2() {
            @Override
            public String getMethod1() {
                return "Value from Anonymous class MyPackageInterface2.getMethod1";
            }
        };
        return var1.getMethod1();
    }
}