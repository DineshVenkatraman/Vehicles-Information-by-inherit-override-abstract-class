abstract class vehicle
{
    abstract int noofwheel();

    abstract boolean isBrake();

}
class car extends vehicle
{
    int noofwheel()
    {
        System.out.println("Car has wheels.");
        return 4;
    }
    boolean isBrake()
    {
        System.out.println("Car has Brake.");
        return true;
    }
}
class bike extends vehicle
{
    int noofwheel()
    {
        System.out.println("Bike has wheels.");
        return 2;
    }
    boolean isBrake()
    {
        System.out.println("Bike has Brake.");
        return true;
    }
}

public class inheritoverrideabstract {
    public static void main(String[] args)
    {
        vehicle v=new car();
        System.out.println(v.noofwheel());
        System.out.println(v.isBrake());
        v=new bike();
        System.out.println(v.noofwheel());
        System.out.println(v.isBrake());

    }
}
