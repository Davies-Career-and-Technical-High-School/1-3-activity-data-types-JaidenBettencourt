import java.util.Scanner;

class Question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter two numbers, one at a time.");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        System.out.print(num2 + " " +num1);
    }
}