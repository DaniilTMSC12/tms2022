public class Car {
    private final Engine engine;
    private Fueltank fueltank;
    private int mileage;
    private String name;
    private int age;


    public Car(Engine engine, Fueltank fueltank) {
        this.engine = engine;
        this.fueltank = fueltank;
    }


    public void startCar() {
        if (engine.startEngine() & fueltank.getFuelInTank() > 0) {
            System.out.println("Автомобиль запустился...");
        } else {
            System.out.println("Запустите двигатель или дозаправьте автомобиль!");
        }
    }

    public void rideOnCar() {
        if (engine.isEngineWork()) {
            System.out.println("Катаемся на машине...");
            mileage += 5;


        } else {
            System.out.println("Нельзя ездить на машине! Запустите двигатель!");
        }
    }

    public void stopCar() {
        engine.stopEngine();
        System.out.println("Автомобиль заглушился...");
    }

    public void showMileage() {
        System.out.println("Пробег авто составляет " + mileage + " километров.");
    }

    public void fillCar() {
        System.out.println("Машина заправлена.");
        fueltank.fillFuel();
        System.out.println("Топлива в баке " + fueltank.getFuelInTank() + " литров");
    }

    public void getFuelInTank() {
        System.out.println("Количество топлива в бензобаке " + fueltank.getFuelInTank() + " литров");
    }
}

