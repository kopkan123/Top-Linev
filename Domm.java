package Domaha2;

public class Domm {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 9, 12, 13, 1, 3, -1, 31};
        int sum = 0;
        for (int num : nums) {
            if (prost(num)) {
                sum += num;
            }
        }
        System.out.println("Сумма простых чисел = " + sum);
    } 
    public static boolean prost(int num) {
        for (int i = 2; i < Math.sqrt(num); i++) {
           if(num % i == 0){
            return false;
           }
        }
        return true;
    }
}
