public class extraction
{
public static void main(String args[])
{
         int n=1234,r,add = 0;
		 for( ; n>0;n/=10)
		 {
		       r = n%10;
			   add = add+r;
		  }
		  System.out.println(add);
}
}
