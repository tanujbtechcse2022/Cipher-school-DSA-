abstract class Car{
    abstract void accelerate();
    abstract void brake();
}
abstract class polo extends Car{
    void accelerate(){
        System.out.println("car is accelerated");
    }
}
class Bmw extends polo{
    void brake(){
        System.out.println("brake is applied");
    }
}
public class Lecture11{

    public static void main(String[] args) {
        Bmw a1=new Bmw();
        a1.brake();
        a1.accelerate();

    }
}
