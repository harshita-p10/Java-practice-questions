import java.util.Scanner;

public class fourgreaternum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second num2: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third num3: ");
        int num3 = scanner.nextInt();
        System.out.print("Enter the fourth num4: ");
        int num4 = scanner.nextInt();
        int greatest = num1;
        if (num2 > greatest) {
            greatest = num2;
        }
        if (num3 > greatest) {
            greatest = num3;
        }

        if (num4 > greatest) {
            greatest = num4;
        }
        System.out.println("The greatest number is: " + greatest);
    	}
	}
