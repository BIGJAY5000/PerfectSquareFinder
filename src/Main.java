import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        double num;
        double sqrt;

        System.out.println("Please enter a number");
        num = scan.nextDouble();
        sqrt = Math.sqrt(num);
        if ((sqrt * sqrt) == num) {
            System.out.println(num + " is a perfect square");
        } else {
            System.out.println(num + " is not a perfect square");
        }
    }
}