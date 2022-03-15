public class Calculator {
//Калькулятор (с предыдущего занятия). Вам необходимо
//1) Обновить модификаторы доступа (private, publuc)
//2) Создать класс, который будет наследоваться от калькулятора. ExtendedCalculator
//3) Переопределить все методы. В переопределенной логике запрашивать у
// пользователя ввод данных и выводить результат подсчёта

    
    private double a;
    private double b;

    public void sum() {
        System.out.println(a + b);
    }

    public void dif() {
        System.out.println(a - b);
    }

    public void div() {
        System.out.println(a / b);
    }

    public void mult() {
        System.out.println(a * b);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

}
