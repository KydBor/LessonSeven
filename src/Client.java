public class Client extends Human {
//класс наследуется от Human с помощью команды extends
    private int age;

    public Client(String firstName, String lastName, int age){
        super(firstName, lastName); //возвращает ссылку на класс объекта
        this.age = age;
    }

    //ALT+INSERT - override Methods там находятся все методы
    @Override
    public void describeHumanInfo() {
        super.describeHumanInfo();// просто вызов нашего родительского метода
        //когда переопределем метод то уже будет действовать этот изменнёный
        System.out.println("Мой возраст - " + age);
    }
}
