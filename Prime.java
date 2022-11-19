public class Prime
{
public static void main(String args[])
{
int x,input=50,temp=0;
for(x=1;x<=50;x++)
{
      if(input%x==0)
	    { 
		       System.out.println(x);
		    }
			temp++;
}
     if(temp==2)
	 System.out.println("\nPRIME");
	 else
	 System.out.println("\nNOT PRIME");
}
}

			   