import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        int a = sc.nextInt();
        System.out.printf("Square of %d is: %.1f%n", a, (double) (a * a));
        System.out.printf("Cube of %d is: %.1f%n", a, (double) (a * a * a));
        System.out.printf("Square root of %d is: %.2f%n", a, Math.sqrt(a));

      
        int b = sc.nextInt();
        int c = b << 2;
        System.out.println("Left Shift Result: " + c);

       
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int total = n1 + n2 + n3;
        float average = total / 3.0f;

        System.out.println("Total: " + total);
        System.out.printf("Average: %.2f%n", average);
    }
}