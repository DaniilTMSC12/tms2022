public class Engine {
    private boolean isEngineWork;
    private final String DIESEL = "DIESEL";
    private final String BENZIN = "BENZIN";


    public boolean startEngine() {
        System.out.println("Двигатель запустился...");
        return isEngineWork = true;

    }


    public boolean stopEngine() {
        System.out.println("Двигатель заглушился...");
        return isEngineWork = false;
    }

    public boolean isEngineWork() {
        return isEngineWork;
    }
}
