public abstract class MotorTransport extends WhilledTransport{
    public MotorTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Обслуживание двигателя");
    }
}
