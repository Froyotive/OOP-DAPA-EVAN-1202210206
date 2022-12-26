import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculation calculation = new Calculation();
        double radius,side,area,phi;
        System.out.println("==Menu Program==\n1. Square\n2. Circle\n3. Trapezoid");
        System.out.print("\nSelect menu : ");
        menu = input.nextInt();

        do{
            try{
                switch (menu){
                    case 1:
                        System.out.println("Enter the length of the side of the square : ");
                        break;
                    case 2:
                        System.out.println("Enter the radius of the circle : ");
                        break;
                    case 3:
                        System.out.println("Enter the side of the base of the trapezoid :");
                        System.out.println("Enter the upper side of the trapezoid :");
                        System.out.println("Enter the height of the trapezoid :");
                        break;
                    case 0:
                        System.out.println("Menu not found");
                    default:
                        System.out.println();("");

                        continue;
                }
                repeat = ;
            } catch () {}
        } while();
        scanner.close()

    }
}