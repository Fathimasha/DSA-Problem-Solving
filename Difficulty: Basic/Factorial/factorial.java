class Solution {
    static int factorial(int n) {
        // code here
        int fac=1;
        for(int i=1;i<=n;i++)
        {
            fac=fac*i;
        }
        return fac;
    }
}