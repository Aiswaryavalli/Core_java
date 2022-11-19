public class Employee{
public static void main(String args[]){
          String ename = "AISWARYA";
		  int eno = 234;
		  int esalary = 20000;
		  double dearnessallowances = 10/100*esalary;
		  double ta = 15/100*esalary;
		  double hra = 11/100*esalary;
		  double fa = 5/100*esalary;
		  double totalsalary = esalary+dearnessallowances+ta+hra+fa;
		  double gst = 18.0/100*totalsalary+ta+hra+fa;
		  double pf = 13.0/100*totalsalary;
		  double grosssalary = totalsalary-gst+pf;
		  System.out.println(ename);
		  System.out.println(eno);
		  System.out.println(esalary);
		  System.out.println(totalsalary);
		  System.out.println(grosssalary);
		  }
		 }
		 
		  