//Method overriding
/*
class Parent{
    void fun(){
        System.out.println("Hi I'm A");
    }
}
class Child extends Parent{
    void fun(){
        System.out.println("Hi I'm B");
    }
}
public class Lecture9_2{
    public static void main(String[] args){
        Child c=new Child();
        c.fun();
    }
}*/

//Method Overload
class demo{
    void fun(){
        System.out.println("I have no perameters");
    }
    void fun(int a){
        System.out.println("I have 1 parameter a: "+a);
    }
    void fun(int a, int b){
        System.out.println("I have 2 parameters a & b: "+a+", "+b);
    }
    void fun(String s){
        System.out.println("I have a String s: "+s);
    }
}
public class Lecture9_2{
    public static void main(String[] args){
        demo obj = new demo();
        obj.fun();
        obj.fun(5);
        obj.fun(10, 20);
        obj.fun("Hi There");
        
        
        //Best example of overloading is println() or print()
        System.out.println(5);
        System.out.println("abc");
        System.out.println(5.06);
    }
}
