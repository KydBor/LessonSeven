import java.util.Scanner;

public class ExtendedCalculator extends Calculator {
    private Scanner scanner = new Scanner(System.in);

        @Override
        public void sum() {
            populateData();
            super.sum();
        }

        @Override
        public void dif() {
            populateData();
            super.dif();
        }

        @Override
        public void div() {
            populateData();
            super.div();
        }

        @Override
        public void mult() {
            populateData();
            super.mult();
        }

        private void populateData() {
            double a = scanner.nextDouble();

            double b = scanner.nextDouble();

            setA(a);
            setB(b);
        }





}
