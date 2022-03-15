public class OfficeMan extends Human{
    private String company;

    public OfficeMan(String firstName, String lastName, String company) {
        super(firstName, lastName);
        this.company = company;
    }

    @Override
    public void describeHumanInfo() {
        super.describeHumanInfo();
        System.out.println("Моё место работы - " + company);
    }
}
