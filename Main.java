/**
 * Created by sbacho on 05.06.2017.
 */
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        SquareEquation sqr = new SquareEquation();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("ax² +bx +c = 0");
            sqr.setA();
            sqr.setB();
            sqr.setC();
            sqr.solution();

            System.out.println("Type in \"n\" to quit, anything else to continue.");
            String answer = scanner.nextLine();
            if (answer.equals("n")){
                break;
            }

        }
    }
}