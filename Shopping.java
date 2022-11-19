public class Shopping{
public static void main(String args[]){
          String name = "AISWARYA";
		  char code = 'A';
		  int quantity = 7;
		  int price = 50;
		  int total = price * quantity;
		  double discount;
		  double total_price;
	if(total > 2000){
	           discount = 10.0/100 * total;
			   }
	     else{
		         discount = 5.0/100 * total;
			  }
		total_price = total - discount;
		System.out.println(total_price);
		}
		}
		
		  