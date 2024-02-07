import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x, y, sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value:");
        x = scanner.nextInt();

        System.out.println("enter value2:");
        y = scanner.nextInt();
        sum = x / y;
        System.out.println("sum is: " + sum);

    }
}