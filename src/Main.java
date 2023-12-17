public class Main {
    public static void main(String[] args) {

        ServiceStation serviceStation = new ServiceStation();
        Bicycle bicycle = new Bicycle("Titan",2);
        Car car = new Car("BMW", 4);
        Truck truck = new Truck("MAZ", 8);

        serviceStation.servise(bicycle);
        System.out.println("-----");
        serviceStation.servise(car);
        System.out.println("-----");
        serviceStation.servise(truck);

    }


}