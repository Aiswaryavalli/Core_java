public class Student1{
public static void main(String args[]){
       String name = "AISWARYA";
	   int rollno = 02;
	   int s1=10,s2 = 10,s3 = 14;
	   int total;
	   total = s1+s2+s3;
	   double percentage = total/60*100;
	   int scholarship;
	   int fee = 350;
	 if(percentage<60)
	   {
	         scholarship = 1000;
			}
			else{
			      scholarship = 2000;
				  }
			fee = fee - scholarship;
			System.out.println(fee);
			}
			}
			
			