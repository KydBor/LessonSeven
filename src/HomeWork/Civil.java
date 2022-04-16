package HomeWork;

public class Civil extends Air {
    private int numberofpassengers;
    private boolean availabilityofbusiness;

    public Civil(int power, int maxspeed, int weight, String carmodel, int wingspan, int minrunwaylength, int numberofpassengers, boolean availabilityofbusiness) {
        super(power, maxspeed, weight, carmodel, wingspan, minrunwaylength);
        this.numberofpassengers = numberofpassengers;
        this.availabilityofbusiness = availabilityofbusiness;
    }

    @Override
    public void describeTransportInfo() {
        super.describeTransportInfo();
        System.out.print("Кол-во пассажиров - " + numberofpassengers + "; " + "Наличие бизнес класса - " + availabilityofbusiness + ".\n ");
    }
}
