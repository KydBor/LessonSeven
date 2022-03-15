public class Human {
    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void describeHumanInfo(){
        System.out.println("Моё имя - " + firstName);
        System.out.println("Мооя фамилия - " + lastName);
    }

}
