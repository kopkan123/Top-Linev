package Domaha2;
import java.util.Scanner;
public class Domm1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел в последовательности: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Введите числа последовательности:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        boolean posl = true;
        for (int i = 1; i < n; i++) {
            if (nums[i] <= nums[i - 1]) {
                posl = false;
                break;
            }
        }
        if (posl) {
            System.out.println("Последовательность чисел является возрастающей");
        } else {
            System.out.println("Последовательность чисел не является возрастающей");
        }
    }
}
