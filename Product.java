class Product{
public static void main(String args[]){
       String name = "AISWARYA";
	   char code = 'A';
	   int quantity = 10;
	   int price = 100;
	   int total = price * quantity;
	   double discount = 0;
	   double total_price;
	   if(total<=1000)
	   {
	   discount = total * 10.0/100;
	   }
	   total_price= total - discount;
	   System.out.println(total_price);
	   System.out.println(discount);
	   }
	   }
	   
	   
	   