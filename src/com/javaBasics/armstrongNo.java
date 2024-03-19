import java.util.Scanner;
public class armstrongNo{
    static boolean isArmstrong(int num) {
        int originalNum, remainder, result = 0, n = 0;
        originalNum = num;

        while (originalNum != 0) {
            originalNum /= 10;
            ++n;
        }

        originalNum = num;

        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
            originalNum /= 10;
        }

        return result == num;
    }

    public static void main(String[] args) {
        int start, end;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        start = scanner.nextInt();
        System.out.print("Enter the ending number: ");
        end = scanner.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();

}}