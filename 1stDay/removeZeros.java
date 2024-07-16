class solutions{
    public static void moveZeroes(int[] nums) {
    
        int index=-1;
        for(int i=0;i<nums.length;i++){
           if(nums[i]==0){
               index=i;
               break;
           }
        }
        if(index==-1)return;
        int j=index+1;
        while(j<nums.length){
           if(nums[j]!=0){
               nums[index]=nums[j];
               nums[j]=0;
               index++;
           }
           ++j;
        }
   
       }
    public static void main(String[] args){
        int[] a={2,7,0,0,0,23,44,5};
        moveZeroes(a);
    }

}