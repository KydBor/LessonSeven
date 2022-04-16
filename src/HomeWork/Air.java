package HomeWork;

public class Air extends Transport {
    private int wingspan;
    private int minrunwaylength;

    public Air(int power, int maxspeed, int weight, String carmodel, int wingspan, int minrunwaylength) {
        super(power, maxspeed, weight, carmodel);
        this.wingspan = wingspan;
        this.minrunwaylength = minrunwaylength;
    }

    @Override
    public void describeTransportInfo() {
        super.describeTransportInfo();
        System.out.print("Размах крыльев - " + wingspan + "; " + "Минимальная длина взлётно-посадочной полосы для взлёта - " + minrunwaylength);
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinrunwaylength() {
        return minrunwaylength;
    }

    public void setMinrunwaylength(int minrunwaylength) {
        this.minrunwaylength = minrunwaylength;
    }
}
