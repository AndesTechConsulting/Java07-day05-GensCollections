package org.andestech.learning.rfb18;

class Datas{
    String name;

}

class ClassB<T extends Number> {

    private T data;

    ClassB() {
        data = null;
    }

    ClassB(T data) {
        this.setData(data);
    }

    public String getInfo()
    {return getData().getClass().getName(); }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}


class ClassA<T> {

    private T data;


    ClassA(T data) {
        this.setData(data);
       // T[] arr;
       // arr = new T[333];
    }

    public String getInfo()
    {return getData().getClass().getName(); }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

public class MainGens {

    public static void main(String[] args)
    {

        Short sh1 = 12; short sh2 = 12;
        //sh1.

        ClassB<Double> b1 = new ClassB<Double>(111.0);

        ClassB b2 = new ClassB();
        b2.setData(111);

        //(double)b2

        ClassA<Datas> a = new ClassA<Datas>(new Datas());
        ClassA<Integer> a2 = new ClassA<>(1);

        Datas d = a.getData();

        System.out.println(a.getInfo());

    }
}
