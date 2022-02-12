public class Main {
    public static void main(String[] args) {
        Car car = new Car(new Engine(), new Fueltank());
        car.getFuelInTank();
        car.fillCar();
        car.startCar();
        car.rideOnCar();
        car.showMileage();
        car.stopCar();
        car.rideOnCar();


    }
}
