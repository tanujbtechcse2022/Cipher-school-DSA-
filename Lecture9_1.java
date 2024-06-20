//public class Lecture9_1{
    // int rollNo;
    //     String name;
    // public static void main(String args[]){
    //     Lecture9_1 s1= new Lecture9_1();
    //     Lecture9_1 s2= new Lecture9_1();
    //     Lecture9_1 s3= new Lecture9_1();
        
    //     s1.name = "Ram";
    //     s1.rollNo = 1;
        
    //     s2.name = "Shyam";
    //     s2.rollNo = 2;
        
    //     s3.name = "Radha";
    //     s3.rollNo = 3;
        
    //     System.out.println(s1.name);
    //     System.out.println(s1.rollNo);
        
    //     System.out.println(s2.name);
    //     System.out.println(s2.rollNo);
        
    //     System.out.println(s3.name);
    //     System.out.println(s3.rollNo);
    // }}



    class shape{
    double pi=3.14;
    double get_square(int r){
        return r*r;
    }
}
class Circle extends shape{
    void area(int r){
        System.out.println(pi*get_square(r));
    }
}
public class Lecture9_1{
    public static void main(String args[]){
        Circle c=new Circle();
        c.area(5);
    }
}


