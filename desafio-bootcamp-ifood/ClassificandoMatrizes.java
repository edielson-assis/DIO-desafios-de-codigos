import java.util.Scanner;

public class ClassificandoMatrizes {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            moveParesImpares(nums);

            for (int num : nums) {
                System.out.println(num);
            }
        }
    }

    static int[] moveParesImpares(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) { 
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        System.out.println();
        return nums;
    }
}