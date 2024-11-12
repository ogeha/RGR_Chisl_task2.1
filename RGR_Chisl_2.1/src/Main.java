import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> x =  new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        x.add(scanner.nextDouble());
        x.add(scanner.nextDouble());
        ArrayList<Double> y =  new ArrayList<Double>();
        for (int i = 0; i < 2; i++){
            y.add(1 / (x.get(i) + 4));
        }
        int h = 1;
        int s = h/2;
        double Integri = h * ((y.get(0) + y.get(1)) / 2);
        System.out.println(Integri);
        double Integri2 = s * ((y.get(0) + y.get(1)) / 2);
        System.out.println(Integri2);
        double Runge = (Integri - Integri2) / 3;
        System.out.println(Runge);
    }
}