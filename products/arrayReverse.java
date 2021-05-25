import java.io.* ;

class Solution 
{
    public void reverseString(int s[], int start, int end)
    {
        int temp ;
        while(start<end)
        {
            temp = s[start] ;
            s[start] = s[end] ;
            s[end] = temp ;
            start++ ;
            end-- ;
        }
    }
    
    public void printarr(int s[], int size)
    {
        for(int i=0; i<size ;i++)
        {
            System.out.print(s[i] + " ") ;
        }
        System.out.println() ;
    }
}

public static void main(String args[])
{
    s= ["h","e","l","l","o"] ;
    reverseString(s,0,5) ;
    printarr(s,6) ;
}

