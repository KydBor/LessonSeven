package HomeWork;

public class Ground extends Transport{
    private int numberofwheels;
    private double fuelconsumption;

    public Ground(int power, int maxspeed, int weight, String carmodel, int numberofwheels, double fuelconsumption) {
        super(power, maxspeed, weight, carmodel);
        this.numberofwheels = numberofwheels;
        this.fuelconsumption = fuelconsumption;
    }

    @Override
    public void describeTransportInfo() {
        super.describeTransportInfo();
        System.out.print("количество колёс - " + numberofwheels + "; " + "Расход топлива - " + fuelconsumption + "л/100км; ");
    }

    public int getNumberofwheels() {
        return numberofwheels;
    }

    public void setNumberofwheels(int numberofwheels) {
        this.numberofwheels = numberofwheels;
    }

    public double getFuelconsumption() {
        return fuelconsumption;
    }

    public void setFuelconsumption(double fuelconsumption) {
        this.fuelconsumption = fuelconsumption;
    }
}
