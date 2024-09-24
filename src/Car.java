public class Car extends Vehicle{
    @Override
    void accelerate()
    {
        System.out.println("Can accelerate fast");
    }

    @Override
    void stop()
    {
        System.out.println("3 sec to stop");
    }

    @Override
    void start()
    {
        System.out.println("open the car get inside starts the engine and drive");
    }
}
