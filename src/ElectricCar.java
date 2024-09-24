public class ElectricCar extends Car{
    @Override
    void accelerate()
    {
        System.out.println("Can't accelerate fast as car, must accelerate slowly to save battery");
    }
}
