package HomeWork;

public class Truck extends Ground {
    private int loadcapacity;

    public Truck(int power, int maxspeed, int weight, String carmodel, int numberofwheels, double fuelconsumption, int loadcapacity) {
        super(power, maxspeed, weight, carmodel, numberofwheels, fuelconsumption);
        this.loadcapacity = loadcapacity;
    }

    @Override
    public void describeTransportInfo() {
        super.describeTransportInfo();
        System.out.print("Грузоподъёмность - " + loadcapacity + ".\n ");
    }
}
