class Solution {
    public void rotateArr(int arr[], int d) {
        // code here
        int n=arr.length;
        d=d%n;
        reverse(arr, 0,d-1);
        reverse(arr, d,n-1);
        reverse(arr, 0,n-1);
    }
        public void swap(int ar[], int a, int b){
            int temp=ar[a];
            ar[a]=ar[b];
            ar[b]=temp;
        }
        public void reverse(int arr[], int s, int l){
            int st=s, la=l;
            while(st<=la){
                swap(arr, st, la);
                st++;
                la--;
            }
        }
}