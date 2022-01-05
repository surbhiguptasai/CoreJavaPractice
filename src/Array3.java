public class Array3 {
    public static void main(String[] args) {
        int nums[] = {12, 13, 24, 35, 78, 99, 24, 66, 40, 12, 84};
        for (int i=0; i< nums.length; i++){
           for (int j=i+1; j< nums.length; j++){
               if(nums[i]==nums[j]){
                   System.out.println(nums[i]+" is duplicate.");
               }
           }
        }
    }
}
