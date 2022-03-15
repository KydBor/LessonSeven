public class LessonSeven {
    public static void main(String[] args){

        Human Vasya = new Human("Vasya", "Popov");
        Vasya.describeHumanInfo();
        System.out.println("====================");
        Client Petya = new Client("Petya", "Pupkin", 25);
        Petya.describeHumanInfo();
        System.out.println("====================");
        OfficeMan officeMan = new OfficeMan("Vovka", "The best", "galera");
        officeMan.describeHumanInfo();
    }
}
