class Solution {
    public void reverseInGroups(int[] arr, int k) {
        // code here
        //sixe of the array
        int n=arr.length;
        
        for(int s=0;s<n;s=s+k){
            //Two pointer to swap the elements by groups
            int i=s;
            int j=Math.min(s+k-1,n-1);//chooses the ending position which is not
            //exceeding the size of the array
            
            while(i<j){//rotating the group
            
            //Swap the elements
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
                //updating the starting and ending positions of the group
                i++;
                j--;
            }
            
        }
        
        
        
        
        
    }
}