public class primerange
{
public static void main(String args[])
{
     int x,y,count=0,z=0;
	 for(y=2;y<=20;y++)
	 {
		 count = 0;
	   for(x=2;x<=y/2;x++)
	   {
	       if(y%x==0) 
		   {
		       count++;
			}
		}
	
	  if(count==0)
	  {
		  if(z%2==0)
		  {
		System.out.print(y+" ");
	       }
	  z++;
	 }
	 
}
}
}

