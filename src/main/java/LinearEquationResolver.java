import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("LinearEquationResolver");
        System.out.println("Given a equation as 'a* x + b = 0,please enter constants");
        float a;
        float b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        a = scanner.nextFloat();
        System.out.println("Enter b");
        b = scanner.nextFloat();
        if (a == 0) {
            System.out.println("No Solution");
        } else if (b == 0) {
            System.out.println("x = 0");
        } else {
            float x = -b/a;
            System.out.println("x = "+ x);
        }
    }
}
