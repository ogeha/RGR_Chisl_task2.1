import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> x =  new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        x.add(scanner.nextDouble());
        x.add(scanner.nextDouble());
        ArrayList<Double> y_h =  new ArrayList<Double>();
        ArrayList<Double> y_s = new ArrayList();
        double h = 1;
        double s = h/2;
        for (int i = 0; i < 2; i++){
            y_h.add(1 / (x.get(i) + 4));
        }
        for (int i = 0; i < 2; i++){
            y_s.add(1 / (x.get(i) + 4));
            y_s.add(1 / ((x.get(i)+s) + 4));
        }
        System.out.println("y с шагом в 1:"+ " " + y_h);
        System.out.println("y с шагом в 0,5:"+ " " + y_s);
        double Integral1 = h * ((y_h.get(0) + y_h.get(1)) / 2);
        System.out.println("Интеграл с шагом в 1:" + " " + Integral1);
        double Integral2 = s * ((y_s.get(0) + y_s.get(2)) / 2 + y_s.get(1));
        System.out.println("Интеграл с шагом в 0,5:" + " " + Integral2);
        double Runge = (Integral1 - Integral2) / 3;
        System.out.println("Рунге:" + " " + Runge);
    }
}