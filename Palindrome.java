class Solution {
    public boolean isPalindrome(int x) {
        // 121
        // 121/10=12   rem=1
        // 12/10 =1    rem=2
        // 1/10=0  rem=1
        // 0/10=0   STOP    rem=0
        
        if(x<0)
        {
            return false;
        }

        long reversed=0;
        long temp=x;
        while(temp !=0 )
        {
            
            int rem=(int) (temp%10);
            reversed=reversed * 10 +rem;
            temp=temp/10;
        }
        return (reversed==x);
    }
}
