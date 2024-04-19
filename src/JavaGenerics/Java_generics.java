package JavaGenerics;

// Generics provide type safety . so that what ever type of object is made it will only accept tha value .

// generics are type of parameters
class MyGenerics<T1, T2>{

        int num  ;
        private T1 t1;
        private T2 t2;

    public MyGenerics(int num, T1 t1, T2 t2) {
        this.num = num;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}


public class Java_generics {

    public static void main(String[] args) {

        MyGenerics <String,Integer> mg = new MyGenerics(555,"MyString",666);

        String str = mg.getT1();   // this to print the String input
        System.out.println(str);

        Integer int1 = mg.getT2();  // this is to print Integer input .
        System.out.println(int1);

        System.out.println(str+" "+int1);  // print both input


        MyGenerics<String,Integer> mg1 = new MyGenerics<>(5,"sdsdsd",888);

        mg=mg1;

    }
}
