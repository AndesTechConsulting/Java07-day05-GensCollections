package org.andestech.learning.rfb18;



class A{

    int data = 0;

    static{

        System.out.println("A class loaded...");
    }
}

public class Main {

    public void trySwap(int a, int b){
        int c = a;
        a = b; b = c;

    }

    public void trySwap(A a, A b){
        A c = a;
        a = b; b = c;

    }

    public static void overA(A b){
       b.data = 77;
       //....
       //...

    }

    public static void main(String[] args) throws InterruptedException {

        // Class.forName(package org.andestech.learning.rfb18.A);

        System.out.println("Hi!!");
        Thread.sleep(2000);
        //
        //

        A a = new A();
        System.out.println("data: " + a.data);
        overA(a);
        System.out.println("data: " + a.data);


        System.out.println("Hi after 2 seconds!!");

       // Class.forName("org.andestech.learning.rfb18.B");

    }
}
