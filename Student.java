public class Student
{
public static void main(String args[])
{
                    String name = "AISWARYA";
					int rollno = 2;
					int s1=20,s2=15,s3=25;
					int total = s1+s2+s3;
		            char section = 'c';
					double percentage = total/60.0*100;
					String status;
					if(percentage>=80)
					{
			                      percentage = 15.0/100*total;
								  status = "firstclass";
								  section = 'A';
					}
					else
					{
					              percentage = 5.0/100*total;
								  status = "secondclass";
								  section = 'B';
					}
					System.out.println(percentage+""+status+""+section);
					         
	}
}
						
						