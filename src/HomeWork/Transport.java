package HomeWork;

public class Transport {
    private int power;
    private int maxspeed;
    private int weight;
    private String carmodel;

    public Transport(int power, int maxspeed, int weight, String carmodel){
        this.power = power;
        this.maxspeed = maxspeed;
        this.weight = weight;
        this.carmodel = carmodel;
    }

    public void describeTransportInfo(){
        System.out.print("Мощность - " + power + "л.c.; " +
                "Максимальная скорость - " + maxspeed + "км/ч; " +
                "Масса - " + weight + "кг; " +
                "Марка транспорта - " + carmodel + "; ");
    }

    public String getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }
}
