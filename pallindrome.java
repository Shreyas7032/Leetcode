class Solution
{
    public boolean isPalindrome(int x)
    {
        if(x<0)
        {
            return false;
        }
        else
        {
            int n=x;
            int num=0;
            while(n>0)
            {
                int i=n%10;
                num=num*10+i;
                n/=10;
            }
            if(num==x)
            {
                return true;
            }
            return false;
        }
    }       
    
}