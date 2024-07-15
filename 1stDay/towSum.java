import java.util.*;
class solution{
    
        public static int[] twoSum(int[] nums, int target) {
            HashMap<Long,Integer> set=new HashMap();
            int[] ans=new int[2];
            for(int i=0;i<nums.length;i++){
                long sum=(long)(target-nums[i]);
                 System.out.println(sum+" "+set.containsKey(sum)+" "+set.get(sum));
                if(set.containsKey(sum)){
                    ans[0]=set.get(sum);
                    ans[1]=i;
                    System.out.println("hello");
                    break;
                }else{
                    set.put((long)nums[i],i);
                }
            }
            return ans;
        }
    
    public static void main(String[] args){
        int[] a={2,7,11,15};
        System.out.println(twoSum(a,9));
    }
}