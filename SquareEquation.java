import java.util.Scanner;


/**
 * Created by sbacho on 08.06.2017.
 */
public class SquareEquation {
    private double a;
    private double b;
    private double c;
    Scanner scanner = new Scanner(System.in);

    public void setA() {
        while (true) {
            System.out.println("Please enter \"a\" coefficient of the equation:");
            String a = scanner.nextLine();
            if (SquareEquation.checkInput(a)) {
                this.a = Double.parseDouble(a);
                break;
            } else {
                System.out.println("Please enter a number");

            }
        }
    }

    public void setB() {
        while (true) {
            System.out.println("Please enter \"b\" coefficient of the equation:");
            String b = scanner.nextLine();
            if (SquareEquation.checkInput(b)) {
                this.b = Double.parseDouble(b);
                break;
            } else {
                System.out.println("Please enter a number");

            }
        }
    }

    public void setC() {
        while (true) {
            System.out.println("Please enter \"c\" coefficient of the equation:");
            String c = scanner.nextLine();
            if (SquareEquation.checkInput(c)) {
                this.c = Double.parseDouble(c);
                break;
            } else {
                System.out.println("Please enter a number");

            }
        }
    }

    protected void solution() {
            double d = b * b - 4 * (a * c);
            double x1;
            double x2;

            if (d > 0) {
                x1 = (-b - Math.sqrt(d)) / (2 * a);
                x2 = (-b + Math.sqrt(d)) / (2 * a);
                System.out.println("Solution one is " + x1);
                System.out.println("Solution two is " + x2);
            } else if (d == 0) {
                x1 = -b / (2 * a);
                System.out.println("The only solution is " + x1);
            } else {
                System.out.println("Solution does not exist");
            }
            }
    public static boolean checkInput(String string) {
        if (string == null || string.length() == 0) {
            return false;
        }
        int i =0;
        if (string.charAt(0) =='-') {
            if(string.length() == 1) {
                return false;
            }
            i =1;
        }
        char c;
        for(; i<string.length() ; i++) {
            c = string.charAt(i);
            if (!(c >= '0' && c <= '9')){
                return false;
            }
        }
        return true;
    }


    }
