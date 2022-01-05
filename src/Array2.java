public class Array2 {
    public static void main(String[] args) {
        int nums[] = {12, 13, 24, 35, 78, 99, 39};
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
            sum += nums[i];
        }
        System.out.println("Sum = " +sum);
    }
}
