import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println("Integer Value = " + a);

        double b = sc.nextDouble();
        System.out.println("Double Value = " + b);

        boolean c = sc.nextBoolean();
        System.out.println("Boolean Value = " + c);

        char d = sc.next().charAt(0);
        sc.nextLine(); 
        System.out.println("Char Value = " + d);

        String e = sc.nextLine();
        System.out.println("String Value = " + e);

        sc.close();
    }
}