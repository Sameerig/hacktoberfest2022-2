class Solution {
    public int trap(int[] a) {
        int ans=0;
        int l=0;
        int r=a.length-1;
        int leftsum=0;
        int rightsum=0;
        while(l<r){
            if(a[l]<=a[r]){
                 if(leftsum<a[l]){
                    leftsum=a[l];
                }else{
                    ans+=(leftsum-a[l]);
                }
                l++;   
            }else{
                if(a[r] > rightsum) rightsum = a[r];
				else ans += (rightsum-a[r]);
				r--;
            }   
        }
        return ans;
    }
       
}
