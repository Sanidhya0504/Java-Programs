class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=0;
        int x=0;
        int y=0;
        for( i=0;i<nums.length;i++)
        {
            int temp = nums[i];
            for( j=i+1;j < nums.length;j++)
            {
                if((temp+nums[j])==target)
                {
                   x=i;
                    y=j; 
                }
            }
        }
    int[] a= new int[2];
    a[0]=x;
    a[1]=y;
     return a;
    }
     
}