public class Bicycle extends Vehicle{
    @Override
    void accelerate()
    {
        System.out.println("Can't accelerate as fast as motorcycle");
    }

    @Override
    void stop()
    {
        System.out.println("1.2 sec to stop");
    }

    @Override
    void start()
    {
        System.out.println("get on the bicycle and start");
    }
}