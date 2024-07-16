/**
 * removeDuplFrSoArr
 */
public class removeDuplFrSoArr {
    public static int removeDuplicates(int[] nums) {
    
        int i=0;
        int j=1;
        while(j<nums.length){
         if(nums[i]!=nums[j]){
             nums[i+1]=nums[j];
             ++i;
         }
         j++;
        }
        return i+1;
     }
public static void main(String[] args) {
    int[] a={2,2,5,5,5,7,11,11,12,12,15};
    System.out.println(removeDuplicates(a));
}    
}