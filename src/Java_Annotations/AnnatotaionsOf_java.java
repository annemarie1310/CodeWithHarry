package Java_Annotations;

/*
Annotations : -
used to provide extra information about a program , Annotations provides metadata to class / methods .
Metadata is information about the information .

        Following are some annotations : -

        @Override -> is one of the annotations which shows over-ridden elements in child class .
        @SuppressWarnings -> is used to suppress the generated warnings by the compiler .
        @Deprecated ->  is used to mark outdated(deprecated) methods .
        @Functional Interface -> used to ensure an interface is a functional Interface .
        *) Functional interface is an interface that contains only a single abstract method .
        *) A Functional interface can contains default and static methods which do have an implementation .
 */

/**
 * @codedBy :-pranay
 * @about : Annotations .
 */


@FunctionalInterface      // means two methods are not allowed .
interface  myFunctionalInterface {
    void thismethod();
//    void thismethod2();

}

class phone {
    @Deprecated                   // so we have declared this function as deprecated so this will not work .
     public int sum (int a ,int b)
    {
        return a+b;
    }

}
public class AnnatotaionsOf_java {

    public static void main(String[] args) {

        @SuppressWarnings("Deprecated")         // so here we have suppressed the warning of deprecated so it will not show the warning of deprecation.

        phone p1 =new phone();
        p1.sum(5,8);


    }
}
