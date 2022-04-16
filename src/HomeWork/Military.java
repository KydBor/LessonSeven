package HomeWork;

public class Military extends Air {
    private boolean ejection;
    private int missilesonboard;

    public Military(int power, int maxspeed, int weight, String carmodel, int wingspan, int minrunwaylength, boolean ejection, int missilesonboard) {
        super(power, maxspeed, weight, carmodel, wingspan, minrunwaylength);
        this.ejection = ejection;
        this.missilesonboard = missilesonboard;
    }

    @Override
    public void describeTransportInfo() {
        super.describeTransportInfo();
        System.out.print("Наличие системы катапультирования - " + ejection + "; " + "Кол-во ракет на борту - " + missilesonboard + ".\n ");
    }
}
