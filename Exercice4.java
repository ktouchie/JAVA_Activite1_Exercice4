import java.util.Scanner;
class Exercice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = sc.nextInt();
        System.out.println("Enter y:");
        int y = sc.nextInt();
        System.out.println("Before...");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        int a = x;
        x = y;
        y = a;
        System.out.println("After...");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

	}

}