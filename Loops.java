import java.util.Scanner;

public class Loops {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 1;
        
        for(int i = 0; i <= 10; ++i) {
            System.out.println("Enter your number:");
            int number = scanner.nextInt();
            sum += number;
        }
        
        double average = sum / 10;
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average );
        System.out.println("Multiplication: " + (sum * 10));
        System.out.println("Modulus:" + (sum %  10));
    }
}
