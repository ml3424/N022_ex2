public class Motorcycle extends Vehicle{
    @Override
    void accelerate()
    {
        System.out.println("Can't accelerate as fast as car");
    }

    @Override
    void stop()
    {
        System.out.println("2.5 sec to stop");
    }

    @Override
    void start()
    {
        System.out.println("get on the motorcycle, starts the engine and drive");
    }
}
