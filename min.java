public class min
{
public static void main(String args[])
{
      int n = 3724,r,max = 0 ,min = 0,store = 1;
	  for( ; n>0;n/=10)//3715>0//371>0//37>0
	  {
	       r = n%10;//4//2//7//3
		   if(store>r)//1>4//2>7//7>3
		   {
		         max = r;//
			}
		else
		{
			min = store;//1
			store++;
		}
	  }
	  System.out.println(min);
}
}
