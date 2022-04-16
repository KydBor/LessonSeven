package HomeWork;

import java.util.Scanner;

public class Passenger extends Ground{
    private Scanner scanner = new Scanner(System.in);
    private String carbody;
    private int number;



    public Passenger( int power, int maxspeed, int weight, String carmodel,int numberofwheels, double fuelconsumption, String carbody, int number){
        super(power, maxspeed, weight, carmodel, numberofwheels, fuelconsumption);
        this.carbody = carbody;
        this.number = number;
    }

    @Override
    public void describeTransportInfo() {
        super.describeTransportInfo();
        System.out.print("Тип кузова - " + carbody + "; " + "Количество пассажиров - " + number + ".\n ");
    }

}