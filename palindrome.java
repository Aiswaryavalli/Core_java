public class palindrome
{
public static void main(String args[])
{
    int num=67,r=0,sum=0,y;
	for(y = 1000;y<=100000;y++)
	{
		num = y;
	  sum =0;
	for( ;num>0;num/=10)
	{
	   r = num%10;
	   sum = sum*10+r;
	 }
	     if(sum==y)
		 System.out.println(sum);
   }
		 
}
}

	   