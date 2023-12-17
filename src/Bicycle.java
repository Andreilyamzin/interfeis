public class Bicycle extends WhilledTransport{

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void servise() {
    updateTyre();
    }
}